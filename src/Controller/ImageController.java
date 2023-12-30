package Controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageController {

    private Database db = Database.getInstance();

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

    public void updateImage(String imagePath, int id, String table) {
        String hexImage = convertToHex(imagePath);
        String query = "update `"+table+"` set image=0x" + hexImage + " where ID='"+id+"'";
        db.update(query);
        System.out.println("Image updated successfully.");
    }

    public InputStream retrieveImage(int recordId, String table) {
        String sql = "SELECT image FROM konseling_online.`"+table+"` WHERE ID = '"+recordId+"'";
    
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
