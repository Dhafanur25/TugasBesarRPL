package Controller;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 * Kelas Database merupakan implementasi dari interface DBI dan bertanggung jawab
 * untuk koneksi dan interaksi dengan database MySQL pada aplikasi Konseling Online.
 * Kelas ini menyediakan fungsi untuk melakukan query, update, serta pemeriksaan validitas email.
 *
 */
public class Database implements DBI {
    // Inisiasi variabel untuk validasi email
    private static final String pEmail = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern pattern = Pattern.compile(pEmail);

    // Inisiasi variabel untuk database
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/konseling_online";
    private static final String USER = "root";
    private static final String PASS = "12345678";
    private static Database instance;
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;

    /**
     * Konstruktor untuk menginisialisasi koneksi ke database MySQL.
     * Jika koneksi berhasil dibuat, maka objek ini dapat digunakan untuk
     * melakukan query dan update ke database.
     * Jika terjadi kesalahan dalam koneksi, akan ditampilkan pesan kesalahan
     * menggunakan JOptionPane.
     */
    public Database() {
        // Koneksi ke database dan buat statement
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
            stmt = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(),
                    "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * Method utama untuk melakukan query ke database.
     *
     * @param SQLString Query SQL.
     * @return ResultSet hasil query.
     */
    public ResultSet query(String SQLString) {
        try {
            rs = stmt.executeQuery(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error: " + e.getMessage(), "Communication Error",
                    JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }

    /**
     * Method utama untuk melakukan update ke database.
     *
     * @param SQLString Query SQL untuk update.
     */
    public void update(String SQLString) {
        try {
            stmt.executeUpdate(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error: " + e.getMessage(), "Communication Error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * Method sekunder untuk memeriksa apakah suatu data ada di suatu kolom.
     *
     * @param table  Nama tabel.
     * @param column Nama kolom.
     * @param x      Nilai yang ingin diperiksa.
     * @return True jika data ada, False jika tidak.
     */
    public boolean check(String table, String column, String x) {
        try {
            String sql = "SELECT " + column + " FROM konseling_online." + table
                    + " WHERE " + column + "='" + x + "';";

            ResultSet resultSet = query(sql);

            if (resultSet.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Method sekunder untuk menggunakan instance yang sama untuk semua objek Database.
     *
     * @return Instance Database.
     */
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    /**
     * Method sekunder untuk memeriksa validitas suatu email.
     *
     * @param email Email yang ingin divalidasi.
     * @return True jika valid, False jika tidak.
     */
    public static boolean validateEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
