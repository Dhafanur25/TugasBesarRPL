package Panel;

import main.*;
import java.sql.*;
import javax.swing.*;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

public class WelcomeKonP extends Table {
    private JPanel cards;
    private CardLayout cardLayout;
    
    private Database db = Database.getInstance();
    
    public WelcomeKonP(JPanel cards, CardLayout cardLayout){
        this.cards = cards;
        this.cardLayout = cardLayout;
        initComponents();
        repaint();
    }
    
    // Getter Method
    public JLabel getTitleName() {
        return TitleNama;
    }
    
    // Layout Method
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background3 = new Background.Background();
        mainPanel3 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        ScheduleTable = new javax.swing.JTable();
        TitleNama = new javax.swing.JLabel();
        LabelName = new javax.swing.JLabel();
        linkBU1 = new swing.Link();

        setPreferredSize(new java.awt.Dimension(700, 453));

        background3.setBlur(mainPanel3);
        background3.setPic("bgWel.png");
        background3.setPreferredSize(new java.awt.Dimension(700, 453));

        mainPanel3.setOpaque(false);

        ScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "User", "Day", "Time", "Meeting Link(*Right click to copy)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        ScheduleTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        TitleNama.setBackground(new java.awt.Color(0, 0, 0));
        TitleNama.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        TitleNama.setForeground(new java.awt.Color(0, 0, 0));
        TitleNama.setText("Shinta Aiko");

        LabelName.setBackground(new java.awt.Color(0, 0, 0));
        LabelName.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        LabelName.setForeground(new java.awt.Color(0, 0, 0));
        LabelName.setText("Jadwal,");

        linkBU1.setText("<html><font color='purple'>&#9664; Login Page</font></html>");
        linkBU1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        linkBU1.setState1("<html><font color='purple'>&#9664; Login Page</font></html>");
        linkBU1.setState2("<html><font color='blue'>&#9664; Login Page</font></html>");
        linkBU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkBU1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanel3Layout = new javax.swing.GroupLayout(mainPanel3);
        mainPanel3.setLayout(mainPanel3Layout);
        mainPanel3Layout.setHorizontalGroup(
            mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linkBU1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanel3Layout.createSequentialGroup()
                        .addComponent(LabelName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TitleNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        mainPanel3Layout.setVerticalGroup(
            mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleNama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(linkBU1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout background3Layout = new javax.swing.GroupLayout(background3);
        background3.setLayout(background3Layout);
        background3Layout.setHorizontalGroup(
            background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(mainPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        background3Layout.setVerticalGroup(
            background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Event Method
    private void linkBU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkBU1ActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Confirm Logout?", "LogOut", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION){
            db.setIDAccKon(0);
            cardLayout.show(cards, "LoginC");
        }
    }//GEN-LAST:event_linkBU1ActionPerformed
    
    // Secondary Method
    public void fillTable(){
        DefaultTableModel tbModel = (DefaultTableModel) ScheduleTable.getModel();
        tbModel.setRowCount(0);
        
        ResultSet account = getJadwalKon(); 
        try {
            while(account.next()){
                String num = account.getString("No");
                String user = account.getString("Nama_User");
                String hari = account.getString("Hari");
                String jam = account.getString("Waktu");
                String ml = account.getString("Meeting_Link");
                
                String Data[] = {num, user, hari, jam, ml};
                
                tbModel.addRow(Data);
            }
            
            super.resizeColumnWidth(ScheduleTable);
            super.addCopyFunctionality(ScheduleTable);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
   
    // Helper Method
    private ResultSet getJadwalKon(){
        
        try {
            String sql = "SELECT ROW_NUMBER () OVER (ORDER BY B.id_jadwal_konselor) AS No,"
            + "C.Nama_Lengkap as Nama_User, "
            + "D.Hari, E.Waktu, "
            + "F.link_Meet as Meeting_Link "
            + "FROM (konseling_online.jadwal_konseling as A) "
            + "JOIN (konseling_online.jadwal_konselor as B) ON B.id_jadwal_konselor = A.id_jadwal_konselor "
            + "JOIN (konseling_online.`user` as C) ON C.ID = A.id_user "
            + "JOIN (konseling_online.hari_konseling as D) ON D.id = B.id_hari "
            + "JOIN (konseling_online.waktu_konseling as E) ON E.id = B.id_waktu "
            + "JOIN (konseling_online.konselor as F) ON F.ID = B.id_konselor "
            + "WHERE F.ID = '"+db.getIDAccKon()+"';";

            ResultSet resultSet = db.query(sql);
            
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelName;
    private javax.swing.JTable ScheduleTable;
    private javax.swing.JLabel TitleNama;
    private Background.Background background3;
    private javax.swing.JScrollPane jScrollPane;
    private swing.Link linkBU1;
    private javax.swing.JPanel mainPanel3;
    // End of variables declaration//GEN-END:variables
}
