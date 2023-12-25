package View;

import javax.swing.*;
import Controller.RController;
import java.awt.CardLayout;

public class RegisterP extends JPanel {
    private JPanel cards;
    private CardLayout cardLayout;
    
    private RController RC = new RController();

    public RegisterP(JPanel cards, CardLayout cardLayout){
        this.cards = cards;
        this.cardLayout = cardLayout;
        initComponents();
        repaint();
    }

    // Layout Method
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background2 = new Background.BackgroundRL();
        mainPanel2 = new javax.swing.JPanel();
        labelRegis = new javax.swing.JLabel();
        isiNameR = new swing.CoolTextField();
        isiEmailR = new swing.CoolTextField();
        isiUsernameR = new swing.CoolTextField();
        checR = new swing.CoolCheckBox();
        buttonRegis = new swing.CoolButton();
        link2 = new swing.Link();
        isiPasswordR = new swing.PasswordField();
        eyeIcon = new swing.EyeIcon();
        link3 = new swing.Link();

        background2.setBlur(mainPanel2);
        background2.setPreferredSize(new java.awt.Dimension(700, 453));

        mainPanel2.setOpaque(false);

        labelRegis.setBackground(new java.awt.Color(0, 0, 0));
        labelRegis.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelRegis.setForeground(new java.awt.Color(255, 255, 255));
        labelRegis.setText("Register Account");

        isiNameR.setHint("Full Name");

        isiEmailR.setHint("Email");

        isiUsernameR.setHint("Username");

        checR.setText("");

        buttonRegis.setBackground(new java.awt.Color(255, 255, 255));
        buttonRegis.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegis.setText("Register");
        buttonRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisActionPerformed(evt);
            }
        });

        link2.setText("<html><font color='white'>Already have an account? <font color='white'>Log in</font></font></html>");
        link2.setState1("<html><font color='white'>Already have an account? <font color='white'>Log in</font></font></html>");
        link2.setState2("<html><font color='white'>Already have an account? <font color='#3dabf5'>Log in</font></font></html>");
        link2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                link2ActionPerformed(evt);
            }
        });

        isiPasswordR.setHint("Password");

        eyeIcon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                eyeIconStateChanged(evt);
            }
        });

        link3.setText("<html><font color='white'>Agree to terms and conditions</font></html>");
        link3.setState1("<html><font color='white'>Agree to terms and conditions</font></html>");
        link3.setState2("<html><font color='#3dabf5'>Agree to terms and conditions</font></html>");
        link3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                link3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanel2Layout = new javax.swing.GroupLayout(mainPanel2);
        mainPanel2.setLayout(mainPanel2Layout);
        mainPanel2Layout.setHorizontalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(isiPasswordR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(isiEmailR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(isiUsernameR, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                                    .addComponent(isiNameR, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eyeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                        .addComponent(checR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(link3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))))
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(labelRegis))
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(link2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(buttonRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanel2Layout.setVerticalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelRegis)
                .addGap(18, 18, 18)
                .addComponent(isiNameR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isiEmailR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isiUsernameR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eyeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isiPasswordR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(link3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(link2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(mainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(mainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Event Methods
    private void buttonRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisActionPerformed
        String nama = isiNameR.getText().trim();
        String email = isiEmailR.getText().trim();
        String uName = isiUsernameR.getText().trim();
        String pass = isiPasswordR.getText().trim();
        JTextField[] textFields = {isiNameR, isiPasswordR, isiEmailR, isiUsernameR};
        RC.doReg(this, nama, email, uName, pass, checR, textFields, cards, cardLayout);
    }//GEN-LAST:event_buttonRegisActionPerformed

    private void link2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_link2ActionPerformed
        JTextField[] textFields = {isiNameR, isiPasswordR, isiEmailR, isiUsernameR};
        RC.reset(checR, textFields);
        cardLayout.show(cards, "LoginC");
    }//GEN-LAST:event_link2ActionPerformed

    private void eyeIconStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_eyeIconStateChanged
        if(eyeIcon.isOpen()){
            isiPasswordR.showPassword();
        }else{
            isiPasswordR.hidePassword();
        }
    }//GEN-LAST:event_eyeIconStateChanged
    
    private void link3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_link3ActionPerformed
        RC.TermsAndCondition(checR);
    }//GEN-LAST:event_link3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Background.BackgroundRL background2;
    private swing.CoolButton buttonRegis;
    private swing.CoolCheckBox checR;
    private swing.EyeIcon eyeIcon;
    private swing.CoolTextField isiEmailR;
    private swing.CoolTextField isiNameR;
    private swing.PasswordField isiPasswordR;
    private swing.CoolTextField isiUsernameR;
    private javax.swing.JLabel labelRegis;
    private swing.Link link2;
    private swing.Link link3;
    private javax.swing.JPanel mainPanel2;
    // End of variables declaration//GEN-END:variables
}
