package Panel;

import java.sql.*;
import main.Database;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

public class ForgotP extends JPanel{
    private JPanel cards;
    private CardLayout cardLayout;
    
    public int ID;
    private Database database = Database.getInstance();
   
    public ForgotP(JPanel cards, CardLayout cardLayout){

        this.cards = cards;
        this.cardLayout = cardLayout;
        initComponents();
        repaint();
    }
    
    // Layout Method
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new Background.BackgroundRL();
        mainPanel1 = new javax.swing.JPanel();
        labelForget = new javax.swing.JLabel();
        buttonReset = new swing.CoolButton();
        labelf1 = new javax.swing.JLabel();
        labelf2 = new javax.swing.JLabel();
        isiEmailF = new swing.CoolTextField();
        link2 = new swing.Link();
        isiPasswordF = new swing.PasswordField();
        eyeIcon1 = new swing.EyeIcon();

        setPreferredSize(new java.awt.Dimension(700, 453));

        background1.setBlur(mainPanel1);
        background1.setPreferredSize(new java.awt.Dimension(700, 453));

        mainPanel1.setOpaque(false);

        labelForget.setBackground(new java.awt.Color(0, 0, 0));
        labelForget.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelForget.setForeground(new java.awt.Color(255, 255, 255));
        labelForget.setText("Reset Password");

        buttonReset.setBackground(new java.awt.Color(255, 255, 255));
        buttonReset.setForeground(new java.awt.Color(255, 255, 255));
        buttonReset.setText("Reset Password");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        labelf1.setBackground(new java.awt.Color(0, 0, 0));
        labelf1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        labelf1.setForeground(new java.awt.Color(255, 255, 255));
        labelf1.setText("Enter the Email associated with your");

        labelf2.setBackground(new java.awt.Color(0, 0, 0));
        labelf2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        labelf2.setForeground(new java.awt.Color(255, 255, 255));
        labelf2.setText("account and enter new password");

        isiEmailF.setBackground(new java.awt.Color(0, 0, 0));
        isiEmailF.setHint("Email");

        link2.setText("<html><font color='white'>Back to Login page</font></html>");
        link2.setState1("<html><font color='white'>Back to Login page</font></html>");
        link2.setState2("<html><font color='#3dabf5'>Back to Login page</font></html>");
        link2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                link2ActionPerformed(evt);
            }
        });

        isiPasswordF.setHint("New Password");

        eyeIcon1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                eyeIcon1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout mainPanel1Layout = new javax.swing.GroupLayout(mainPanel1);
        mainPanel1.setLayout(mainPanel1Layout);
        mainPanel1Layout.setHorizontalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(labelForget))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelf1)
                            .addComponent(labelf2)
                            .addComponent(isiEmailF, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanel1Layout.createSequentialGroup()
                                .addComponent(isiPasswordF, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eyeIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(link2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        mainPanel1Layout.setVerticalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelForget)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(labelf1)
                .addGap(0, 0, 0)
                .addComponent(labelf2)
                .addGap(12, 12, 12)
                .addComponent(isiEmailF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eyeIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isiPasswordF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(link2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
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
    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Reset Password?", "Forgot Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION){
            doF();
        }
        
    }//GEN-LAST:event_buttonResetActionPerformed

    private void link2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_link2ActionPerformed
        reset();
        cardLayout.show(cards, "LoginC");
    }//GEN-LAST:event_link2ActionPerformed

    private void eyeIcon1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_eyeIcon1StateChanged
        if(eyeIcon1.isOpen()){
            isiPasswordF.showPassword();
        }else{
            isiPasswordF.hidePassword();
        }
    }//GEN-LAST:event_eyeIcon1StateChanged

    // Secondary Method
    private void doF(){
        ResultSet account = null;
        String pass = isiPasswordF.getText().trim(); 
        String masukan = isiEmailF.getText().trim();
        if(masukan.equals("") ||
            pass.equals("")){
            reset();
            JOptionPane.showMessageDialog(this, "Field cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (pass.length() < 8){
            reset();
            JOptionPane.showMessageDialog(this, "Password must be 8 or more!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean checker = database.check("user","Email", masukan);
        if(checker){
            String sql = "SELECT * FROM konseling_online.user "
                    + "WHERE Email='"+masukan+"';";
            account = database.query(sql);
            try {
                if (account != null && account.next()) {
                    ID = account.getInt("ID");
                } 

            } catch (SQLException e) {
                e.printStackTrace();
            }
            if(updatePass(ID, pass)){
                reset();
                JOptionPane.showMessageDialog(this, "Password has been reset succesfully!", "Reset Password", JOptionPane.INFORMATION_MESSAGE);
                cardLayout.show(cards, "LoginC");
            }else{
                JOptionPane.showMessageDialog(this, "Password has failed to be reset!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(this, "The account doesn't exist!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Helper Methods
    private boolean updatePass(int ID, String pass){
        try {
            String sql = "UPDATE konseling_online.user "
                    + "SET Password='"+pass+"' "
                    + "WHERE ID='"+ID+"';";
            database.update(sql);
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }  
        return false;
    }
    private void reset(){
        isiPasswordF.setText("");
        isiEmailF.setText("");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Background.BackgroundRL background1;
    private swing.CoolButton buttonReset;
    private swing.EyeIcon eyeIcon1;
    private swing.CoolTextField isiEmailF;
    private swing.PasswordField isiPasswordF;
    private javax.swing.JLabel labelForget;
    private javax.swing.JLabel labelf1;
    private javax.swing.JLabel labelf2;
    private swing.Link link2;
    private javax.swing.JPanel mainPanel1;
    // End of variables declaration//GEN-END:variables
}
