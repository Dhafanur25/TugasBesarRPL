package main;
import java.sql.Connection;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dhafa
 */
public class Database{
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mysql";
    
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    
    public static boolean validateEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public int loginDB(String table, String EU, String pass){
        int cek = -1; //Jika Username atau Email salah
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
  
            String sql = "SELECT * FROM konseling_online." + table
                    + " WHERE Email='" + EU + "'" 
                    + " OR Username='" + EU + "'";
            Statement st = con.createStatement();
            ResultSet resultSet = st.executeQuery(sql);

            // Check if the result set has any rows
            if (resultSet.next()) {
                if (resultSet.getString("Password").equals(pass)){
                    cek = 1; //Jika Username/Email dan password benar
                }else{
                    cek = 0; //Jika password salah
                }
            }
            resultSet.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    public boolean cekDB(String table, String column,String x){
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
  
            String sql = "SELECT * FROM konseling_online." + table
                    + " WHERE " + column +"='" + x + "';";
            Statement st = con.createStatement();
            ResultSet resultSet = st.executeQuery(sql);

            // Check if the result set has any rows
            if (resultSet.next()) {
                return true;
            }
            resultSet.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean insertDB(String table, String nama, String email, 
        String uName, String pass){
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");

            if (!cekDB(table,"Email", email) && 
                !cekDB(table,"Username", uName)){
                String sql = "INSERT INTO konseling_online." + table
                        + " (Nama_Lengkap, Email, Username, Password) "
                        + "VALUES ('" + nama + "', '"
                        + email + "', '"
                        + uName + "', '"
                        + pass + "');";
                Statement st = con.createStatement();
                st.executeUpdate(sql);     
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ResultSet getDB(String table, String column, String EU){
        
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
  
            String sql = "SELECT * FROM konseling_online." + table
                    + " WHERE "+ column +"='" + EU + "';";
            Statement st = con.createStatement();
            ResultSet resultSet = st.executeQuery(sql);
            
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void updateDB(String table, String nama, String email, String uName, 
                   String pass, String phone, String address, String bio, String pp, int ID){
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
 
            String sql = "UPDATE konseling_online." + table
                    + " SET Nama_Lengkap='" + nama + "', "
                    + "Email='" + email + "', "
                    + "Username='" + uName + "', "
                    + "Password='" + pass + "', "
                    + "No_Telp='" + phone + "', "
                    + "Alamat='" + address + "', "
                    + "Bio='" + bio + "', "
                    + "Profile_Pic_Path='" + pp + "'"
                    + " WHERE ID=" + ID + ";";
            System.out.println(sql);
            Statement st = con.createStatement();
            st.executeUpdate(sql);     
      
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
