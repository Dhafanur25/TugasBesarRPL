package Controller;

import java.sql.ResultSet;

/**
 * Interface DBI (Database Interface) mendefinisikan metode-metode umum
 * yang digunakan untuk berinteraksi dengan database.
 */
public interface DBI {

    /**
     * Melakukan query pada database dan mengembalikan hasil dalam bentuk ResultSet.
     *
     * @param SQLString String SQL untuk melakukan query.
     * @return ResultSet hasil query dari database.
     */
    public ResultSet query(String SQLString);

    /**
     * Melakukan operasi update pada database dengan SQL tertentu.
     *
     * @param SQLString String SQL untuk operasi update.
     */
    public void update(String SQLString);

}
