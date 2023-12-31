package Controller;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.awt.datatransfer.*;

/**
 * Kelas abstrak untuk menambahkan fungsionalitas pada tabel.
 */
public abstract class Table extends JPanel {
    /**
     * Menambahkan fungsionalitas salin pada klik kanan di sel tabel.
     *
     * @param table JTable yang akan ditambahkan fungsionalitas salin.
     */
    public void addCopyFunctionality(JTable table) {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) { // Klik kanan
                    int row = table.rowAtPoint(e.getPoint());
                    int col = table.columnAtPoint(e.getPoint());

                    if (row >= 0 && col >= 0) {
                        StringSelection stringSelection = new StringSelection(table.getValueAt(row, col).toString());
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                        clipboard.setContents(stringSelection, null);
                    }
                }
            }
        });
    }

    /**
     * Mengatur lebar kolom tabel agar sesuai dengan kontennya.
     *
     * @param table JTable yang akan diatur lebar kolomnya.
     */
    public void resizeColumnWidth(JTable table) {
        TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Set lebar minimum
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
}
