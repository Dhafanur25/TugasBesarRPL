package Controller;

import Model.Konselor;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Controller untuk proses terkait jadwal konselor.
 */
public class WKController extends Table {
    private Database db = Database.getInstance();
    private Konselor k = Konselor.getInstance();

    /**
     * Mengisi tabel jadwal konselor dengan data dari database.
     *
     * @param ScheduleTable JTable yang akan diisi dengan data jadwal konselor.
     */
    public void fillTable(JTable ScheduleTable) {
        DefaultTableModel tbModel = (DefaultTableModel) ScheduleTable.getModel();
        tbModel.setRowCount(0);

        ResultSet account = getJadwalKon();
        try {
            while (account.next()) {
                String num = account.getString("No");
                String user = account.getString("Nama_User");
                String hari = account.getString("Hari");
                String jam = account.getString("Waktu");
                String ml = account.getString("Meeting_Link");

                String Data[] = {num, user, hari, jam, ml};

                tbModel.addRow(Data);
            }

            super.resizeColumnWidth(ScheduleTable);
            super.addCopyFunctionality(ScheduleTable);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Mengambil data jadwal konselor dari database.
     *
     * @return ResultSet berisi data jadwal konselor.
     */
    private ResultSet getJadwalKon() {

        try {
            String sql = "SELECT ROW_NUMBER () OVER (ORDER BY B.id_jadwal_konselor) AS No,"
                    + "C.Nama_Lengkap as Nama_User, "
                    + "D.Hari, E.Waktu, "
                    + "F.link_Meet as Meeting_Link "
                    + "FROM (konseling_online.jadwal_konseling as A) "
                    + "JOIN (konseling_online.jadwal_konselor as B) ON B.id_jadwal_konselor = A.id_jadwal_konselor "
                    + "JOIN (konseling_online.`user` as C) ON C.ID = A.id_user "
                    + "JOIN (konseling_online.hari_konseling as D) ON D.id = B.id_hari "
                    + "JOIN (konseling_online.waktu_konseling as E) ON E.id = B.id_waktu "
                    + "JOIN (konseling_online.konselor as F) ON F.ID = B.id_konselor "
                    + "WHERE F.ID = '" + k.getID() + "';";

            ResultSet resultSet = db.query(sql);

            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Melakukan proses keluar (logout) dari akun konselor.
     *
     * @param cards JPanel yang mengandung komponen-komponen yang ditampilkan menggunakan CardLayout.
     * @param cardLayout CardLayout yang digunakan untuk mengganti tampilan antar komponen.
     */
    public void doOut(JPanel cards, CardLayout cardLayout) {
        k.setID(0);
        cardLayout.show(cards, "LoginC");
    }
    
    public void doQuiz(){
        try {
            // Membuat objek URI dengan tautan spreadsheet hasil kuis online user
            URI uri = new URI("https://docs.google.com/spreadsheets/d/1HnaaniShoC2mI7rdtiw58UjRXcyfVhSS3fFI5vU0wfQ/edit?usp=sharing");

            // Membuka browser default untuk mengakses tautan kuis
            Desktop.getDesktop().browse(uri);

        } catch (IOException | URISyntaxException ex) {
            // Menangani IOException atau URISyntaxException dengan mencetak informasi ke konsol
            ex.printStackTrace();
        }
    }
}
