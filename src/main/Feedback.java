/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.CardLayout;

/**
 *
 * @author dhafa
 */
public class Feedback extends javax.swing.JFrame {

    /**
     * Creates new form LakukanKonseling
     */
    CardLayout cardLayout;
    public Feedback() {
        initComponents();
        cardLayout = (CardLayout) cardPanel.getLayout();
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
        TitleFB = new javax.swing.JLabel();
        labelTulisFB = new javax.swing.JLabel();
        labelTopFB = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        c1 = new swing.LabelArea();
        c2 = new swing.LabelArea();
        c3 = new swing.LabelArea();
        c4 = new swing.LabelArea();
        c5 = new swing.LabelArea();
        buttonFeedback = new swing.RoundButton();
        buttonPrev = new swing.RoundButton();
        buttonNext = new swing.RoundButton();
        link = new swing.Link3();
        isiFB = new swing.LabelArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(663, 440));

        background.setBlur(mainPanel);
        background.setPic("bgFB.png");

        mainPanel.setOpaque(false);

        TitleFB.setBackground(new java.awt.Color(0, 0, 0));
        TitleFB.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        TitleFB.setForeground(new java.awt.Color(0, 0, 0));
        TitleFB.setText("Feedback");

        labelTulisFB.setBackground(new java.awt.Color(0, 0, 0));
        labelTulisFB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelTulisFB.setForeground(new java.awt.Color(0, 0, 0));
        labelTulisFB.setText("Tulis Feedback");

        labelTopFB.setBackground(new java.awt.Color(0, 0, 0));
        labelTopFB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelTopFB.setForeground(new java.awt.Color(0, 0, 0));
        labelTopFB.setText("Top Feedback");

        cardPanel.setOpaque(false);
        cardPanel.setLayout(new java.awt.CardLayout());

        c1.setColumns(20);
        c1.setRows(5);
        c1.setText("Hello");
        cardPanel.add(c1, "card2");

        c2.setColumns(20);
        c2.setRows(5);
        c2.setText("Konselor Baik");
        cardPanel.add(c2, "card2");

        c3.setColumns(20);
        c3.setRows(5);
        c3.setText("Aplikasi Bagus");
        c3.setToolTipText("");
        cardPanel.add(c3, "card2");

        c4.setColumns(20);
        c4.setRows(5);
        c4.setText("gwenchana");
        cardPanel.add(c4, "card2");

        c5.setColumns(20);
        c5.setRows(5);
        c5.setText("seru");
        c5.setToolTipText("");
        cardPanel.add(c5, "card2");

        buttonFeedback.setBackground(new java.awt.Color(102, 102, 102));
        buttonFeedback.setForeground(new java.awt.Color(255, 255, 255));
        buttonFeedback.setText("Kirim Feedback");
        buttonFeedback.setBackgroundColor("#5E17EB");
        buttonFeedback.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonFeedback.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonFeedback.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFeedbackActionPerformed(evt);
            }
        });

        buttonPrev.setBackground(new java.awt.Color(102, 102, 102));
        buttonPrev.setForeground(new java.awt.Color(255, 255, 255));
        buttonPrev.setText("Prev");
        buttonPrev.setBackgroundColor("#5271ff");
        buttonPrev.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonPrev.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonPrev.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrevActionPerformed(evt);
            }
        });

        buttonNext.setBackground(new java.awt.Color(102, 102, 102));
        buttonNext.setForeground(new java.awt.Color(255, 255, 255));
        buttonNext.setText("Next");
        buttonNext.setBackgroundColor("#5271ff");
        buttonNext.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonNext.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonNext.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextActionPerformed(evt);
            }
        });

        link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkActionPerformed(evt);
            }
        });

        isiFB.setEditable(true);
        isiFB.setBackground(new java.awt.Color(217, 217, 217));
        isiFB.setColumns(20);
        isiFB.setRows(5);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleFB)
                    .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isiFB, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTulisFB))
                        .addGap(68, 68, 68)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTopFB))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(TitleFB)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTulisFB)
                                .addGap(124, 124, 124))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(isiFB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(buttonFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTopFB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void buttonFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFeedbackActionPerformed
        // TODO add your handling code here:
        isiFB.setText("");
    }//GEN-LAST:event_buttonFeedbackActionPerformed

    private void buttonPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrevActionPerformed
        // TODO add your handling code here:
        cardLayout.previous(cardPanel);

    }//GEN-LAST:event_buttonPrevActionPerformed

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNextActionPerformed
        // TODO add your handling code here:
        cardLayout.next(cardPanel);

    }//GEN-LAST:event_buttonNextActionPerformed

    private void linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkActionPerformed
        // TODO add your handling code here:
        dispose();
        Welcome x = new Welcome();
        x.setVisible(true);
    }//GEN-LAST:event_linkActionPerformed

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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleFB;
    private Background.Background background;
    private swing.RoundButton buttonFeedback;
    private swing.RoundButton buttonNext;
    private swing.RoundButton buttonPrev;
    private swing.LabelArea c1;
    private swing.LabelArea c2;
    private swing.LabelArea c3;
    private swing.LabelArea c4;
    private swing.LabelArea c5;
    private javax.swing.JPanel cardPanel;
    private swing.LabelArea isiFB;
    private javax.swing.JLabel labelTopFB;
    private javax.swing.JLabel labelTulisFB;
    private swing.Link3 link;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
