package Controller;

import Model.Konselor;
import Model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import swing.ProfilePic;
import swing.RoundComboBox;

public class DCController {
    private Database db = Database.getInstance();
    private Konselor k = Konselor.getInstance();
    private User u = User.getInstance();
    private ImageController IC = new ImageController();
    
    public void setCounselor(RoundComboBox boxKonselor, RoundComboBox boxDay,
                             RoundComboBox boxTime, JLabel TitleNameDCP, 
                             JLabel TitleEmailDCP, JLabel TitlePhoneDCP, 
                             JTextArea TitleExpDCP, ProfilePic profilePic){
        String isiK = (String) boxKonselor.getSelectedItem();
        String numericPart = isiK.split("\\.")[0];
        
        if (!numericPart.equals("<Choose Counselor>")){
            boxDay.setEnabled(true);
            String sql = "SELECT * FROM konseling_online.konselor "
                    + "WHERE ID='"+numericPart+"';";
            ResultSet account = db.query(sql);
            try {
                if (account.next()){
                    k.setID(account.getInt("ID"));
                    k.setNama_Lengkap(account.getString("Nama_Lengkap"));
                    k.setEmail(account.getString("Email"));
                    k.setNo_Telp(account.getString("No_Telp"));
                    k.setPengalaman(account.getString("Pengalaman"));                  
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            profilePic.setPic(IC.retrieveImage(Integer.parseInt(numericPart), "konselor"));
        }else{
            reset(boxKonselor, boxDay, boxTime);
            k.setID(-1);
            k.setNama_Lengkap("-");
            k.setEmail("-");
            k.setNo_Telp("-");
            k.setPengalaman("-");
            profilePic.setPic(IC.retrieveImage(1, "defaultpic"));
        } 
        TitleNameDCP.setText(k.getNama_Lengkap());
        TitleEmailDCP.setText(k.getEmail());
        TitlePhoneDCP.setText(k.getNo_Telp());
        TitleExpDCP.setText(k.getPengalaman());
        
        
        
        // Update boxDay
        boxDay.removeAllItems();// hapus seluruh content boxHari
        boxDay.addItem("<Choose Counseling Day>");
        ResultSet account = getHari(k.getID());
        try {
            while(account.next()){
                boxDay.addItem(account.getString("Hari"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }
    
    public void setCounseling(JPanel p, RoundComboBox boxKonselor, 
                              RoundComboBox boxDay, RoundComboBox boxTime){
        String isiK = (String) boxKonselor.getSelectedItem();
        String isiH = (String) boxDay.getSelectedItem();
        String isiJ =(String) boxTime.getSelectedItem();
        
        if (!isiK.equals("<Choose Counselor>")      &&
            !isiH.equals("<Choose Counseling Day>") &&
            !isiJ.equals("<Choose Counseling Time>")){
            int result = JOptionPane.showConfirmDialog(p, "Set Schedule?", "Schedule", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
            if (result == JOptionPane.OK_OPTION){
                doSetSchedule(p, boxKonselor, boxDay, boxTime);
            }
        }else if (isiK.equals("<Choose Counselor>") ){
            JOptionPane.showMessageDialog(p, "Counselor has not been chosen!", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (isiH.equals("<Choose Counseling Day>")){
            JOptionPane.showMessageDialog(p, "Counseling Day has not been chosen!", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (isiJ.equals("<Choose Counseling Time>") ){
            JOptionPane.showMessageDialog(p, "Counseling Time has not been chosen!", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    public void setDay(RoundComboBox boxDay, RoundComboBox boxTime){
        String isiH = (String) ((boxDay.getSelectedItem() != null) ?  boxDay.getSelectedItem(): "<Choose Counseling Day>");
        
        if (!isiH.equals("<Choose Counseling Day>")){
            boxTime.setEnabled(true);
            boxTime.removeAllItems();// hapus seluruh content boxHari
            boxTime.addItem("<Choose Counseling Time>");
            ResultSet account = getWaktu(k.getID(), isiH);
            try {
                while(account.next()){
                    boxTime.addItem(account.getString("Waktu"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else{
            boxTime.setEnabled(false);
            boxTime.setSelectedItem("<Choose Counseling Time>");
        }
    }
    private void doSetSchedule(JPanel p, RoundComboBox boxKonselor, 
                               RoundComboBox boxDay, RoundComboBox boxTime){
        String isiH = (String) boxDay.getSelectedItem();
        String isiJ = (String) boxTime.getSelectedItem();
        int IDHari = 0;
        int IDJam = 0;
        
        String sql = "SELECT * FROM konseling_online.hari_konseling "
                    + "WHERE Hari='"+isiH+"';";
        ResultSet account = db.query(sql);
        
        try {
            if (account.next()){
                IDHari = account.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        sql = "SELECT * FROM konseling_online.waktu_konseling "
                    + "WHERE Waktu='"+isiJ+"';";
        account = db.query(sql);
        
        try {
            if (account.next()){
                IDJam = account.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (insertJadDB(k.getID(), IDHari, IDJam)){
            JOptionPane.showMessageDialog(p, "Schedule successfully addded!", "Schedule", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(p, "Failed to add schedule!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        reset(boxKonselor, boxDay, boxTime);
    }
    
    private boolean insertJadDB(int idk, int idh, int idw){
        try {
            int id_jk = 0;
            String sql = "SELECT id_jadwal_konselor FROM konseling_online.jadwal_konselor WHERE "
                    + "id_konselor='"+idk+"' AND "
                    + "id_hari='"+idh+"' AND "
                    + "id_waktu='"+idw+"';";

            ResultSet resultSet = db.query(sql);
            
            if(resultSet.next()){
                id_jk = resultSet.getInt("id_jadwal_konselor");
                sql = "INSERT INTO konseling_online.jadwal_konseling "
                    + "(id_jadwal_konselor, id_user) "
                    + "VALUES ('"+id_jk+"', '"+u.getID()+"');";
                db.update(sql);
                return true;  
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
        
    private ResultSet getHari(int ID){
        try {
            String sql = "SELECT DISTINCT D.Hari as Hari "
                + "FROM konseling_online.konselor as F "
                + "LEFT JOIN konseling_online.jadwal_konselor as B ON F.ID = B.id_konselor "
                + "LEFT JOIN konseling_online.jadwal_konseling as A ON B.id_jadwal_konselor = A.id_jadwal_konselor "
                + "LEFT JOIN konseling_online.user as C ON C.ID = A.id_user "
                + "LEFT JOIN konseling_online.hari_konseling as D ON D.id = B.id_hari "
                + "LEFT JOIN konseling_online.waktu_konseling as E ON E.id = B.id_waktu "
                + "WHERE F.ID = '"+ID+"' AND A.id_jadwal_konselor IS NULL; ";
            

            ResultSet resultSet = db.query(sql);
            
            return resultSet;  
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private ResultSet getWaktu(int ID, String hari){
        try {
            String sql = "SELECT E.Waktu as Waktu "
            + "FROM konseling_online.konselor as F "
            + "LEFT JOIN konseling_online.jadwal_konselor as B ON F.ID = B.id_konselor "
            + "LEFT JOIN konseling_online.jadwal_konseling as A ON B.id_jadwal_konselor = A.id_jadwal_konselor "
            + "LEFT JOIN konseling_online.hari_konseling as D ON D.id = B.id_hari "
            + "LEFT JOIN konseling_online.waktu_konseling as E ON E.id = B.id_waktu "
            + "WHERE F.ID = '"+ID+"' AND D.Hari = '"+hari+"' AND A.id_jadwal_konselor IS NULL; ";
            

            ResultSet resultSet = db.query(sql);
            
            return resultSet;  
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void reset(RoundComboBox boxKonselor, RoundComboBox boxDay, RoundComboBox boxTime){
        boxKonselor.setSelectedItem("<Choose Counselor>");
        boxDay.setSelectedItem("<Choose Counseling Day>");
        boxTime.setSelectedItem("<Choose Counseling Time>");
        boxDay.setEnabled(false);
        boxTime.setEnabled(false);
    }
}
