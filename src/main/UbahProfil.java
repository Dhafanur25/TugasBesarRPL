/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

/**
 *
 * @author dhafa
 */
public class UbahProfil extends javax.swing.JFrame {

    /**
     * Creates new form UbahProfil
     */
    public UbahProfil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new Background.Background();
        mainPanel = new javax.swing.JPanel();
        TitleUP = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelNoTelp = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelBio = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        isiNama = new javax.swing.JTextField();
        isiEmail = new javax.swing.JTextField();
        isiNoTelp = new javax.swing.JTextField();
        isiAlamat = new javax.swing.JTextField();
        isiBio = new swing.textarea();
        isiGender = new swing.combobox();
        buttonSimpanPer = new swing.RoundButton();
        buttonUbahFoto = new swing.RoundButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBlur(mainPanel);
        background.setPic("bgUP.png");

        mainPanel.setOpaque(false);

        TitleUP.setBackground(new java.awt.Color(0, 0, 0));
        TitleUP.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        TitleUP.setForeground(new java.awt.Color(0, 0, 0));
        TitleUP.setText("Ubah Profil");

        labelNama.setBackground(new java.awt.Color(0, 0, 0));
        labelNama.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelNama.setForeground(new java.awt.Color(0, 0, 0));
        labelNama.setText("Nama Lengkap");

        labelEmail.setBackground(new java.awt.Color(0, 0, 0));
        labelEmail.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("Email");

        labelNoTelp.setBackground(new java.awt.Color(0, 0, 0));
        labelNoTelp.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelNoTelp.setForeground(new java.awt.Color(0, 0, 0));
        labelNoTelp.setText("Nomor Telfon");

        labelAlamat.setBackground(new java.awt.Color(0, 0, 0));
        labelAlamat.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelAlamat.setForeground(new java.awt.Color(0, 0, 0));
        labelAlamat.setText("Alamat");

        labelBio.setBackground(new java.awt.Color(0, 0, 0));
        labelBio.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelBio.setForeground(new java.awt.Color(0, 0, 0));
        labelBio.setText("Bio");

        labelGender.setBackground(new java.awt.Color(0, 0, 0));
        labelGender.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelGender.setForeground(new java.awt.Color(0, 0, 0));
        labelGender.setText("Jenis Kelamin");

        isiNama.setBackground(new java.awt.Color(217, 217, 217));
        isiNama.setForeground(new java.awt.Color(0, 0, 0));

        isiEmail.setBackground(new java.awt.Color(217, 217, 217));
        isiEmail.setForeground(new java.awt.Color(0, 0, 0));

        isiNoTelp.setBackground(new java.awt.Color(217, 217, 217));
        isiNoTelp.setForeground(new java.awt.Color(0, 0, 0));

        isiAlamat.setBackground(new java.awt.Color(217, 217, 217));
        isiAlamat.setForeground(new java.awt.Color(0, 0, 0));

        isiBio.setColumns(20);
        isiBio.setLineWrap(true);
        isiBio.setRows(5);
        isiBio.setWrapStyleWord(true);

        isiGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Pilih>", "Pria", "Wanita" }));
        isiGender.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                isiGenderPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                isiGenderPopupMenuWillBecomeVisible(evt);
            }
        });

        buttonSimpanPer.setBackground(new java.awt.Color(102, 102, 102));
        buttonSimpanPer.setForeground(new java.awt.Color(255, 255, 255));
        buttonSimpanPer.setText("Simpan Perubahan");
        buttonSimpanPer.setBackgroundColor("#5E17EB");
        buttonSimpanPer.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonSimpanPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanPerActionPerformed(evt);
            }
        });

        buttonUbahFoto.setBackground(new java.awt.Color(102, 102, 102));
        buttonUbahFoto.setForeground(new java.awt.Color(255, 255, 255));
        buttonUbahFoto.setText("Ubah Foto Profil");
        buttonUbahFoto.setBackgroundColor("#5271ff");
        buttonUbahFoto.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonUbahFoto.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonUbahFoto.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonUbahFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonSimpanPer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEmail)
                    .addComponent(TitleUP)
                    .addComponent(labelNama)
                    .addComponent(labelAlamat)
                    .addComponent(labelNoTelp)
                    .addComponent(isiNama)
                    .addComponent(isiEmail)
                    .addComponent(isiNoTelp)
                    .addComponent(isiAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelBio)
                            .addComponent(isiBio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelGender)
                            .addComponent(isiGender, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(buttonUbahFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(TitleUP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(labelBio))
                .addGap(4, 4, 4)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(isiBio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(isiNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(labelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isiEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(labelNoTelp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isiNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(labelGender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isiGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, Short.MAX_VALUE)
                .addComponent(labelAlamat)
                .addGap(6, 6, 6)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonUbahFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isiAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonSimpanPer, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSimpanPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanPerActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonSimpanPerActionPerformed

    private void buttonUbahFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUbahFotoActionPerformed

    private void isiGenderPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_isiGenderPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_isiGenderPopupMenuWillBecomeInvisible

    private void isiGenderPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_isiGenderPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_isiGenderPopupMenuWillBecomeVisible

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UbahProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UbahProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UbahProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UbahProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UbahProfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleUP;
    private Background.Background background;
    private swing.RoundButton buttonSimpanPer;
    private swing.RoundButton buttonUbahFoto;
    private javax.swing.JTextField isiAlamat;
    private swing.textarea isiBio;
    private javax.swing.JTextField isiEmail;
    private swing.combobox isiGender;
    private javax.swing.JTextField isiNama;
    private javax.swing.JTextField isiNoTelp;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelBio;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNoTelp;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
