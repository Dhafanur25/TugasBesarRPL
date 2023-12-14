package Panel;

import java.sql.*;
import main.Database;
import javax.swing.JPanel;
import swing.RoundComboBox;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

public class DoCounselingP extends javax.swing.JPanel {
    private JPanel cards;
    private CardLayout cardLayout;
    
    private int IDKon;
    private Database db = Database.getInstance();

    public DoCounselingP(JPanel cards, CardLayout cardLayout){
        this.cards = cards;
        this.cardLayout = cardLayout;
        initComponents();
    }
    
    // Getter Methods
    public RoundComboBox getBoxDay() {
        return boxDay;
    }

    public RoundComboBox getBoxTime() {
        return boxTime;
    }
    
    // Layout Method
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background4 = new Background.Background();
        mainPanel4 = new javax.swing.JPanel();
        TitleCounseling = new javax.swing.JLabel();
        boxKonselor = new swing.RoundComboBox();
        boxDay = new swing.RoundComboBox();
        boxTime = new swing.RoundComboBox();
        buttonSetS = new swing.RoundButton();
        linkDCP = new swing.Link();
        labelNameDCP = new javax.swing.JLabel();
        TitleNameDCP = new javax.swing.JLabel();
        labelEmailDCP = new javax.swing.JLabel();
        TitleEmailDCP = new javax.swing.JLabel();
        labelPhoneDCP = new javax.swing.JLabel();
        TitlePhoneDCP = new javax.swing.JLabel();
        labelExpDCP = new javax.swing.JLabel();
        TitleExpDCP = new javax.swing.JTextArea();
        profilePic = new swing.ProfilePic();

        background4.setBlur(mainPanel4);
        background4.setPic("bgLaK.png");
        background4.setPreferredSize(new java.awt.Dimension(700, 453));

        mainPanel4.setOpaque(false);

        TitleCounseling.setBackground(new java.awt.Color(0, 0, 0));
        TitleCounseling.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        TitleCounseling.setForeground(new java.awt.Color(0, 0, 0));
        TitleCounseling.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleCounseling.setText("Counseling Session");

