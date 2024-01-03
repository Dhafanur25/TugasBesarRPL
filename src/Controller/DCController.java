package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import Model.Konselor;
import Model.User;
import swing.ProfilePic;
import swing.RoundComboBox;
/**
 * Kelas Controller untuk menangani melakukan konseling pengguna dan operasi terkait.
 */
public class DCController {

    // Inisiasi objek
    private ImageController IC = new ImageController();
    private Database db = Database.getInstance();
    private Konselor k = Konselor.getInstance();
    private User u = User.getInstance();

    /**
     * Method utama untuk menetapkan jadwal dengan konselor.
     *
     * @param p         Panel yang digunakan.
     * @param boxKonselor   ComboBox untuk memilih konselor.
     * @param boxDay        ComboBox untuk memilih hari.
     * @param boxTime       ComboBox untuk memilih waktu.
     */
    public void setCounseling(JPanel p, RoundComboBox boxKonselor,
                              RoundComboBox boxDay, RoundComboBox boxTime) {
        // Ambil nilai dari ketiga combobox
        String isiK = (String) boxKonselor.getSelectedItem();
        String isiH = (String) boxDay.getSelectedItem();
        String isiJ = (String) boxTime.getSelectedItem();

        if (!isiK.equals("<Choose Counselor>") &&
                !isiH.equals("<Choose Counseling Day>") &&
                !isiJ.equals("<Choose Counseling Time>")) {
            int result = JOptionPane.showConfirmDialog(p,
                    "Set Schedule?", "Schedule",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (result == JOptionPane.OK_OPTION) {
                doSetSchedule(p, boxKonselor, boxDay, boxTime);
            }

            // Penanganan kesalahan jika salah satu combobox belum dipilih
        } else if (isiK.equals("<Choose Counselor>")) {
            JOptionPane.showMessageDialog(p,
                    "Counselor has not been chosen!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (isiH.equals("<Choose Counseling Day>")) {
            JOptionPane.showMessageDialog(p,
                    "Counseling Day has not been chosen!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (isiJ.equals("<Choose Counseling Time>")) {
            JOptionPane.showMessageDialog(p,
                    "Counseling Time has not been chosen!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Method sekunder untuk menetapkan info, hari, dan waktu konselor.
     *
     * @param boxKonselor   ComboBox untuk memilih konselor.
     * @param boxDay        ComboBox untuk memilih hari.
     * @param boxTime       ComboBox untuk memilih waktu.
     * @param TitleNameDCP  Label untuk menampilkan nama konselor.
     * @param TitleEmailDCP Label untuk menampilkan email konselor.
     * @param TitlePhoneDCP Label untuk menampilkan nomor telepon konselor.
     * @param TitleExpDCP   TextArea untuk menampilkan pengalaman konselor.
     * @param profilePic    Komponen untuk menampilkan gambar profil.
     */
    public void setCounselor(RoundComboBox boxKonselor, RoundComboBox boxDay,
                             RoundComboBox boxTime, JLabel TitleNameDCP,
                             JLabel TitleEmailDCP, JLabel TitlePhoneDCP,
                             JTextArea TitleExpDCP, ProfilePic profilePic) {

        // Ekstrak ID konselor dari combobox
        String isiK = (String) boxKonselor.getSelectedItem();
        String numericPart = isiK.split("\\.")[0];

        // Jika ID-nya bukan opsi default, akan masuk ke dalam if
        if (!numericPart.equals("<Choose Counselor>")) {

            boxDay.setEnabled(true);

            // Ambil info konselor
            String sql = "SELECT * FROM konseling_online.konselor "
                    + "WHERE ID='" + numericPart + "';";
            ResultSet account = db.query(sql);
            try {
                if (account.next()) {
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
        } else {
            // Reset info dan combobox
            reset(boxKonselor, boxDay, boxTime);
            k.setID(-1);
            k.setNama_Lengkap("-");
            k.setEmail("-");
            k.setNo_Telp("-");
            k.setPengalaman("-");
            profilePic.setPic(IC.retrieveImage(1, "defaultpic"));
        }

        // Update komponen di DC
        TitleNameDCP.setText(k.getNama_Lengkap());
        TitleEmailDCP.setText(k.getEmail());
        TitlePhoneDCP.setText(k.getNo_Telp());
        TitleExpDCP.setText(k.getPengalaman());

        // Update boxDay
        boxDay.removeAllItems(); // hapus seluruh konten boxHari
        boxDay.addItem("<Choose Counseling Day>");
        ResultSet account = getHari(k.getID());
        try {
            while (account.next()) {
                boxDay.addItem(account.getString("Hari"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method sekunder untuk mengupdate combobox waktu.
     *
     * @param boxDay  ComboBox untuk memilih hari.
     * @param boxTime ComboBox untuk memilih waktu.
     */
    public void setTime(RoundComboBox boxDay, RoundComboBox boxTime) {
        String isiH = (String) ((boxDay.getSelectedItem() != null) ? boxDay.getSelectedItem() : "<Choose Counseling Day>");

        if (!isiH.equals("<Choose Counseling Day>")) {

            /*
            Combobox hari diaktifkan, hapus seluruh konten,
            tambahkan waktu default, dan isi dengan waktu yang dapat
            oleh konselor pada suatu waktu.
            */
            boxTime.setEnabled(true);
            boxTime.removeAllItems();
            boxTime.addItem("<Choose Counseling Time>");
            ResultSet account = getWaktu(k.getID(), isiH);
            try {
                while (account.next()) {
                    boxTime.addItem(account.getString("Waktu"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            boxTime.setEnabled(false);
            boxTime.setSelectedItem("<Choose Counseling Time>");
        }
    }

    /**
     * Method bantu untuk mereset combobox.
     *
     * @param boxKonselor ComboBox untuk memilih konselor.
     * @param boxDay      ComboBox untuk memilih hari.
     * @param boxTime     ComboBox untuk memilih waktu.
     */
    public void reset(RoundComboBox boxKonselor, RoundComboBox boxDay, RoundComboBox boxTime) {
        boxKonselor.setSelectedItem("<Choose Counselor>");
        boxDay.setSelectedItem("<Choose Counseling Day>");
        boxTime.setSelectedItem("<Choose Counseling Time>");
        boxDay.setEnabled(false);
        boxTime.setEnabled(false);
    }

    /**
     * Method bantu untuk mencari info dan memasukkan ke database.
     *
     * @param p           Panel yang digunakan.
     * @param boxKonselor ComboBox untuk memilih konselor.
     * @param boxDay      ComboBox untuk memilih hari.
     * @param boxTime     ComboBox untuk memilih waktu.
     */
    private void doSetSchedule(JPanel p, RoundComboBox boxKonselor,
                              RoundComboBox boxDay, RoundComboBox boxTime) {
        String isiH = (String) boxDay.getSelectedItem();
        String isiJ = (String) boxTime.getSelectedItem();
        int IDHari = 0;
        int IDWaktu = 0;

        // Ambil IDHari dari database
        String sql = "SELECT * FROM konseling_online.hari_konseling "
                + "WHERE Hari='" + isiH + "';";
        ResultSet account = db.query(sql);
        try {
            if (account.next()) {
                IDHari = account.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Ambil IDWaktu dari database
        sql = "SELECT * FROM konseling_online.waktu_konseling "
                + "WHERE Waktu='" + isiJ + "';";
        account = db.query(sql);
        try {
            if (account.next()) {
                IDWaktu = account.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Masukkan jadwal dengan ID konselor, hari, dan waktu ke database
        if (insertJadDB(k.getID(), IDHari, IDWaktu)) {
            JOptionPane.showMessageDialog(p, "Schedule successfully added!", "Schedule", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(p, "Failed to add schedule!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        reset(boxKonselor, boxDay, boxTime);
    }

    /**
     * Method bantu untuk memasukkan jadwal ke database.
     *
     * @param idk ID Konselor.
     * @param idh ID Hari.
     * @param idw ID Waktu.
     * @return True jika berhasil, False jika gagal.
     */
    private boolean insertJadDB(int idk, int idh, int idw) {
        try {
            int id_jk = 0;
            // Cari id jadwal konselor di database
            String sql = "SELECT id_jadwal_konselor FROM konseling_online.jadwal_konselor WHERE "
                    + "id_konselor='" + idk + "' AND "
                    + "id_hari='" + idh + "' AND "
                    + "id_waktu='" + idw + "';";
            ResultSet resultSet = db.query(sql);

            // Masukkan id jadwal konselor dengan id user ke jadwal
            if (resultSet.next()) {
                id_jk = resultSet.getInt("id_jadwal_konselor");
                sql = "INSERT INTO konseling_online.jadwal_konseling "
                        + "(id_jadwal_konselor, id_user) "
                        + "VALUES ('" + id_jk + "', '" + u.getID() + "');";
                db.update(sql);
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Method bantu untuk mendapatkan hari dari database.
     *
     * @param ID ID Konselor.
     * @return ResultSet berisi hari-hari yang tersedia.
     */
    private ResultSet getHari(int ID) {
        // Ambil hari konselor dari database
        try {
            String sql = "SELECT DISTINCT D.Hari as Hari "
                    + "FROM konseling_online.konselor as F "
                    + "LEFT JOIN konseling_online.jadwal_konselor as B ON F.ID = B.id_konselor "
                    + "LEFT JOIN konseling_online.jadwal_konseling as A ON B.id_jadwal_konselor = A.id_jadwal_konselor "
                    + "LEFT JOIN konseling_online.user as C ON C.ID = A.id_user "
                    + "LEFT JOIN konseling_online.hari_konseling as D ON D.id = B.id_hari "
                    + "LEFT JOIN konseling_online.waktu_konseling as E ON E.id = B.id_waktu "
                    + "WHERE F.ID = '" + ID + "' AND A.id_jadwal_konselor IS NULL; ";

            ResultSet resultSet = db.query(sql);

            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method bantu untuk mendapatkan waktu dari database.
     *
     * @param ID   ID Konselor.
     * @param hari Hari yang dipilih.
     * @return ResultSet berisi waktu-waktu yang tersedia.
     */
    private ResultSet getWaktu(int ID, String hari) {
        // Ambil waktu konselor dari database
        try {
            String sql = "SELECT E.Waktu as Waktu "
                    + "FROM konseling_online.konselor as F "
                    + "LEFT JOIN konseling_online.jadwal_konselor as B ON F.ID = B.id_konselor "
                    + "LEFT JOIN konseling_online.jadwal_konseling as A ON B.id_jadwal_konselor = A.id_jadwal_konselor "
                    + "LEFT JOIN konseling_online.hari_konseling as D ON D.id = B.id_hari "
                    + "LEFT JOIN konseling_online.waktu_konseling as E ON E.id = B.id_waktu "
                    + "WHERE F.ID = '" + ID + "' AND D.Hari = '" + hari + "' AND A.id_jadwal_konselor IS NULL; ";


            ResultSet resultSet = db.query(sql);

            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
