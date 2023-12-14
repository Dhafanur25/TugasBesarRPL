package Panel;

import swing.*;
import java.net.*;
import java.awt.*;
import javax.swing.JPanel;
import java.io.IOException;

public class WelcomeP extends javax.swing.JPanel {
    private JPanel cards;
    private CardLayout cardLayout;
    
    private DoCounselingP DoCounC;
    
    public WelcomeP(JPanel cards, CardLayout cardLayout, DoCounselingP DoCounC){
        this.cards = cards;
        this.cardLayout = cardLayout;
        this.DoCounC=DoCounC;
        initComponents();
        repaint();
    }

    // Getter Setter Methods
    public TransparentButton getButtonName() {
        return buttonName;
    }
    
    public RightSideProfilePic getProfilePicW() {
        return profilePicW;
    }

    public void setButtonName(TransparentButton buttonName) {
        this.buttonName = buttonName;
    }


    public void setProfilePicW(RightSideProfilePic profilePicW) {
        this.profilePicW = profilePicW;
    }
    
    // Layout Method
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background3 = new Background.Background();
        mainPanel3 = new javax.swing.JPanel();
        labelWelcome = new javax.swing.JLabel();
        labelSuccess = new javax.swing.JLabel();
        buttonDoC = new swing.RoundButton();
        buttonQuiz = new swing.RoundButton();
        link1 = new swing.Link();
        profilePicW = new swing.RightSideProfilePic();
        buttonName = new swing.TransparentButton();

        setPreferredSize(new java.awt.Dimension(700, 453));

        background3.setBlur(mainPanel3);
        background3.setPic("bgWel.png");
        background3.setPreferredSize(new java.awt.Dimension(700, 453));

        mainPanel3.setOpaque(false);

        labelWelcome.setBackground(new java.awt.Color(0, 0, 0));
        labelWelcome.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(0, 0, 0));
        labelWelcome.setText("YouthWellness");

        labelSuccess.setBackground(new java.awt.Color(0, 0, 0));
        labelSuccess.setFont(new java.awt.Font("Cambria Math", 0, 9)); // NOI18N
        labelSuccess.setForeground(new java.awt.Color(0, 0, 0));
        labelSuccess.setText("Nurturing Minds, Inspiring Futures: Empowering Student Success!");

        buttonDoC.setBackground(new java.awt.Color(102, 102, 102));
        buttonDoC.setForeground(new java.awt.Color(255, 255, 255));
        buttonDoC.setText("Start Counseling");
        buttonDoC.setBackgroundColor("#5271ff");
        buttonDoC.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonDoC.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonDoC.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonDoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDoCActionPerformed(evt);
            }
        });

        buttonQuiz.setBackground(new java.awt.Color(102, 102, 102));
        buttonQuiz.setForeground(new java.awt.Color(255, 255, 255));
        buttonQuiz.setText("Quiz");
        buttonQuiz.setBackgroundColor("#5E17EB");
        buttonQuiz.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonQuizActionPerformed(evt);
            }
        });

        link1.setText("<html><font color='black'><u>Feedback</u></font></html>");
        link1.setState1("<html><font color='black'><u>Feedback</u></font></html>");
        link1.setState2("<html><font color='blue'><u>Feedback</u></font></html>");
        link1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                link1ActionPerformed(evt);
            }
        });

        profilePicW.setOpaque(false);

        buttonName.setForeground(new java.awt.Color(0, 0, 0));
        buttonName.setText("Shinta Aiko");
        buttonName.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        buttonName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        buttonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilePicWLayout = new javax.swing.GroupLayout(profilePicW);
        profilePicW.setLayout(profilePicWLayout);
        profilePicWLayout.setHorizontalGroup(
            profilePicWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePicWLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(buttonName, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        profilePicWLayout.setVerticalGroup(
            profilePicWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonName, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanel3Layout = new javax.swing.GroupLayout(mainPanel3);
        mainPanel3.setLayout(mainPanel3Layout);
        mainPanel3Layout.setHorizontalGroup(
            mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel3Layout.createSequentialGroup()
                        .addGroup(mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(labelSuccess))
                            .addGroup(mainPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(buttonDoC, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanel3Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(buttonQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanel3Layout.createSequentialGroup()
                        .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(mainPanel3Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(link1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel3Layout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addComponent(profilePicW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        mainPanel3Layout.setVerticalGroup(
            mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profilePicW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSuccess)
                .addGap(51, 51, 51)
                .addComponent(buttonDoC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(link1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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

    // Event Methods
    private void buttonDoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDoCActionPerformed
        DoCounC.getBoxDay().setEnabled(false);
        DoCounC.getBoxTime().setEnabled(false);
        cardLayout.show(cards, "DoCounC");
    }//GEN-LAST:event_buttonDoCActionPerformed

    private void buttonQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonQuizActionPerformed
        try {
            URI uri = new URI("https://github.com/Dhafanur25/TugasBesarRPL");
            Desktop.getDesktop().browse(uri);
              
        }catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_buttonQuizActionPerformed

    private void buttonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNameActionPerformed
        cardLayout.show(cards, "BioUserC");
    }//GEN-LAST:event_buttonNameActionPerformed

    private void link1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_link1ActionPerformed
        cardLayout.show(cards, "FeedbackC");
    }//GEN-LAST:event_link1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Background.Background background3;
    private swing.RoundButton buttonDoC;
    private swing.TransparentButton buttonName;
    private swing.RoundButton buttonQuiz;
    private javax.swing.JLabel labelSuccess;
    private javax.swing.JLabel labelWelcome;
    private swing.Link link1;
    private javax.swing.JPanel mainPanel3;
    private swing.RightSideProfilePic profilePicW;
    // End of variables declaration//GEN-END:variables
}
