package Controller;

import Model.Konselor;
import Model.User;
import View.BioUserP;
import View.FeedbackP;
import View.WelcomeKonP;
import View.WelcomeP;
import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import swing.LabelArea;

public class LController {
    private Database db = Database.getInstance();
    private WKController WKC = new WKController();
    private Konselor k = Konselor.getInstance();
    private User u = User.getInstance();
    public void mLogin(JPanel p, String passL, String input,
                       JTextField isiEmailUsernameL, JTextField isiPasswordL,
                       JPanel cards, CardLayout cardLayout,
                       BioUserP BioUserC, WelcomeP WelcomeC, 
                       FeedbackP FeedbackC, WelcomeKonP WelcomeKonC){
        // Run login checker
        int checker = login(input, passL);
        
        // Login accordingly
        if(checker == 1){
            doLoginKon(WelcomeKonC, cards , cardLayout, isiEmailUsernameL, isiPasswordL);
        }else if(checker == 2){
            doLoginUser(BioUserC, WelcomeC, FeedbackC, cards , cardLayout, isiEmailUsernameL, isiPasswordL);
        }else if(input.equals("") ||
                 passL.equals("")){
            JOptionPane.showMessageDialog(p, "Field cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (checker == -1){
            JOptionPane.showMessageDialog(p, "Email/Username doesn't exist!", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(checker == 0){
            JOptionPane.showMessageDialog(p, "Password is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private int login(String masukan, String pass){
        int cek = -1; // Jika username atau email salah
        try {
            // Cek untuk akun konselor dulu
            String sql = "SELECT ID, Email, Password FROM konseling_online.konselor"
                    + " WHERE Email='"+masukan+"';";
            ResultSet resultSet = db.query(sql);
   
            if (resultSet.next()) {
                if (resultSet.getString("Password").equals(pass)){
                    cek = 1; // Jika username/email dan password benar dan masuknya akun konselor
                    k.setID(resultSet.getInt("ID"));
                }else{
                    cek = 0; // Jika password salah
                }
            }else{
                sql = "SELECT ID, Email, Username, Password FROM konseling_online.user"
                    + " WHERE Email='"+masukan+"' OR Username='"+masukan+"';";
                resultSet = db.query(sql);
                if (resultSet.next()) {
                    if (resultSet.getString("Password").equals(pass)){
                        cek = 2; // Jika username/email dan password benar dan masuknya akun user
                        u.setID(resultSet.getInt("ID"));
                    }else{
                        cek = 0; // Jika password salah
                    }
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    
    private void doLoginKon(WelcomeKonP WelcomeKonC, JPanel cards, CardLayout cardLayout,
                            JTextField isiEmailUsernameL, JTextField isiPasswordL){
        String sql = "SELECT * FROM konseling_online.konselor "
                    + "WHERE ID='"+k.getID()+"';";
        ResultSet account = db.query(sql);
        
        try {
            if (account != null && account.next()) {
                String nama = account.getString("Nama_Lengkap");

                WelcomeKonC.getTitleName().setText(nama);
            }
            clearLogin(isiEmailUsernameL, isiPasswordL);

            WKC.fillTable(WelcomeKonC.getScheduleTable());
            cardLayout.show(cards, "WelcomeKonC");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void doLoginUser(BioUserP BioUserC, WelcomeP WelcomeC, FeedbackP FeedbackC,
                             JPanel cards, CardLayout cardLayout,
                             JTextField isiEmailUsernameL, JTextField isiPasswordL){
        String sql = "SELECT * FROM konseling_online.user "
                    + "WHERE ID='"+u.getID()+"';";
        ResultSet account = db.query(sql);
        try {
            if (account != null && account.next()) {
                String nama = account.getString("Nama_Lengkap");
                String email = account.getString("Email");
                String uName = account.getString("Username");
                String noTelp = account.getString("No_Telp");
                String address = account.getString("Alamat");
                String bio = account.getString("Bio");
                String profilePic = account.getString("Profile_Pic_Path");

                WelcomeC.getButtonName().setText(nama);
                WelcomeC.getProfilePicW().setPic((profilePic != null) ? profilePic : db.getDefaults());
                BioUserC.getProfilePicBU().setPic((profilePic != null) ? profilePic : db.getDefaults());
                BioUserC.getTitleNama().setText(nama);
                BioUserC.getTitleEmailBU().setText(email);
                BioUserC.getTitleUNameBU().setText(uName);
                BioUserC.getTitlePhoneBU().setText((noTelp != null) ? noTelp : "-" );
                BioUserC.getTitleAddressBU().setText((address != null) ? address : "-" );
                BioUserC.getTitleBioBU().setText((bio != null) ? bio : "-" );
            } 
            clearLogin(isiEmailUsernameL, isiPasswordL);
            
            cardLayout.show(cards, "WelcomeC");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        LabelArea[] cList = {FeedbackC.getC1(), FeedbackC.getC2(), FeedbackC.getC3(), FeedbackC.getC4(), FeedbackC.getC5()};
        
        sql = "SELECT * FROM konseling_online.feedback "
             + "WHERE id_user='"+u.getID()+"';";
        ResultSet fb = db.query(sql);
        
        try {
            int i = 0; 
            while (fb.next() && i < cList.length) {
                cList[i].setText(fb.getString("isi_feedback"));
                i++;
            }
            while (i < cList.length) {
                cList[i].setText("");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void clearLogin(JTextField isiEmailUsernameL, JTextField isiPasswordL){
        JTextField[] textFields = {isiEmailUsernameL, isiPasswordL};

        for (JTextField textField : textFields) {
            textField.setText("");
        }
    }

}
