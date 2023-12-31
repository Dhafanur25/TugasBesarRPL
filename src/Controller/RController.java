package Controller;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import swing.CoolCheckBox;

/**
 * Controller untuk proses registrasi.
 */
public class RController {
    private Database database = Database.getInstance();

    /**
     * Melakukan registrasi berdasarkan input dari pengguna.
     *
     * @param p JPanel yang digunakan sebagai parent untuk pesan dialog.
     * @param nama Nama lengkap pengguna.
     * @param email Alamat email pengguna.
     * @param uName Nama pengguna (username).
     * @param pass Kata sandi pengguna.
     * @param checR CheckBox untuk menyetujui syarat dan ketentuan.
     * @param textFields Array JTextField yang berisi komponen input pengguna.
     * @param cards JPanel yang mengandung komponen-komponen yang ditampilkan menggunakan CardLayout.
     * @param cardLayout CardLayout yang digunakan untuk mengganti tampilan antar komponen.
     */
    public void doReg(JPanel p, String nama, String email, String uName,
                      String pass, CoolCheckBox checR,
                      JTextField[] textFields, JPanel cards, CardLayout cardLayout) {

        if (checR.isSelected() &&
            !nama.equals("") &&
            database.validateEmail(email) &&
            !uName.equals("") &&
            !pass.equals("") &&
            pass.length() >= 8) {
            // Insert to database
            if (insertReg(nama, email, uName, pass)) {

                // Reset fields
                reset(checR, textFields);
                JOptionPane.showMessageDialog(p, "Akun berhasil terdaftar!", "Registrasi", JOptionPane.INFORMATION_MESSAGE);
                cardLayout.show(cards, "LoginC");
            } else {
                JOptionPane.showMessageDialog(p, "Email/Username sudah digunakan!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (nama.equals("") ||
                email.equals("") ||
                uName.equals("") ||
                pass.equals("")) {
            JOptionPane.showMessageDialog(p, "Field tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!database.validateEmail(email)) {
            JOptionPane.showMessageDialog(p, "Email tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (pass.length() < 8) {
            JOptionPane.showMessageDialog(p, "Kata sandi harus minimal 8 karakter!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!checR.isSelected()) {
            JOptionPane.showMessageDialog(p, "Harap setujui syarat dan ketentuan!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Melakukan pengecekan dan penambahan data registrasi ke database.
     *
     * @param nama Nama lengkap pengguna.
     * @param email Alamat email pengguna.
     * @param uName Nama pengguna (username).
     * @param pass Kata sandi pengguna.
     * @return true jika registrasi berhasil, false jika gagal.
     */
    private boolean insertReg(String nama, String email,
                              String uName, String pass) {
        try {
            if (!database.check("user", "Email", email) &&
                !database.check("user", "Username", uName)) {
                String sql = "INSERT INTO konseling_online.user"
                        + " (Nama_Lengkap, Email, Username, Password) "
                        + "VALUES ('" + nama + "', '" + email + "', '" + uName + "', '" + pass + "');";
                database.update(sql);
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Mereset nilai pada JTextField dan CoolCheckBox.
     *
     * @param checR CoolCheckBox yang akan direset.
     * @param textFields Array JTextField yang akan direset.
     */
    public void reset(CoolCheckBox checR, JTextField[] textFields) {
        for (JTextField textField : textFields) {
            textField.setText("");
        }
        checR.setSelected(false);
    }

    /**
     * Menampilkan panel Terms and Conditions dan mengatur nilai 
     * CoolCheckBox berdasarkan keputusan pengguna.
     *
     * @param checR CoolCheckBox yang akan diatur nilai.
     */
    public void TermsAndCondition(CoolCheckBox checR) {
        addOns.TermsAndConditions panel = new addOns.TermsAndConditions();

        int result = JOptionPane.showOptionDialog(
                null,
                panel,
                "Syarat dan Ketentuan",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{"Setuju", "Tidak Setuju"},
                "Setuju");

        if (result == JOptionPane.OK_OPTION) {
            checR.setSelected(true);
        } else {
            checR.setSelected(false);
        }
    }
}
