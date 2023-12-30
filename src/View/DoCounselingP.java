package View;

import Controller.DCController;
import javax.swing.JPanel;
import swing.RoundComboBox;
import java.awt.CardLayout;


public class DoCounselingP extends javax.swing.JPanel {
    private JPanel cards;
    private CardLayout cardLayout;
    private DCController DCC = new DCController();

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
        TitleExpDCP.setBorder(null);
        TitleExpDCP.setOpaque(false);

        profilePic.setOpaque(false);

        javax.swing.GroupLayout profilePicLayout = new javax.swing.GroupLayout(profilePic);
        profilePic.setLayout(profilePicLayout);
        profilePicLayout.setHorizontalGroup(
            profilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        profilePicLayout.setVerticalGroup(
            profilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanel4Layout = new javax.swing.GroupLayout(mainPanel4);
        mainPanel4.setLayout(mainPanel4Layout);
        mainPanel4Layout.setHorizontalGroup(
            mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel4Layout.createSequentialGroup()
                .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(linkDCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(buttonSetS, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(boxTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boxDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boxKonselor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TitleCounseling, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
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
                .addContainerGap())
        );
        mainPanel4Layout.setVerticalGroup(
            mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel4Layout.createSequentialGroup()
                .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanel4Layout.createSequentialGroup()
                                .addComponent(labelNameDCP)
                                .addGap(4, 4, 4)
                                .addComponent(TitleNameDCP)
                                .addGap(15, 15, 15)
                                .addComponent(labelEmailDCP)
                                .addGap(4, 4, 4)
                                .addComponent(TitleEmailDCP)
                                .addGap(15, 15, 15)
                                .addComponent(labelPhoneDCP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TitlePhoneDCP))
                            .addGroup(mainPanel4Layout.createSequentialGroup()
                                .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelExpDCP)
                        .addGap(4, 4, 4)
                        .addComponent(TitleExpDCP, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(TitleCounseling)
                        .addGap(30, 30, 30)
                        .addComponent(boxKonselor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(boxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(boxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(buttonSetS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
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
                .addContainerGap(15, Short.MAX_VALUE))
        );
        background4Layout.setVerticalGroup(
            background4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(mainPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background4, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Event Methods
    private void boxKonselorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxKonselorActionPerformed
        DCC.setCounselor(boxKonselor, boxDay, boxTime,
                         TitleNameDCP, TitleEmailDCP, TitlePhoneDCP, 
                         TitleExpDCP, profilePic);
    }//GEN-LAST:event_boxKonselorActionPerformed

    private void buttonSetSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSetSActionPerformed
        DCC.setCounseling(this, boxKonselor, boxDay, boxTime);
    }//GEN-LAST:event_buttonSetSActionPerformed

    private void linkDCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkDCPActionPerformed
        DCC.reset(boxKonselor, boxDay, boxTime);
        cardLayout.show(cards, "WelcomeC");
    }//GEN-LAST:event_linkDCPActionPerformed

    private void boxDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDayActionPerformed
        DCC.setDay(boxDay, boxTime);
    }//GEN-LAST:event_boxDayActionPerformed

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
