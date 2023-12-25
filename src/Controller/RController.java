package Controller;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import swing.CoolCheckBox;

public class RController {
    private Database database = Database.getInstance();
    public void doReg(JPanel p, String nama, String email, String uName,
                      String pass, CoolCheckBox checR,
                      JTextField[] textFields, JPanel cards, CardLayout cardLayout){
        
        if (checR.isSelected() && 
            !nama.equals("") &&
            database.validateEmail(email) && 
            !uName.equals("")&& 
            !pass.equals("")&&
            pass.length() >= 8) {
            // Insert to database
            if(insertReg(nama, email, uName, pass)){
                
                // Reset fields
                reset(checR, textFields);
                JOptionPane.showMessageDialog(p, "Account registered successfully!", "Register", JOptionPane.INFORMATION_MESSAGE);
                cardLayout.show(cards, "LoginC");
            }else{
                JOptionPane.showMessageDialog(p, "Email/Username has been taken!", "Error", JOptionPane.ERROR_MESSAGE); 
            }
            
            
        }else if(nama.equals("") ||
            email.equals("")     || 
            uName.equals("")  || 
            pass.equals("")){
            JOptionPane.showMessageDialog(p, "Field cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            
        }else if(!database.validateEmail(email)){
            JOptionPane.showMessageDialog(p, "Email is not valid!", "Error", JOptionPane.ERROR_MESSAGE); 
            
        }else if(pass.length() <8){
            JOptionPane.showMessageDialog(p, "Password must be 8 or more!", "Error", JOptionPane.ERROR_MESSAGE); 
            
        }else if (!checR.isSelected()){
            JOptionPane.showMessageDialog(p, "Please agree to terms and conditions!", "Error", JOptionPane.ERROR_MESSAGE);
            
        }  
    }
    private boolean insertReg(String nama, String email, 
        String uName, String pass){
        try {
            if (!database.check("user", "Email", email) && 
                !database.check("user", "Username", uName)){
                String sql = "INSERT INTO konseling_online.user"
                        + " (Nama_Lengkap, Email, Username, Password) "
                        + "VALUES ('"+nama+"', '"+email+"', '"+uName+"', '"+pass+"');";
                database.update(sql);  
                return true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public void reset(CoolCheckBox checR, JTextField[] textFields){
        
        for (JTextField textField : textFields) {
            textField.setText("");
        }
        checR.setSelected(false);
    }

    public void TermsAndCondition(CoolCheckBox checR) {
        addOns.TermsAndConditions panel = new addOns.TermsAndConditions();

        int result = JOptionPane.showOptionDialog(
                null,
                panel,
                "Terms and Conditions",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{"Agree", "Disagree"},
                "Agree");

        if (result == JOptionPane.OK_OPTION) {
            checR.setSelected(true);
        } else {
            checR.setSelected(false);
        }   
    }
}
