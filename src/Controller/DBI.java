package Controller;

import java.sql.ResultSet;

public interface DBI {
    public ResultSet query(String SQLString);
    public void update(String SQLString);
    
}
