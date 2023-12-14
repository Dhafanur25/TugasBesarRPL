package Panel;

import java.awt.*;
import javax.swing.*;
import main.Database;
import swing.ProfilePic;

public class BioUserP extends javax.swing.JPanel {
    private JPanel cards;
    private CardLayout cardLayout;
    
    private ScheduleP ScheduleC;
    private Database db = Database.getInstance();
    
    public BioUserP(JPanel cards, CardLayout cardLayout, ScheduleP ScheduleC){
        this.cards = cards;
        this.cardLayout = cardLayout;
        this.ScheduleC = ScheduleC;
        initComponents();
    }
    
    // Getter Methods
    public JLabel getTitleAlamatBU() {
        return TitleAddressBU;
    }

    public JTextArea getTitleBioBU() {
        return TitleBioBU;
    }

    public JLabel getTitleEmailBU() {
        return TitleEmailBU;
    }

    public JLabel getTitleNama() {
        return TitleName;
    }

    public JLabel getTitleNoTelpBU() {
        return TitlePhoneBU;
    }

    public JLabel getTitleUNameBU() {
        return TitleUNameBU;
    }

    public ProfilePic getProfilePicBU() {
        return profilePicBU;
    }

    public JLabel getTitleAddressBU() {
        return TitleAddressBU;
    }

    public JLabel getTitlePhoneBU() {
        return TitlePhoneBU;
    }
    
    // Layout Method
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background7 = new Background.Background();
        mainPanel7 = new javax.swing.JPanel();
        profilePicBU = new swing.ProfilePic();
        TitleName = new javax.swing.JLabel();
        buttonChangeProfile = new swing.RoundButton();
        buttonLogOut = new swing.RoundButton();
        labelEmailBU = new javax.swing.JLabel();
        TitleEmailBU = new javax.swing.JLabel();
        labelUserNameBU = new javax.swing.JLabel();
        TitleUNameBU = new javax.swing.JLabel();
        labelPhoneBU = new javax.swing.JLabel();
        TitlePhoneBU = new javax.swing.JLabel();
        labelAddressBU = new javax.swing.JLabel();
        TitleAddressBU = new javax.swing.JLabel();
        labelBioBU = new javax.swing.JLabel();
        TitleBioBU = new javax.swing.JTextArea();
        linkBU = new swing.Link();
        buttonSchedule = new swing.RoundButton();

        setPreferredSize(new java.awt.Dimension(700, 453));

        background7.setBlur(mainPanel7);
        background7.setPic("bgBioMah.png");
        background7.setPreferredSize(new java.awt.Dimension(700, 453));

        mainPanel7.setOpaque(false);

        profilePicBU.setOpaque(false);
        profilePicBU.setPic("C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/img/imgEmpty.jpg");

