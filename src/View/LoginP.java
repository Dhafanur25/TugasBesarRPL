package View;

import javax.swing.*;
import Controller.LController;
import java.awt.CardLayout;

public class LoginP extends JPanel{
    private JPanel cards;
    private CardLayout cardLayout;
    
    private BioUserP BioUserC;
    private WelcomeP WelcomeC;
    private FeedbackP FeedbackC;
    private WelcomeKonP WelcomeKonC;
    private LController LC = new LController();
            
    public LoginP(JPanel cards, CardLayout cardLayout, BioUserP BioUserC, WelcomeP WelcomeC, FeedbackP FeedbackC, WelcomeKonP WelcomeKonC){
        this.FeedbackC = FeedbackC;
        this.BioUserC = BioUserC;
        this.WelcomeC = WelcomeC;
        this.WelcomeKonC = WelcomeKonC;
        this.cards = cards;
        this.cardLayout = cardLayout;
        initComponents();
    }
    
    // Layout Method
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new Background.BackgroundRL();
        mainPanel1 = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        isiPasswordL = new swing.PasswordField();
        buttonSignIn = new swing.CoolButton();
        link1 = new swing.Link();
        link2 = new swing.Link();
        eyeIcon1 = new swing.EyeIcon();
        isiEmailUsernameL = new swing.CoolTextField();

        setPreferredSize(new java.awt.Dimension(700, 453));

        background1.setBlur(mainPanel1);
        background1.setPreferredSize(new java.awt.Dimension(700, 453));

        mainPanel1.setOpaque(false);

        labelLogin.setBackground(new java.awt.Color(0, 0, 0));
        labelLogin.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("YOUTHWELNESS");

        isiPasswordL.setHint("Password");

        buttonSignIn.setBackground(new java.awt.Color(255, 255, 255));
        buttonSignIn.setForeground(new java.awt.Color(255, 255, 255));
        buttonSignIn.setText("Sign In");
        buttonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignInActionPerformed(evt);
            }
        });

        link1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                link1ActionPerformed(evt);
            }
        });

        link2.setText("<html><font color='white'>Forgot your Password?</font></html>");
        link2.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        link2.setState1("<html><font color='white'>Forgot your Password?</font></html>");
        link2.setState2("<html><font color='#3dabf5'>Forgot your Password?</font></html>");
        link2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                link2ActionPerformed(evt);
            }
        });

        eyeIcon1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                eyeIcon1StateChanged(evt);
            }
        });

        isiEmailUsernameL.setHint("Email/Username");

        javax.swing.GroupLayout mainPanel1Layout = new javax.swing.GroupLayout(mainPanel1);
        mainPanel1.setLayout(mainPanel1Layout);
        mainPanel1Layout.setHorizontalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(labelLogin))
                            .addComponent(link2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanel1Layout.createSequentialGroup()
                                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(isiEmailUsernameL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(isiPasswordL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eyeIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(link1)
                            .addComponent(buttonSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        mainPanel1Layout.setVerticalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelLogin)
                .addGap(58, 58, 58)
                .addComponent(isiEmailUsernameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eyeIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isiPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(link2, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(link1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Event Methods
    private void buttonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignInActionPerformed
        // Take input
        String passL = isiPasswordL.getText();
        String input = isiEmailUsernameL.getText().trim();
        LC.mLogin(this, passL, input,isiEmailUsernameL, isiPasswordL, cards,
        cardLayout, BioUserC, WelcomeC, FeedbackC, WelcomeKonC);
    }//GEN-LAST:event_buttonSignInActionPerformed
    private void link1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_link1ActionPerformed
        LC.clearLogin(isiEmailUsernameL, isiPasswordL);
        cardLayout.show(cards, "RegisterC");
    }//GEN-LAST:event_link1ActionPerformed

    private void link2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_link2ActionPerformed
        LC.clearLogin(isiEmailUsernameL, isiPasswordL);
        cardLayout.show(cards, "ForgotC");
    }//GEN-LAST:event_link2ActionPerformed

    private void eyeIcon1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_eyeIcon1StateChanged
        if(eyeIcon1.isOpen()){
            isiPasswordL.showPassword();
        }else{
            isiPasswordL.hidePassword();
        }
    }//GEN-LAST:event_eyeIcon1StateChanged
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Background.BackgroundRL background1;
    private swing.CoolButton buttonSignIn;
    private swing.EyeIcon eyeIcon1;
    private swing.CoolTextField isiEmailUsernameL;
    private swing.PasswordField isiPasswordL;
    private javax.swing.JLabel labelLogin;
    private swing.Link link1;
    private swing.Link link2;
    private javax.swing.JPanel mainPanel1;
    // End of variables declaration//GEN-END:variables
}
