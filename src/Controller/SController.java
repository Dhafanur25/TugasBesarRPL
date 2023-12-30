package Controller;

import Model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SController extends Table{
    private Database db = Database.getInstance();
    private User u = User.getInstance();
    
    public void deleteSc(JPanel p, JTable ScheduleTable){
        int result = JOptionPane.showConfirmDialog(p, "Delete Schedule?", "Schedule", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        int selectedRowIndex = ScheduleTable.getSelectedRow();
        
        if (result == JOptionPane.OK_OPTION){
            if (selectedRowIndex != -1) {
                Object value = ScheduleTable.getValueAt(selectedRowIndex, 0);
                int number = Integer.parseInt(value.toString());
                if (DeleteSchedule(number)) {
                    JOptionPane.showMessageDialog(p, "Schedule has been deleted!!", "Schedule", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(p, "Failed to delete schedule!", "Error", JOptionPane.ERROR_MESSAGE); 
                }

            } else {
                JOptionPane.showMessageDialog(p, "No row selected!", "Error", JOptionPane.ERROR_MESSAGE); 
            }
            fillTable(ScheduleTable);  
        }
    }
    private boolean DeleteSchedule(int ID_JKon){
        try {
            String sql = "DELETE FROM konseling_online.jadwal_konseling WHERE "
                    + "id_jadwal_konseling='"+ID_JKon+"';";

            db.update(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public void fillTable(JTable ScheduleTable){
        DefaultTableModel tbModel = new DefaultTableModel() {
            // Override isCellEditable to make all cells non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // Add columns
        tbModel.addColumn("ID");
        tbModel.addColumn("No");
        tbModel.addColumn("Nama_Konselor");
        tbModel.addColumn("Hari");
        tbModel.addColumn("Waktu");
        tbModel.addColumn("Meeting_Link");

        ResultSet account = getJadwal();
        int rowNum = 1;
        try {
            while (account.next()) {
                String ID = account.getString("Schedule_ID");
                String kon = account.getString("Nama_Konselor");
                String hari = account.getString("Hari");
                String jam = account.getString("Waktu");
                String ml = account.getString("Meeting_Link");

                // Add data to the model
                tbModel.addRow(new Object[]{ID, rowNum, kon, hari, jam, ml});
                rowNum++;
            }

            // Set model to ScheduleTable
            ScheduleTable.setModel(tbModel);

            // Hide column ID (index: 0)
            ScheduleTable.getColumnModel().getColumn(0).setMinWidth(0);
            ScheduleTable.getColumnModel().getColumn(0).setMaxWidth(0);
            ScheduleTable.getColumnModel().getColumn(0).setWidth(0);

            super.resizeColumnWidth(ScheduleTable);
            super.addCopyFunctionality(ScheduleTable);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private ResultSet getJadwal(){
        
        try {
            String sql = "SELECT A.id_jadwal_konseling as Schedule_ID,"
            + "F.Nama_Lengkap as Nama_Konselor, "
            + "D.Hari, E.Waktu, C.Nama_Lengkap as Nama_user, "
            + "F.link_Meet as Meeting_Link "
            + "FROM (konseling_online.jadwal_konseling as A) "
            + "JOIN (konseling_online.jadwal_konselor as B) ON B.id_jadwal_konselor = A.id_jadwal_konselor "
            + "JOIN (konseling_online.`user` as C) ON C.ID = A.id_user "
            + "JOIN (konseling_online.hari_konseling as D) ON D.id = B.id_hari "
            + "JOIN (konseling_online.waktu_konseling as E) ON E.id = B.id_waktu "
            + "JOIN (konseling_online.konselor as F) ON F.ID = B.id_konselor "
            + "WHERE A.id_user = '"+u.getID()+"' ORDER BY A.id_jadwal_konseling;";

            ResultSet resultSet = db.query(sql);
            
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
