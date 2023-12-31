package Controller;

import Model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import swing.LabelArea;

/**
 * Kelas FController merupakan pengontrol untuk operasi terkait feedback pada aplikasi Konseling Online.
 * Kelas ini memiliki metode untuk melakukan posting feedback, memasukkan feedback ke dalam database,
 * dan mengambil feedback pengguna dari database untuk ditampilkan pada antarmuka pengguna.
 *
 */
public class FController {
    // Inisiasi objek Database dan User
    private Database db = Database.getInstance();
    private User u = User.getInstance();

    /**
     * Method untuk melakukan posting feedback.
     *
     * @param p       Panel yang digunakan.
     * @param isiFB   TextArea yang berisi feedback.
     * @param cList   Array dari LabelArea untuk menampilkan feedback sebelumnya.
     */
    public void doFB(JPanel p, JTextArea isiFB, LabelArea[] cList) {
        // Cek apakah feedback tidak kosong
        if (!isiFB.getText().equals("")) {
            // Jika berhasil memasukkan feedback ke database
            if (insertFBDB(isiFB.getText())) {
                JOptionPane.showMessageDialog(p, "Thank you for your feedback!", "Feedback", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(p, "Failed to post feedback!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(p, "Feedback cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Ambil feedback pengguna dari database
        String sql = "SELECT * FROM konseling_online.feedback "
                + "WHERE id_user='" + u.getID() + "';";
        ResultSet account = db.query(sql);
        try {
            int i = 0;
            // Tampilkan feedback pada LabelArea
            while (account.next() && i < cList.length) {
                cList[i].setText(account.getString("isi_feedback"));
                i++;
            }
            // Jika feedback tidak mencukupi, set sisa LabelArea menjadi kosong
            while (i < cList.length) {
                cList[i].setText("");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Reset TextArea feedback menjadi kosong
        isiFB.setText("");
    }

    /**
     * Method untuk memasukkan feedback ke dalam database.
     *
     * @param isi Isi dari feedback yang dimasukkan.
     * @return True jika berhasil, False jika gagal.
     */
    private boolean insertFBDB(String isi) {
        try {
            String sql = "INSERT INTO konseling_online.feedback"
                    + " (id_user, isi_feedback) "
                    + "VALUES ('" + u.getID() + "', '" + isi + "');";

            db.update(sql);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