        boxKonselor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Choose Counselor>", "1. Dr. Amanda Johnson, MA, LPC", "2. Dr. William Afton, DE, PhD, LMFT", "3. Jane Smith, MSW, LCSW", "4. Dr. Ken Adams, PsyD", "5. Sarah Lee, MA, NCC", "6. Prof. Gregory Wilson, EdD, LPCC" }));
        boxKonselor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxKonselorActionPerformed(evt);
            }
        });

        boxDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Choose Counseling Day>", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        boxDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDayActionPerformed(evt);
            }
        });

        boxTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Choose Counseling Time>", "08:00", "12:00", "15:00", "20:00" }));

        buttonSetS.setBackground(new java.awt.Color(102, 102, 102));
        buttonSetS.setForeground(new java.awt.Color(255, 255, 255));
        buttonSetS.setText("Set Schedule");
        buttonSetS.setBackgroundColor("#5271ff");
        buttonSetS.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonSetS.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonSetS.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonSetS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSetSActionPerformed(evt);
            }
        });

        linkDCP.setText("<html><font color='purple'>&#9664; HOME</font></html>");
        linkDCP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        linkDCP.setState1("<html><font color='purple'>&#9664; HOME</font></html>");
        linkDCP.setState2("<html><font color='blue'>&#9664; HOME</font></html>");
        linkDCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkDCPActionPerformed(evt);
            }
        });

        labelNameDCP.setBackground(new java.awt.Color(0, 0, 0));
        labelNameDCP.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        labelNameDCP.setForeground(new java.awt.Color(51, 51, 51));
        labelNameDCP.setText("Name");

        TitleNameDCP.setBackground(new java.awt.Color(0, 0, 0));
        TitleNameDCP.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        TitleNameDCP.setForeground(new java.awt.Color(0, 0, 0));
        TitleNameDCP.setText("-                                                       ");
        TitleNameDCP.setToolTipText("");

        labelEmailDCP.setBackground(new java.awt.Color(0, 0, 0));
        labelEmailDCP.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        labelEmailDCP.setForeground(new java.awt.Color(51, 51, 51));
        labelEmailDCP.setText("Email");

        TitleEmailDCP.setBackground(new java.awt.Color(0, 0, 0));
        TitleEmailDCP.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        TitleEmailDCP.setForeground(new java.awt.Color(0, 0, 0));
        TitleEmailDCP.setText("-");

        labelPhoneDCP.setBackground(new java.awt.Color(0, 0, 0));
        labelPhoneDCP.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        labelPhoneDCP.setForeground(new java.awt.Color(51, 51, 51));
        labelPhoneDCP.setText("Phone Number");

        TitlePhoneDCP.setBackground(new java.awt.Color(0, 0, 0));
        TitlePhoneDCP.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        TitlePhoneDCP.setForeground(new java.awt.Color(0, 0, 0));
        TitlePhoneDCP.setText("-");

        labelExpDCP.setBackground(new java.awt.Color(0, 0, 0));
        labelExpDCP.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        labelExpDCP.setForeground(new java.awt.Color(51, 51, 51));
        labelExpDCP.setText("Experience");

        TitleExpDCP.setEditable(false);
        TitleExpDCP.setBackground(new java.awt.Color(255, 255, 255));
        TitleExpDCP.setColumns(20);
        TitleExpDCP.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        TitleExpDCP.setForeground(new java.awt.Color(0, 0, 0));
        TitleExpDCP.setLineWrap(true);
        TitleExpDCP.setRows(5);
        TitleExpDCP.setText("-");
        TitleExpDCP.setWrapStyleWord(true);
        TitleExpDCP.setOpaque(false);

        profilePic.setOpaque(false);

        javax.swing.GroupLayout profilePicLayout = new javax.swing.GroupLayout(profilePic);
        profilePic.setLayout(profilePicLayout);
        profilePicLayout.setHorizontalGroup(
            profilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );
        profilePicLayout.setVerticalGroup(
            profilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanel4Layout = new javax.swing.GroupLayout(mainPanel4);
        mainPanel4.setLayout(mainPanel4Layout);
        mainPanel4Layout.setHorizontalGroup(
            mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel4Layout.createSequentialGroup()
                .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(buttonSetS, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(linkDCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(boxTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boxDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boxKonselor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TitleCounseling, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelExpDCP)
                    .addComponent(TitleExpDCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanel4Layout.createSequentialGroup()
                        .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelPhoneDCP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmailDCP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNameDCP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleNameDCP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TitleEmailDCP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TitlePhoneDCP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        mainPanel4Layout.setVerticalGroup(
            mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanel4Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(labelExpDCP)
                        .addGap(4, 4, 4)
                        .addComponent(TitleExpDCP, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel4Layout.createSequentialGroup()
                        .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanel4Layout.createSequentialGroup()
                                .addComponent(TitleCounseling)
                                .addGap(30, 30, 30)
                                .addComponent(boxKonselor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(boxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(boxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanel4Layout.createSequentialGroup()
                                .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanel4Layout.createSequentialGroup()
                                        .addComponent(labelNameDCP)
                                        .addGap(4, 4, 4)
                                        .addComponent(TitleNameDCP)
                                        .addGap(15, 15, 15)
                                        .addComponent(labelEmailDCP)
                                        .addGap(4, 4, 4)
                                        .addComponent(TitleEmailDCP)
                                        .addGap(15, 15, 15)
                                        .addComponent(labelPhoneDCP)))
                                .addGap(4, 4, 4)
                                .addComponent(TitlePhoneDCP)))
                        .addGap(25, 25, 25)
                        .addComponent(buttonSetS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(linkDCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout background4Layout = new javax.swing.GroupLayout(background4);
        background4.setLayout(background4Layout);
        background4Layout.setHorizontalGroup(
            background4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        background4Layout.setVerticalGroup(
            background4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(mainPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background4, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Event Methods
    private void boxKonselorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxKonselorActionPerformed
        String isiK = (String) boxKonselor.getSelectedItem();
        String nama = "-";
        String email = "-";
        String phone = "-";
        String exp = "-";
        String pp = db.getDefaults();
       
        String numericPart = isiK.split("\\.")[0];

        if (!numericPart.equals("<Choose Counselor>")){
            boxDay.setEnabled(true);
            String sql = "SELECT * FROM konseling_online.konselor "
                    + "WHERE ID='"+numericPart+"';";
            ResultSet account = db.query(sql);
            try {
                if (account.next()){
                    IDKon = account.getInt("ID");
                    nama = account.getString("Nama_Lengkap");
                    email = account.getString("Email");
                    phone = account.getString("No_Telp");
                    exp = account.getString("Pengalaman");
                    pp = account.getString("Profile_Pic_Path");
                    
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            reset();
            nama = "-";
            email = "-";
            phone = "-";
            exp = "-";
            pp = db.getDefaults();
        } 
        TitleNameDCP.setText(nama);
        TitleEmailDCP.setText(email);
        TitlePhoneDCP.setText(phone);
        TitleExpDCP.setText(exp);
        profilePic.setPic(pp);
        
        // Update boxDay
        boxDay.removeAllItems();// hapus seluruh content boxHari
        boxDay.addItem("<Choose Counseling Day>");
        ResultSet account = getHari(IDKon);
        try {
            while(account.next()){
                boxDay.addItem(account.getString("Hari"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }//GEN-LAST:event_boxKonselorActionPerformed

    private void buttonSetSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSetSActionPerformed
        String isiK = (String) boxKonselor.getSelectedItem();
        String isiH = (String) boxDay.getSelectedItem();
        String isiJ =(String) boxTime.getSelectedItem();
        
        if (!isiK.equals("<Choose Counselor>")      &&
            !isiH.equals("<Choose Counseling Day>") &&
            !isiJ.equals("<Choose Counseling Time>")){
            int result = JOptionPane.showConfirmDialog(this, "Set Schedule?", "Schedule", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
            if (result == JOptionPane.OK_OPTION){
                doSetSchedule();
            }
        }else if (isiK.equals("<Choose Counselor>") ){
            JOptionPane.showMessageDialog(this, "Counselor has not been chosen!", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (isiH.equals("<Choose Counseling Day>")){
            JOptionPane.showMessageDialog(this, "Counseling Day has not been chosen!", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (isiJ.equals("<Choose Counseling Time>") ){
            JOptionPane.showMessageDialog(this, "Counseling Time has not been chosen!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonSetSActionPerformed

    private void linkDCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkDCPActionPerformed
        reset();
        cardLayout.show(cards, "WelcomeC");
    }//GEN-LAST:event_linkDCPActionPerformed

    private void boxDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDayActionPerformed
        String isiH = (String) ((boxDay.getSelectedItem() != null) ?  boxDay.getSelectedItem(): "<Choose Counseling Day>");
        
        if (!isiH.equals("<Choose Counseling Day>")){
            boxTime.setEnabled(true);
            boxTime.removeAllItems();// hapus seluruh content boxHari
            boxTime.addItem("<Choose Counseling Time>");
            ResultSet account = getWaktu(IDKon, isiH);
            try {
                while(account.next()){
                    boxTime.addItem(account.getString("Waktu"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else{
            boxTime.setEnabled(false);
        }
    }//GEN-LAST:event_boxDayActionPerformed

    // Secondary Method
    private void doSetSchedule(){
        String isiH = (String) boxDay.getSelectedItem();
        String isiJ = (String) boxTime.getSelectedItem();
        int IDHari = 0;
        int IDJam = 0;
        
        String sql = "SELECT * FROM konseling_online.hari_konseling "
                    + "WHERE Hari='"+isiH+"';";
        ResultSet account = db.query(sql);
        
        try {
            if (account.next()){
                IDHari = account.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        sql = "SELECT * FROM konseling_online.waktu_konseling "
                    + "WHERE Waktu='"+isiJ+"';";
        account = db.query(sql);
        
        try {
            if (account.next()){
                IDJam = account.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (insertJadDB(IDKon, IDHari, IDJam)){
            JOptionPane.showMessageDialog(this, "Schedule successfully addded!", "Schedule", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Failed to add schedule!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        reset();
    }
    
    // Helper Methods
    private boolean insertJadDB(int idk, int idh, int idw){
        try {
            int id_jk = 0;
            String sql = "SELECT id_jadwal_konselor FROM konseling_online.jadwal_konselor WHERE "
                    + "id_konselor='"+idk+"' AND "
                    + "id_hari='"+idh+"' AND "
                    + "id_waktu='"+idw+"';";

            ResultSet resultSet = db.query(sql);
            
            if(resultSet.next()){
                id_jk = resultSet.getInt("id_jadwal_konselor");
                sql = "INSERT INTO konseling_online.jadwal_konseling "
                    + "(id_jadwal_konselor, id_user) "
                    + "VALUES ('"+id_jk+"', '"+db.getIDAccUser()+"');";
                db.update(sql);
                return true;  
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
        
    private ResultSet getHari(int ID){
        try {
            String sql = "SELECT DISTINCT D.Hari as Hari "
                + "FROM konseling_online.konselor as F "
                + "LEFT JOIN konseling_online.jadwal_konselor as B ON F.ID = B.id_konselor "
                + "LEFT JOIN konseling_online.jadwal_konseling as A ON B.id_jadwal_konselor = A.id_jadwal_konselor "
                + "LEFT JOIN konseling_online.user as C ON C.ID = A.id_user "
                + "LEFT JOIN konseling_online.hari_konseling as D ON D.id = B.id_hari "
                + "LEFT JOIN konseling_online.waktu_konseling as E ON E.id = B.id_waktu "
                + "WHERE F.ID = '"+ID+"' AND A.id_jadwal_konselor IS NULL; ";
            

            ResultSet resultSet = db.query(sql);
            
            return resultSet;  
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private ResultSet getWaktu(int ID, String hari){
        try {
            String sql = "SELECT E.Waktu as Waktu "
            + "FROM konseling_online.konselor as F "
            + "LEFT JOIN konseling_online.jadwal_konselor as B ON F.ID = B.id_konselor "
            + "LEFT JOIN konseling_online.jadwal_konseling as A ON B.id_jadwal_konselor = A.id_jadwal_konselor "
            + "LEFT JOIN konseling_online.hari_konseling as D ON D.id = B.id_hari "
            + "LEFT JOIN konseling_online.waktu_konseling as E ON E.id = B.id_waktu "
            + "WHERE F.ID = '"+ID+"' AND D.Hari = '"+hari+"' AND A.id_jadwal_konselor IS NULL; ";
            

            ResultSet resultSet = db.query(sql);
            
            return resultSet;  
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private void reset(){
        boxKonselor.setSelectedItem("<Choose Counselor>");
        boxDay.setSelectedItem("<Choose Counseling Day>");
        boxTime.setSelectedItem("<Choose Counseling Time>");
        boxDay.setEnabled(false);
        boxTime.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleCounseling;
    private javax.swing.JLabel TitleEmailDCP;
    private javax.swing.JTextArea TitleExpDCP;
    private javax.swing.JLabel TitleNameDCP;
    private javax.swing.JLabel TitlePhoneDCP;
    private Background.Background background4;
    private swing.RoundComboBox boxDay;
    private swing.RoundComboBox boxKonselor;
    private swing.RoundComboBox boxTime;
    private swing.RoundButton buttonSetS;
    private javax.swing.JLabel labelEmailDCP;
    private javax.swing.JLabel labelExpDCP;
    private javax.swing.JLabel labelNameDCP;
    private javax.swing.JLabel labelPhoneDCP;
    private swing.Link linkDCP;
    private javax.swing.JPanel mainPanel4;
    private swing.ProfilePic profilePic;
    // End of variables declaration//GEN-END:variables
}
