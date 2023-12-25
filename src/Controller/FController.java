package Controller;

import Model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import swing.LabelArea;

public class FController {
    private Database db = Database.getInstance();
    private User u = User.getInstance();
    public void doFB(JPanel p, JTextArea isiFB, LabelArea[] cList){
        if (insertFBDB(isiFB.getText())){
            JOptionPane.showMessageDialog(p, "Thank you for your feedback!", "Feedback", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(p, "Failed to post feedback!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        String sql = "SELECT * FROM konseling_online.feedback "
                    + "WHERE id_user='"+u.getID()+"';";
        ResultSet account = db.query(sql);
        try {
            int i = 0; 
            while (account.next() && i < cList.length) {
                cList[i].setText(account.getString("isi_feedback"));
                i++;
            }
            while (i < cList.length) {
                cList[i].setText("");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        isiFB.setText("");
        
    }
    
    private boolean insertFBDB(String isi){ 
        try {
            String sql = "INSERT INTO konseling_online.feedback"
                    + " (id_user, isi_feedback) "
                    + "VALUES ('"+u.getID()+"', '"+isi+"');";

            db.update(sql); 
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
