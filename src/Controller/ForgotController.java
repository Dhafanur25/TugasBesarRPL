/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import swing.CoolTextField;
import swing.PasswordField;

/**
 *
 * @author dhafa
 */
public class ForgotController {
    private int ID;
    private Database database = Database.getInstance();
    
    public void doF(JPanel p, PasswordField isiPasswordF, CoolTextField isiEmailF, CardLayout cardLayout, JPanel cards){
        ResultSet account = null;
        String pass = isiPasswordF.getText().trim(); 
        String masukan = isiEmailF.getText().trim();
        if(masukan.equals("") ||
            pass.equals("")){
            reset(isiPasswordF, isiEmailF);
            JOptionPane.showMessageDialog(p, "Field cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (pass.length() < 8){
            reset(isiPasswordF, isiEmailF);
            JOptionPane.showMessageDialog(p, "Password must be 8 or more!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean checker = database.check("user","Email", masukan);
        if(checker){
            String sql = "SELECT * FROM konseling_online.user "
                    + "WHERE Email='"+masukan+"';";
            account = database.query(sql);
            try {
                if (account != null && account.next()) {
                    ID = account.getInt("ID");
                } 

            } catch (SQLException e) {
                e.printStackTrace();
            }
            if(updatePass(ID, pass)){
                reset(isiPasswordF, isiEmailF);
                JOptionPane.showMessageDialog(p, "Password has been reset succesfully!", "Reset Password", JOptionPane.INFORMATION_MESSAGE);
                cardLayout.show(cards, "LoginC");
            }else{
                JOptionPane.showMessageDialog(p, "Password has failed to be reset!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(p, "The account doesn't exist!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Helper Methods
    private boolean updatePass(int ID, String pass){
        try {
            String sql = "UPDATE konseling_online.user "
                    + "SET Password='"+pass+"' "
                    + "WHERE ID='"+ID+"';";
            database.update(sql);
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }  
        return false;
    }
    public void reset(PasswordField isiPasswordF, CoolTextField isiEmailF){
        isiPasswordF.setText("");
        isiEmailF.setText("");
    }
}
