package Controller;

import java.awt.CardLayout;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import javax.imageio.ImageIO;
import Model.User;
import swing.RoundTextArea;
import swing.RoundTextField;
import View.BioUserP;
import View.WelcomeP;
import java.io.IOException;

/**
 * Kelas Controller untuk menangani pembaruan profil pengguna dan operasi terkait.
 */
public class CPController {
    
    // Inisiasi variabel dan objek
    private ImageController IC = new ImageController();
    private Database db = Database.getInstance();
    private User u = User.getInstance();
    private String temp = null;
    
    /**
     * Metode utama untuk memperbarui profil pengguna.
     * 
     * @param p JPanel untuk menampilkan pesan.
     * @param cards JPanel yang berisi tampilan yang berbeda.
     * @param cardLayout CardLayout untuk mengelola tampilan kartu.
     * @param BioUserC Objek BioUserP untuk informasi bio pengguna.
     * @param WelcomeC Objek WelcomeP untuk informasi selamat datang.
     * @param isiEmailCP JTextField untuk masukan email.
     * @param isiUNameCP JTextField untuk masukan nama pengguna.
     * @param isiPassCP JTextField untuk masukan kata sandi.
     * @param isiNameCP JTextField untuk masukan nama.
     * @param isiPhoneCP JTextField untuk masukan nomor telepon.
     * @param isiAddressCP JTextField untuk masukan alamat.
     * @param isiBioCP JTextArea untuk masukan bio.
     */
    public void doCP(JPanel p, JPanel cards, CardLayout cardLayout, BioUserP BioUserC,
                     WelcomeP WelcomeC, RoundTextField isiEmailCP, RoundTextField isiUNameCP, 
                     RoundTextField isiPassCP, RoundTextField isiNameCP, RoundTextField isiPhoneCP, 
                     RoundTextField isiAddressCP, RoundTextArea isiBioCP){
        
        String passl = null;
        u.setEmail(BioUserC.getTitleEmailBU().getText());
        u.setUsername(BioUserC.getTitleUNameBU().getText());
        
        // Cek apakah email diubah
        if (!isiEmailCP.getText().trim().equals("")){ 
            // Cek apakah menggunakan format yang sesuai
            if (db.validateEmail(isiEmailCP.getText().trim())){ 
                // Cek apakah email sudah dipakai oleh pengguna atau konselor lain
                if(!db.check("user", "Email", isiEmailCP.getText().trim()) &&
                   !db.check("konselor", "Email", isiEmailCP.getText().trim())){
                    u.setEmail(isiEmailCP.getText().trim());
                }else{
                    JOptionPane.showMessageDialog(p, 
                            "Email has been taken!", "Error", 
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }else{
                JOptionPane.showMessageDialog(p, 
                        "Email is not valid!", "Error", 
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        // Cek apakah username diubah
        if (!isiUNameCP.getText().trim().equals("")){
            // Cek apakah username sudah dipakai oleh pengguna lain
            if(!db.check("user", "Username", isiUNameCP.getText().trim())){
                u.setUsername(isiUNameCP.getText().trim());
            }else{
                JOptionPane.showMessageDialog(p, 
                        "Username has been taken!", "Error", 
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        // Cek apakah password diubah dan harus memiliki panjang minimal 8 karakter
        if (!isiPassCP.getText().trim().equals("")){
            if(isiPassCP.getText().trim().length() < 8){
                JOptionPane.showMessageDialog(p, 
                        "Password must be 8 or more!", "Error", 
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        // Mengambil password lama pengguna jika tidak diubah
        String sql = "SELECT Password FROM konseling_online.user "
                    + "WHERE ID='"+u.getID()+"';";
        ResultSet account = db.query(sql);
        try {
            if (account.next()){
                passl = account.getString("Password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        u.setNama_Lengkap((!isiNameCP.getText().trim().equals("")) ? isiNameCP.getText().trim(): BioUserC.getTitleNama().getText());
        u.setNo_Telp((!isiPhoneCP.getText().trim().equals("")) ? isiPhoneCP.getText().trim(): BioUserC.getTitlePhoneBU().getText());
        u.setAlamat((!isiAddressCP.getText().trim().equals("")) ? isiAddressCP.getText().trim(): BioUserC.getTitleAddressBU().getText());
        u.setPassword((!isiPassCP.getText().trim().equals("")) ? isiPassCP.getText().trim(): passl);
        u.setBio((!isiBioCP.getText().trim().equals("")) ? isiBioCP.getText().trim(): BioUserC.getTitleBioBU().getText());
        
        // Update informasi yang diubah ke database
        if(updateCP(u.getNama_Lengkap(), u.getEmail(), u.getUsername(), u.getPassword(), u.getNo_Telp(), u.getAlamat(), u.getBio())){
            // Update BioUserC dan WelcomeC
            BioUserC.getTitleNama().setText(u.getNama_Lengkap());
            WelcomeC.getButtonName().setText(u.getNama_Lengkap());
            BioUserC.getTitlePhoneBU().setText(u.getNo_Telp());
            BioUserC.getTitleAddressBU().setText(u.getAlamat());
            BioUserC.getTitleBioBU().setText(u.getBio());
            BioUserC.getTitleUNameBU().setText(u.getUsername());
            BioUserC.getTitleEmailBU().setText(u.getEmail());
            
            // Update gambar profil jika diubah
            if (temp != null){
                IC.updateImage(temp, u.getID(), "user");
                BioUserC.getProfilePicBU().setPic(IC.retrieveImage(u.getID(), "user"));
                WelcomeC.getProfilePicW().setPic(IC.retrieveImage(u.getID(), "user"));
            }
            
            // Panggil backFunc
            backFunc(cards, cardLayout, isiEmailCP, 
                     isiUNameCP, isiPassCP, isiNameCP, 
                     isiPhoneCP, isiAddressCP, isiBioCP);
            
            JOptionPane.showMessageDialog(p, 
                    "Profile updated successfully!", 
                    "Change Profile", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(p, 
                    "Failed to change profile!", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Metode untuk memilih gambar profil baru.
     * 
     * @param p JPanel untuk menampilkan pesan.
     */
    public void doFileChooser(JPanel p) {
        // Pengaturan Look and Feel untuk JFileChooser
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException |
                InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        
        // Buat JFileChooser dan diatur agar hanya menerima file dan panggil
        JFileChooser fileChooser = new JFileChooser(
                FileSystemView.getFileSystemView().getHomeDirectory());
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = fileChooser.showOpenDialog(p);

        // Jika opsi OK dipilih, akan masuk ke dalam if
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            
            // Cek apakah file merupakan file gambar yang valid
            if (isValidImagePath(selectedFile.getAbsolutePath())) {
                temp = selectedFile.getAbsolutePath();
            } else {
                System.out.println("Not a valid image file: " + temp);
            }
        }
    }
    
    /**
     * Metode untuk menangani tombol kembali.
     * 
     * @param cards JPanel yang berisi tampilan yang berbeda.
     * @param cardLayout CardLayout untuk mengelola tampilan kartu.
     * @param isiEmailCP JTextField untuk masukan email.
     * @param isiUNameCP JTextField untuk masukan nama pengguna.
     * @param isiPassCP JTextField untuk masukan kata sandi.
     * @param isiNameCP JTextField untuk masukan nama.
     * @param isiPhoneCP JTextField untuk masukan nomor telepon.
     * @param isiAddressCP JTextField untuk masukan alamat.
     * @param isiBioCP JTextArea untuk masukan bio.
     */
    public void backFunc(JPanel cards, CardLayout cardLayout, RoundTextField isiEmailCP, 
                         RoundTextField isiUNameCP, RoundTextField isiPassCP, 
                         RoundTextField isiNameCP, RoundTextField isiPhoneCP, 
                         RoundTextField isiAddressCP, RoundTextArea isiBioCP) {
        
        // Reset semua teks field dan teks area di CP
        reset(isiEmailCP, isiUNameCP, 
              isiPassCP, isiNameCP, isiPhoneCP,
              isiAddressCP, isiBioCP);

        // Reset temp
        temp = null;

        // Kembali ke BioUserC
        cardLayout.show(cards, "BioUserC");
    }
    
   /**
     * Metode bantu untuk memperbarui informasi pengguna di database.
     * 
     * @param nama Nama pengguna.
     * @param email Email pengguna.
     * @param uName Nama pengguna.
     * @param pass Kata sandi pengguna.
     * @param phone Nomor telepon pengguna.
     * @param address Alamat pengguna.
     * @param bio Bio pengguna.
     * @return True jika pembaruan berhasil, false jika tidak.
     */
   private boolean updateCP(String nama, String email, String uName, 
                   String pass, String phone, String address, String bio){
        try {
            String sql = "UPDATE konseling_online.user "
                    + "SET Nama_Lengkap='"+nama+"', Email='"+email+"', "
                    + "Username='"+uName+"', Password='"+pass+"', "
                    + "No_Telp='"+phone+"', Alamat='"+address+"', "
                    + "Bio='"+bio+"' "
                    + "WHERE ID='"+u.getID()+"';";
            db.update(sql);
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }  
        return false;
    }
    
   /**
     * Metode bantu untuk mereset semua teks field dan teks area.
     * 
     * @param isiEmailCP JTextField untuk masukan email.
     * @param isiUNameCP JTextField untuk masukan nama pengguna.
     * @param isiPassCP JTextField untuk masukan kata sandi.
     * @param isiNameCP JTextField untuk masukan nama.
     * @param isiPhoneCP JTextField untuk masukan nomor telepon.
     * @param isiAddressCP JTextField untuk masukan alamat.
     * @param isiBioCP JTextArea untuk masukan bio.
     */
    private void reset(RoundTextField isiEmailCP, RoundTextField isiUNameCP,
                      RoundTextField isiPassCP, RoundTextField isiNameCP,
                      RoundTextField isiPhoneCP, RoundTextField isiAddressCP,
                      RoundTextArea isiBioCP){
        isiBioCP.setText("");
        JTextField[] textFields = {isiNameCP, isiEmailCP, isiPhoneCP,
            isiAddressCP, isiUNameCP, isiPassCP};
        for (JTextField textField : textFields) {
            textField.setText("");
        }
    }
    
    /**
     * Metode bantu untuk memeriksa apakah jalur file adalah gambar yang valid.
     * 
     * @param filePath Jalur file gambar.
     * @return True jika jalur file adalah gambar yang valid, false jika tidak.
     */
    private boolean isValidImagePath(String filePath) {
        try {
            // Mencoba membaca file gambar
            ImageIO.read(new File(filePath));
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
}
