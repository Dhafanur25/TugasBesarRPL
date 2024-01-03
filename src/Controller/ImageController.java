package Controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Kelas ini mengontrol operasi gambar, seperti mengonversi gambar ke format heksadesimal
 * dan memperbarui serta mengambil gambar dari database.
 */
public class ImageController {

    private Database db = Database.getInstance();

    /**
     * Mengonversi gambar ke format heksadesimal.
     * 
     * @param imagePath Path gambar yang akan dikonversi.
     * @return String heksadesimal yang merepresentasikan gambar.
     */
    public String convertToHex(String imagePath) {
        try (FileInputStream inputStream = new FileInputStream(imagePath)) {
            byte[] imageData = inputStream.readAllBytes();

            StringBuilder hexStringBuilder = new StringBuilder();
            for (byte b : imageData) {
                hexStringBuilder.append(String.format("%02X", b));
            }

            return hexStringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Memperbarui gambar di database.
     * 
     * @param imagePath Path gambar yang akan diperbarui.
     * @param id        ID record yang akan diperbarui.
     * @param table     Nama tabel di database.
     */
    public void updateImage(String imagePath, int id, String table) {
        String hexImage = convertToHex(imagePath);
        String query = "UPDATE `" + table + "` SET image=0x" + hexImage + " WHERE ID='" + id + "'";
        db.update(query);
        System.out.println("Gambar has been successfully updated!");
    }

    /**
     * Mengambil gambar dari database.
     * 
     * @param recordId ID record yang akan diambil gambarnya.
     * @param table    Nama tabel di database.
     * @return InputStream yang berisi data gambar.
     */
    public InputStream retrieveImage(int recordId, String table) {
        String sql = "SELECT image FROM konseling_online.`" + table + "` WHERE ID = '" + recordId + "'";

        try (ResultSet resultSet = db.query(sql)) {
            if (resultSet.next()) {
                return resultSet.getBinaryStream("image");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