        javax.swing.GroupLayout profilePicBULayout = new javax.swing.GroupLayout(profilePicBU);
        profilePicBU.setLayout(profilePicBULayout);
        profilePicBULayout.setHorizontalGroup(
            profilePicBULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );
        profilePicBULayout.setVerticalGroup(
            profilePicBULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        TitleName.setBackground(new java.awt.Color(0, 0, 0));
        TitleName.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        TitleName.setForeground(new java.awt.Color(0, 0, 0));
        TitleName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleName.setText("Shinta Aiko");

        buttonChangeProfile.setBackground(new java.awt.Color(102, 102, 102));
        buttonChangeProfile.setForeground(new java.awt.Color(255, 255, 255));
        buttonChangeProfile.setText("Change Profile");
        buttonChangeProfile.setBackgroundColor("#5271ff");
        buttonChangeProfile.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonChangeProfile.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonChangeProfile.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonChangeProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeProfileActionPerformed(evt);
            }
        });

        buttonLogOut.setBackground(new java.awt.Color(102, 102, 102));
        buttonLogOut.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogOut.setText("Log Out");
        buttonLogOut.setBackgroundColor("#5E17EB");
        buttonLogOut.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonLogOut.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonLogOut.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogOutActionPerformed(evt);
            }
        });

        labelEmailBU.setBackground(new java.awt.Color(0, 0, 0));
        labelEmailBU.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        labelEmailBU.setForeground(new java.awt.Color(51, 51, 51));
        labelEmailBU.setText("Email");

        TitleEmailBU.setBackground(new java.awt.Color(0, 0, 0));
        TitleEmailBU.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        TitleEmailBU.setForeground(new java.awt.Color(0, 0, 0));
        TitleEmailBU.setText("Shinaiko@gmail.com");

        labelUserNameBU.setBackground(new java.awt.Color(0, 0, 0));
        labelUserNameBU.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        labelUserNameBU.setForeground(new java.awt.Color(51, 51, 51));
        labelUserNameBU.setText("Username");

        TitleUNameBU.setBackground(new java.awt.Color(0, 0, 0));
        TitleUNameBU.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        TitleUNameBU.setForeground(new java.awt.Color(0, 0, 0));
        TitleUNameBU.setText("Meowko");

        labelPhoneBU.setBackground(new java.awt.Color(0, 0, 0));
        labelPhoneBU.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        labelPhoneBU.setForeground(new java.awt.Color(51, 51, 51));
        labelPhoneBU.setText("Phone Number");

        TitlePhoneBU.setBackground(new java.awt.Color(0, 0, 0));
        TitlePhoneBU.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        TitlePhoneBU.setForeground(new java.awt.Color(0, 0, 0));
        TitlePhoneBU.setText("-");

        labelAddressBU.setBackground(new java.awt.Color(0, 0, 0));
        labelAddressBU.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        labelAddressBU.setForeground(new java.awt.Color(51, 51, 51));
        labelAddressBU.setText("Address");

        TitleAddressBU.setBackground(new java.awt.Color(0, 0, 0));
        TitleAddressBU.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        TitleAddressBU.setForeground(new java.awt.Color(0, 0, 0));
        TitleAddressBU.setText("-");

        labelBioBU.setBackground(new java.awt.Color(0, 0, 0));
        labelBioBU.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        labelBioBU.setForeground(new java.awt.Color(51, 51, 51));
        labelBioBU.setText("Bio");

        TitleBioBU.setEditable(false);
        TitleBioBU.setBackground(new java.awt.Color(255, 255, 255));
        TitleBioBU.setColumns(20);
        TitleBioBU.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        TitleBioBU.setForeground(new java.awt.Color(0, 0, 0));
        TitleBioBU.setRows(5);
        TitleBioBU.setText("-");
        TitleBioBU.setOpaque(false);

        linkBU.setText("<html><font color='purple'>&#9664; HOME</font></html>");
        linkBU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        linkBU.setState1("<html><font color='purple'>&#9664; HOME</font></html>");
        linkBU.setState2("<html><font color='blue'>&#9664; HOME</font></html>");
        linkBU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkBUActionPerformed(evt);
            }
        });

        buttonSchedule.setBackground(new java.awt.Color(102, 102, 102));
        buttonSchedule.setText("Schedule");
        buttonSchedule.setBackgroundColor("#DFDFDF");
        buttonSchedule.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonSchedule.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonSchedule.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonScheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanel7Layout = new javax.swing.GroupLayout(mainPanel7);
        mainPanel7.setLayout(mainPanel7Layout);
        mainPanel7Layout.setHorizontalGroup(
            mainPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel7Layout.createSequentialGroup()
                .addGroup(mainPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel7Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(mainPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonChangeProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanel7Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(profilePicBU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(linkBU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(TitleName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addGroup(mainPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAddressBU)
                    .addComponent(labelEmailBU)
                    .addComponent(TitleEmailBU, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPhoneBU)
                    .addComponent(TitlePhoneBU, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBioBU)
                    .addComponent(TitleAddressBU, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUserNameBU)
                    .addComponent(TitleUNameBU, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleBioBU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        mainPanel7Layout.setVerticalGroup(
            mainPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel7Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(mainPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanel7Layout.createSequentialGroup()
                        .addComponent(labelEmailBU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TitleEmailBU)
                        .addGap(18, 18, 18)
                        .addComponent(labelUserNameBU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TitleUNameBU)
                        .addGap(18, 18, 18)
                        .addComponent(labelPhoneBU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TitlePhoneBU)
                        .addGap(18, 18, 18)
                        .addComponent(labelAddressBU))
                    .addGroup(mainPanel7Layout.createSequentialGroup()
                        .addComponent(profilePicBU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TitleName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(buttonSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(mainPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(buttonChangeProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(buttonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(linkBU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel7Layout.createSequentialGroup()
                        .addComponent(TitleAddressBU)
                        .addGap(18, 18, 18)
                        .addComponent(labelBioBU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TitleBioBU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout background7Layout = new javax.swing.GroupLayout(background7);
        background7.setLayout(background7Layout);
        background7Layout.setHorizontalGroup(
            background7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        background7Layout.setVerticalGroup(
            background7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background7Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(mainPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Event Methods
    private void buttonChangeProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeProfileActionPerformed
        cardLayout.show(cards, "ChangeProfileC");
    }//GEN-LAST:event_buttonChangeProfileActionPerformed

    private void buttonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogOutActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Confirm Logout?", "LogOut", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION){
            // Call doSetSchedule() when OK button is pressed
            db.setIDAccUser(0);
            cardLayout.show(cards, "LoginC");
        }
    }//GEN-LAST:event_buttonLogOutActionPerformed

    private void linkBUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkBUActionPerformed
        cardLayout.show(cards, "WelcomeC");
    }//GEN-LAST:event_linkBUActionPerformed

    private void buttonScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonScheduleActionPerformed
        ScheduleC.fillTable();
        cardLayout.show(cards, "ScheduleC");
    }//GEN-LAST:event_buttonScheduleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleAddressBU;
    private javax.swing.JTextArea TitleBioBU;
    private javax.swing.JLabel TitleEmailBU;
    private javax.swing.JLabel TitleName;
    private javax.swing.JLabel TitlePhoneBU;
    private javax.swing.JLabel TitleUNameBU;
    private Background.Background background7;
    private swing.RoundButton buttonChangeProfile;
    private swing.RoundButton buttonLogOut;
    private swing.RoundButton buttonSchedule;
    private javax.swing.JLabel labelAddressBU;
    private javax.swing.JLabel labelBioBU;
    private javax.swing.JLabel labelEmailBU;
    private javax.swing.JLabel labelPhoneBU;
    private javax.swing.JLabel labelUserNameBU;
    private swing.Link linkBU;
    private javax.swing.JPanel mainPanel7;
    public swing.ProfilePic profilePicBU;
    // End of variables declaration//GEN-END:variables
}
