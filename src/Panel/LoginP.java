package Panel;

import java.sql.*;
import javax.swing.*;
import main.Database;
import swing.LabelArea;
import java.awt.CardLayout;

public class LoginP extends JPanel{
    private JPanel cards;
    private CardLayout cardLayout;
    
    private BioUserP BioUserC;
    private WelcomeP WelcomeC;
    private FeedbackP FeedbackC;
    private WelcomeKonP WelcomeKonC;
    private Database db = Database.getInstance();
  
    public LoginP(JPanel cards, CardLayout cardLayout, BioUserP BioMahC, WelcomeP WelcomeC, FeedbackP FeedbackC, WelcomeKonP WelcomeKonC){
        this.FeedbackC = FeedbackC;
        this.BioUserC = BioMahC;
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
        isiEmailUsernameL = new swing.CoolTextField();
        isiPasswordL = new swing.PasswordField();
        buttonSignIn = new swing.CoolButton();
        link1 = new swing.Link();
        link2 = new swing.Link();
        eyeIcon1 = new swing.EyeIcon();

        setPreferredSize(new java.awt.Dimension(700, 453));

        background1.setBlur(mainPanel1);
        background1.setPreferredSize(new java.awt.Dimension(700, 453));

        mainPanel1.setOpaque(false);

        labelLogin.setBackground(new java.awt.Color(0, 0, 0));
        labelLogin.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("YOUTHWELNESS");

        isiEmailUsernameL.setBackground(new java.awt.Color(0, 0, 0));
        isiEmailUsernameL.setHint("Email/Username");

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
                                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(isiEmailUsernameL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(isiPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(46, 46, 46)
                .addComponent(isiEmailUsernameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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
        
        // Run login checker
        int checker = login(input, passL);
        
        // Login accordingly
        if(checker == 1){
            doLoginKon();
        }else if(checker == 2){
            doLoginUser();
        }else if(input.equals("") ||
                 passL.equals("")){
            JOptionPane.showMessageDialog(this, "Field cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (checker == -1){
            JOptionPane.showMessageDialog(this, "Email/Username doesn't exist!", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(checker == 0){
            JOptionPane.showMessageDialog(this, "Password is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonSignInActionPerformed
    private void link1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_link1ActionPerformed
        clearLogin();
        cardLayout.show(cards, "RegisterC");
    }//GEN-LAST:event_link1ActionPerformed

    private void link2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_link2ActionPerformed
        clearLogin();
        cardLayout.show(cards, "ForgotC");
    }//GEN-LAST:event_link2ActionPerformed

    private void eyeIcon1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_eyeIcon1StateChanged
        if(eyeIcon1.isOpen()){
            isiPasswordL.showPassword();
        }else{
            isiPasswordL.hidePassword();
        }
    }//GEN-LAST:event_eyeIcon1StateChanged
    
    // Secondary Method
    private int login(String masukan, String pass){
        int cek = -1; // Jika username atau email salah
        try {
            // Cek untuk akun konselor dulu
            String sql = "SELECT ID, Email, Password FROM konseling_online.konselor"
                    + " WHERE Email='"+masukan+"';";
            ResultSet resultSet = db.query(sql);
   
            if (resultSet.next()) {
                if (resultSet.getString("Password").equals(pass)){
                    cek = 1; // Jika username/email dan password benar dan masuknya akun konselor
                    db.setIDAccKon(resultSet.getInt("ID"));
                }else{
                    cek = 0; // Jika password salah
                }
            }else{
                sql = "SELECT ID, Email, Username, Password FROM konseling_online.user"
                    + " WHERE Email='"+masukan+"' OR Username='"+masukan+"';";
                resultSet = db.query(sql);
                if (resultSet.next()) {
                    if (resultSet.getString("Password").equals(pass)){
                        cek = 2; // Jika username/email dan password benar dan masuknya akun user
                        db.setIDAccUser(resultSet.getInt("ID"));
                    }else{
                        cek = 0; // Jika password salah
                    }
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    
    // Helper Methods
    private void doLoginKon(){
        String sql = "SELECT * FROM konseling_online.konselor "
                    + "WHERE ID='"+db.getIDAccKon()+"';";
        ResultSet account = db.query(sql);
        
        try {
            if (account != null && account.next()) {
                String nama = account.getString("Nama_Lengkap");

                WelcomeKonC.getTitleName().setText(nama);
            }
            clearLogin();

            WelcomeKonC.fillTable();
            cardLayout.show(cards, "WelcomeKonC");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void doLoginUser(){
        String sql = "SELECT * FROM konseling_online.user "
                    + "WHERE ID='"+db.getIDAccUser()+"';";
        ResultSet account = db.query(sql);
        try {
            if (account != null && account.next()) {
                String nama = account.getString("Nama_Lengkap");
                String email = account.getString("Email");
                String uName = account.getString("Username");
                String noTelp = account.getString("No_Telp");
                String address = account.getString("Alamat");
                String bio = account.getString("Bio");
                String profilePic = account.getString("Profile_Pic_Path");

                WelcomeC.getButtonName().setText(nama);
                WelcomeC.getProfilePicW().setPic((profilePic != null) ? profilePic : db.getDefaults());
                BioUserC.getProfilePicBU().setPic((profilePic != null) ? profilePic : db.getDefaults());
                BioUserC.getTitleNama().setText(nama);
                BioUserC.getTitleEmailBU().setText(email);
                BioUserC.getTitleUNameBU().setText(uName);
                BioUserC.getTitlePhoneBU().setText((noTelp != null) ? noTelp : "-" );
                BioUserC.getTitleAddressBU().setText((address != null) ? address : "-" );
                BioUserC.getTitleBioBU().setText((bio != null) ? bio : "-" );
            } 
            clearLogin();
            
            cardLayout.show(cards, "WelcomeC");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        LabelArea[] cList = {FeedbackC.getC1(), FeedbackC.getC2(), FeedbackC.getC3(), FeedbackC.getC4(), FeedbackC.getC5()};
        
        sql = "SELECT * FROM konseling_online.feedback "
             + "WHERE id_user='"+db.getIDAccUser()+"';";
        ResultSet fb = db.query(sql);
        
        try {
            int i = 0; 
            while (fb.next() && i < cList.length) {
                cList[i].setText(fb.getString("isi_feedback"));
                i++;
            }
            while (i < cList.length) {
                cList[i].setText("");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void clearLogin(){
        JTextField[] textFields = {isiEmailUsernameL, isiPasswordL};

        for (JTextField textField : textFields) {
            textField.setText("");
        }
    }

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
