package Panel;

import main.*;
import java.sql.*;
import javax.swing.*;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

public class ScheduleP extends Table {
    private JPanel cards;
    private CardLayout cardLayout;
    
    private Database db = Database.getInstance();
    
    public ScheduleP(JPanel cards, CardLayout cardLayout) {
        initComponents();
        this.cards=cards;
        this.cardLayout=cardLayout;
    }
    
    public JTable getScheduleTable() {
        return ScheduleTable;
    }

    // Layout Method
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new Background.Background();
        mainPanel = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        ScheduleTable = new javax.swing.JTable();
        descDelete = new javax.swing.JLabel();
        buttonDelete = new swing.RoundButton();
        linkS = new swing.Link();

        background.setBlur(mainPanel);
        background.setPic("bgUP.png");

        mainPanel.setOpaque(false);

        ScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Num", "Counselor", "Day", "Time", "Meeting Link(*Right click to copy)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScheduleTable.setColumnSelectionAllowed(true);
        ScheduleTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setViewportView(ScheduleTable);
        ScheduleTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (ScheduleTable.getColumnModel().getColumnCount() > 0) {
            ScheduleTable.getColumnModel().getColumn(0).setResizable(false);
            ScheduleTable.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        descDelete.setForeground(new java.awt.Color(0, 0, 0));
        descDelete.setText("Select the schedule number to be deleted");

        buttonDelete.setBackground(new java.awt.Color(102, 102, 102));
        buttonDelete.setForeground(new java.awt.Color(255, 255, 255));
        buttonDelete.setText("Delete Schedule");
        buttonDelete.setBackgroundColor("#eb0936");
        buttonDelete.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonDelete.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonDelete.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        linkS.setText("<html><font color='purple'>&#9664; BIO</font></html>");
        linkS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        linkS.setState1("<html><font color='purple'>&#9664; BIO</font></html>");
        linkS.setState2("<html><font color='blue'>&#9664; BIO</font></html>");
        linkS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linkS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descDelete))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(linkS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Event Methods
    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Delete Schedule?", "Schedule", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION){
            if (ScheduleTable.getSelectedRow() != -1) {
                int number = (int) ScheduleTable.getValueAt(ScheduleTable.getSelectedRow(), 0);

                if (DeleteSchedule(number)) {
                    JOptionPane.showMessageDialog(this, "Schedule has been deleted!!", "Schedule", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete schedule!", "Error", JOptionPane.ERROR_MESSAGE); 
                }

            } else {
                JOptionPane.showMessageDialog(this, "No row selected!", "Error", JOptionPane.ERROR_MESSAGE); 
            }
            fillTable();  
        }
        
    }//GEN-LAST:event_buttonDeleteActionPerformed
    private void linkSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkSActionPerformed
        cardLayout.show(cards, "BioUserC");
    }//GEN-LAST:event_linkSActionPerformed
    
    // Secondary Method
    public boolean DeleteSchedule(int ID_JKon){
        try {
            String sql = "DELETE FROM konseling_online.jadwal_konseling WHERE "
                    + "id_jadwal_konseling='"+ID_JKon+"';";

            db.update(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    // Helper Methods
    public void fillTable(){
        DefaultTableModel tbModel = new DefaultTableModel() {
            // Override isCellEditable to make all cells non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // Add columns
        tbModel.addColumn("ID");
        tbModel.addColumn("No");
        tbModel.addColumn("Nama_Konselor");
        tbModel.addColumn("Hari");
        tbModel.addColumn("Waktu");
        tbModel.addColumn("Meeting_Link");

        ResultSet account = getJadwal();
        int rowNum = 1;
        try {
            while (account.next()) {
                String ID = account.getString("Schedule_ID");
                String kon = account.getString("Nama_Konselor");
                String hari = account.getString("Hari");
                String jam = account.getString("Waktu");
                String ml = account.getString("Meeting_Link");

                // Add data to the model
                tbModel.addRow(new Object[]{ID, rowNum, kon, hari, jam, ml});
                rowNum++;
            }

            // Set model to ScheduleTable
            ScheduleTable.setModel(tbModel);

            // Hide column ID (index: 0)
            ScheduleTable.getColumnModel().getColumn(0).setMinWidth(0);
            ScheduleTable.getColumnModel().getColumn(0).setMaxWidth(0);
            ScheduleTable.getColumnModel().getColumn(0).setWidth(0);

            super.resizeColumnWidth(ScheduleTable);
            super.addCopyFunctionality(ScheduleTable);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private ResultSet getJadwal(){
        
        try {
            String sql = "SELECT A.id_jadwal_konseling as Schedule_ID,"
            + "F.Nama_Lengkap as Nama_Konselor, "
            + "D.Hari, E.Waktu, C.Nama_Lengkap as Nama_user, "
            + "F.link_Meet as Meeting_Link "
            + "FROM (konseling_online.jadwal_konseling as A) "
            + "JOIN (konseling_online.jadwal_konselor as B) ON B.id_jadwal_konselor = A.id_jadwal_konselor "
            + "JOIN (konseling_online.`user` as C) ON C.ID = A.id_user "
            + "JOIN (konseling_online.hari_konseling as D) ON D.id = B.id_hari "
            + "JOIN (konseling_online.waktu_konseling as E) ON E.id = B.id_waktu "
            + "JOIN (konseling_online.konselor as F) ON F.ID = B.id_konselor "
            + "WHERE A.id_user = '"+db.getIDAccUser()+"' ORDER BY A.id_jadwal_konseling;";

            ResultSet resultSet = db.query(sql);
            
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ScheduleTable;
    private Background.Background background;
    private swing.RoundButton buttonDelete;
    private javax.swing.JLabel descDelete;
    private javax.swing.JScrollPane jScrollPane;
    private swing.Link linkS;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
