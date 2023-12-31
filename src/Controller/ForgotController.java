package Controller;

import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import swing.CoolTextField;
import swing.PasswordField;

/**
 * Kelas ini mengontrol logika terkait proses reset password.
 */
public class ForgotController {
    private int ID;
    private Database database = Database.getInstance();

    /**
     * Method untuk melakukan reset password.
     * 
     * @param p            JPanel yang digunakan dalam antarmuka pengguna.
     * @param isiPasswordF Komponen PasswordField untuk mengambil password baru.
     * @param isiEmailF    Komponen CoolTextField untuk mengambil alamat email pengguna.
     * @param cardLayout   Layout kartu yang digunakan untuk mengelola tata letak.
     * @param cards        JPanel yang berisi kartu-kartu dalam tata letak.
     */
    public void doF(JPanel p, PasswordField isiPasswordF, CoolTextField isiEmailF, CardLayout cardLayout, JPanel cards) {
        ResultSet account = null;
        String pass = isiPasswordF.getText().trim();
        String masukan = isiEmailF.getText().trim();

        // Validasi input
        if (masukan.equals("") || pass.equals("")) {
            reset(isiPasswordF, isiEmailF);
            JOptionPane.showMessageDialog(p, "Field tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (pass.length() < 8) {
            reset(isiPasswordF, isiEmailF);
            JOptionPane.showMessageDialog(p, "Password harus 8 karakter atau lebih!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Mengecek apakah akun dengan email yang dimasukkan ada
        boolean checker = database.check("user", "Email", masukan);
        if (checker) {
            String sql = "SELECT * FROM konseling_online.user "
                    + "WHERE Email='" + masukan + "';";
            account = database.query(sql);
            try {
                if (account != null && account.next()) {
                    ID = account.getInt("ID");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            // Jika akun ditemukan, update password
            if (updatePass(ID, pass)) {
                reset(isiPasswordF, isiEmailF);
                JOptionPane.showMessageDialog(p, "Password berhasil direset!", "Reset Password", JOptionPane.INFORMATION_MESSAGE);
                cardLayout.show(cards, "LoginC");
            } else {
                JOptionPane.showMessageDialog(p, "Password gagal direset!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(p, "Akun tidak ditemukan!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Method untuk memperbarui password pengguna di database.
     * 
     * @param ID   ID pengguna yang akan diperbarui passwordnya.
     * @param pass Password baru yang akan disimpan di database.
     * @return True jika pembaruan password berhasil, False jika gagal.
     */
    private boolean updatePass(int ID, String pass) {
        try {
            String sql = "UPDATE konseling_online.user "
                    + "SET Password='" + pass + "' "
                    + "WHERE ID='" + ID + "';";
            database.update(sql);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Method untuk mereset nilai dari PasswordField dan CoolTextField.
     * 
     * @param isiPasswordF PasswordField yang akan direset.
     * @param isiEmailF    CoolTextField yang akan direset.
     */
    public void reset(PasswordField isiPasswordF, CoolTextField isiEmailF) {
        isiPasswordF.setText("");
        isiEmailF.setText("");
    }
}
