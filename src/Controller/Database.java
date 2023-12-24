package Controller;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Database implements DBI{
    // Variables for email
    private static final String pEmail = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern pattern = Pattern.compile(pEmail);
    
    // Variables for general
    private static final String defaults = "C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/img/imgEmpty.jpg";
    
    // Variables for dsatabase
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/konseling_online";
    private static final String USER = "root";
    private static final String PASS = "12345678";
    private static Database instance;
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;

    
    public Database(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL,USER,PASS);
            stmt = conn.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(),
       "Connection Error",JOptionPane.WARNING_MESSAGE);
        }
    }

    public static String getDefaults() {
        return defaults;
    }
    
    // Main Methods
    public ResultSet query(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,
            "Error :"+e.getMessage(),"Communication Error", 
            JOptionPane.WARNING_MESSAGE);
        }
        return rs; 
    }
    public void update(String SQLString){
        try{
            stmt.executeUpdate(SQLString);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,
            "Error :"+e.getMessage(),"Communication Error",
            JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Secondary Method
    public boolean check(String table, String column,String x){
        try {
            String sql = "SELECT " + column + " FROM konseling_online."+ table
                    + " WHERE " + column +"='"+x+"';";

            ResultSet resultSet = query(sql);
            
            // Check if the result set has any rows
            if (resultSet.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    // Helper Methods
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    public static boolean validateEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
