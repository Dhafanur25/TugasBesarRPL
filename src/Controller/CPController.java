package Controller;

import Model.User;
import View.BioUserP;
import View.WelcomeP;
import java.awt.CardLayout;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import swing.RoundTextArea;
import swing.RoundTextField;

public class CPController {
    private Database db = Database.getInstance();
    private String filePath;
    private String temp = null;
    private User u = User.getInstance();
    
    public void doCP(JPanel p, JPanel cards, CardLayout cardLayout,
                     BioUserP BioUserC, WelcomeP WelcomeC, 
                     RoundTextField isiEmailCP, RoundTextField isiUNameCP,
                     RoundTextField isiPassCP, RoundTextField isiNameCP,
                     RoundTextField isiPhoneCP, RoundTextField isiAddressCP,
                     RoundTextArea isiBioCP){
        String passl = null;
        u.setProfile_Pic_Path(db.getDefaults());
        u.setEmail(BioUserC.getTitleEmailBU().getText());
        u.setUsername(BioUserC.getTitleUNameBU().getText());
        
        
        // Check if email is being changed
        if (!isiEmailCP.getText().trim().equals("")){ 
            if (db.validateEmail(isiEmailCP.getText().trim())){ // Check if email is using the correct format
                if(!db.check("user", "Email", isiEmailCP.getText().trim())){// Check if email is taken
                    u.setEmail(isiEmailCP.getText().trim());
                }else{
                    JOptionPane.showMessageDialog(p, "Email has been taken!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }else{
                JOptionPane.showMessageDialog(p, "Email is not valid!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        // Check if uName is being changed
        if (!isiUNameCP.getText().trim().equals("")){
            if(!db.check("user", "Username", isiUNameCP.getText().trim())){// Check if uName is taken
                u.setUsername(isiUNameCP.getText().trim());
            }else{
                JOptionPane.showMessageDialog(p, "Username has been taken!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        // Check if pass is being changed
        if (!isiPassCP.getText().trim().equals("")){
            if(isiPassCP.getText().trim().length() < 8){// Check if password is less than 8
                JOptionPane.showMessageDialog(p, "Password must be 8 or more!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        // Get user data from database
        String sql = "SELECT * FROM konseling_online.user "
                    + "WHERE ID='"+u.getID()+"';";
        ResultSet account = db.query(sql);
        try {
            if (account.next()){
                passl = account.getString("Password");
                temp = account.getString("Profile_Pic_Path");
                u.setProfile_Pic_Path((temp != null) ? temp : db.getDefaults());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        // Change data if the data is being changed
        if (filePath != u.getProfile_Pic_Path() && filePath != null){
            BioUserC.getProfilePicBU().setPic(filePath);
            WelcomeC.getProfilePicW().setPic(filePath);
        }
        u.setNama_Lengkap((!isiNameCP.getText().trim().equals("")) ? isiNameCP.getText().trim(): BioUserC.getTitleNama().getText());
        u.setNo_Telp((!isiPhoneCP.getText().trim().equals("")) ? isiPhoneCP.getText().trim(): BioUserC.getTitlePhoneBU().getText());
        u.setAlamat((!isiAddressCP.getText().trim().equals("")) ? isiAddressCP.getText().trim(): BioUserC.getTitleAddressBU().getText());
        u.setPassword((!isiPassCP.getText().trim().equals("")) ? isiPassCP.getText().trim(): passl);
        u.setBio((!isiBioCP.getText().trim().equals("")) ? isiBioCP.getText().trim(): BioUserC.getTitleBioBU().getText());
        
        // Commit changed data to database
        if(updateCP(u.getNama_Lengkap(), u.getEmail(), u.getUsername(), u.getPassword(), u.getNo_Telp(), u.getAlamat(), u.getBio(), (filePath != null) ? filePath : u.getProfile_Pic_Path())){
            // Change data in BioUser and Welcome
            BioUserC.getTitleNama().setText(u.getNama_Lengkap());
            WelcomeC.getButtonName().setText(u.getNama_Lengkap());
            BioUserC.getTitlePhoneBU().setText(u.getNo_Telp());
            BioUserC.getTitleAddressBU().setText(u.getAlamat());
            BioUserC.getTitleBioBU().setText(u.getBio());
            BioUserC.getTitleUNameBU().setText(u.getUsername());
            BioUserC.getTitleEmailBU().setText(u.getEmail());

            JOptionPane.showMessageDialog(p, "Profile updated successfully!", "Change Profile", JOptionPane.INFORMATION_MESSAGE);
            // Reset all field in ChangeProfile
            reset(isiEmailCP, isiUNameCP, 
                  isiPassCP, isiNameCP, isiPhoneCP,
                  isiAddressCP, isiBioCP);
            
            // Back to BioUser
            cardLayout.show(cards, "BioUserC");
        }else{
            JOptionPane.showMessageDialog(p, "Failed to change profile!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        
   private boolean updateCP(String nama, String email, String uName, 
                   String pass, String phone, String address, String bio, String pp){
        try {
            String sql = "UPDATE konseling_online.user "
                    + "SET Nama_Lengkap='"+nama+"', Email='"+email+"', "
                    + "Username='"+uName+"', Password='"+pass+"', "
                    + "No_Telp='"+phone+"', Alamat='"+address+"', "
                    + "Bio='"+bio+"', Profile_Pic_Path='"+pp+"' "
                    + "WHERE ID='"+u.getID()+"';";
            db.update(sql);
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }  
        return false;
    }
    
    public void reset(RoundTextField isiEmailCP, RoundTextField isiUNameCP,
                      RoundTextField isiPassCP, RoundTextField isiNameCP,
                      RoundTextField isiPhoneCP, RoundTextField isiAddressCP,
                      RoundTextArea isiBioCP){
        isiBioCP.setText("");
        JTextField[] textFields = {isiNameCP, isiEmailCP, isiPhoneCP, isiAddressCP, isiUNameCP, isiPassCP};
        for (JTextField textField : textFields) {
            textField.setText("");
        }
    }

    public void doFileChooser(JPanel p) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = fileChooser.showOpenDialog(p);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            temp = selectedFile.getAbsolutePath();
            filePath = (temp != null) ? temp.replace("\\", "/") : db.getDefaults();   
        }
    }
}
