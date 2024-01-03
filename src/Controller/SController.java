package Controller;

import Model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Controller untuk proses terkait jadwal konseling.
 */
public class SController extends Table {
    private Database db = Database.getInstance();
    private User u = User.getInstance();

    /**
     * Menghapus jadwal konseling berdasarkan pilihan pengguna.
     *
     * @param p JPanel yang digunakan sebagai parent untuk pesan dialog.
     * @param ScheduleTable JTable yang berisi data jadwal konseling.
     */
    public void deleteSc(JPanel p, JTable ScheduleTable) {
        int result = JOptionPane.showConfirmDialog(p, "Delete Schedule?", "Counseling Schedule", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        int selectedRowIndex = ScheduleTable.getSelectedRow();

        if (result == JOptionPane.OK_OPTION) {
            if (selectedRowIndex != -1) {
                Object value = ScheduleTable.getValueAt(selectedRowIndex, 0);
                int number = Integer.parseInt(value.toString());
                if (deleteSchedule(number)) {
                    JOptionPane.showMessageDialog(p, "Schedule has been deleted!", "Counseling Schedule", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(p, "Failed to delete schedule!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(p, "No row selected!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            fillTable(ScheduleTable);
        }
    }

    /**
     * Melakukan penghapusan data jadwal konseling dari database.
     *
     * @param scheduleID ID jadwal konseling yang akan dihapus.
     * @return true jika penghapusan berhasil, false jika gagal.
     */
    private boolean deleteSchedule(int scheduleID) {
        try {
            String sql = "DELETE FROM konseling_online.jadwal_konseling WHERE "
                    + "id_jadwal_konseling='" + scheduleID + "';";

            db.update(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Mengisi tabel jadwal konseling dengan data dari database.
     *
     * @param ScheduleTable JTable yang akan diisi dengan data jadwal konseling.
     */
    public void fillTable(JTable ScheduleTable) {
        DefaultTableModel tbModel = new DefaultTableModel() {
            // Override isCellEditable to make all cells non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // Menambahkan kolom-kolom
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

                // Menambahkan data ke model
                tbModel.addRow(new Object[]{ID, rowNum, kon, hari, jam, ml});
                rowNum++;
            }

            // Mengatur model pada ScheduleTable
            ScheduleTable.setModel(tbModel);

            // Menyembunyikan kolom ID (index: 0)
            ScheduleTable.getColumnModel().getColumn(0).setMinWidth(0);
            ScheduleTable.getColumnModel().getColumn(0).setMaxWidth(0);
            ScheduleTable.getColumnModel().getColumn(0).setWidth(0);

            super.resizeColumnWidth(ScheduleTable);
            super.addCopyFunctionality(ScheduleTable);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Mengambil data jadwal konseling dari database.
     *
     * @return ResultSet berisi data jadwal konseling.
     */
    private ResultSet getJadwal() {

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
                    + "WHERE A.id_user = '" + u.getID() + "' ORDER BY A.id_jadwal_konseling;";

            ResultSet resultSet = db.query(sql);

            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
