/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author jackson
 */
public class ACAppFinal extends javax.swing.JFrame {

    /**
     * Creates new form ContactEditorUI
     */
    public ACAppFinal() {
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

        increaseButton = new javax.swing.JButton();
        decreaseButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timerTextField = new javax.swing.JTextField();
        heaterButton = new javax.swing.JButton();
        coolerButton = new javax.swing.JButton();
        smartLabel = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        smartModeButton = new javax.swing.JButton();
        label = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        timerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(2, 66, 233));

        increaseButton.setText("Increase");
        increaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseButtonActionPerformed(evt);
            }
        });

        decreaseButton.setText("Decrease");
        decreaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Set Timer:");

        timerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerTextFieldActionPerformed(evt);
            }
        });

        heaterButton.setText("HeaterMode");
        heaterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heaterButtonActionPerformed(evt);
            }
        });

        coolerButton.setText("CoolerMode");
        coolerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coolerButtonActionPerformed(evt);
            }
        });

        smartLabel.setText("Smart-Mode:");

        smartModeButton.setText("Show the best temperature");
        smartModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smartModeButtonActionPerformed(evt);
            }
        });

        label.setEditable(false);
        label.setFont(new java.awt.Font("Ubuntu Condensed", 0, 24)); // NOI18N
        label.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelActionPerformed(evt);
            }
        });

        jButton6.setText("On");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        timerButton.setText("Set Timer");
        timerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(increaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(timerButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(decreaseButton)
                                .addGap(83, 83, 83)
                                .addComponent(heaterButton)
                                .addGap(18, 18, 18)
                                .addComponent(coolerButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(smartModeButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(smartLabel)
                                        .addGap(30, 30, 30)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(increaseButton)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timerButton))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decreaseButton)
                    .addComponent(heaterButton)
                    .addComponent(coolerButton))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smartLabel))
                .addGap(18, 18, 18)
                .addComponent(smartModeButton)
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerTextFieldActionPerformed
        
    }//GEN-LAST:event_timerTextFieldActionPerformed

    private void increaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseButtonActionPerformed
        currentTemp++;
        label.setText("" + currentTemp);
    }//GEN-LAST:event_increaseButtonActionPerformed

    private void labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelActionPerformed
        int currentTemp = 24;
        
    }//GEN-LAST:event_labelActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     label.setText("" + currentTemp);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void timerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerButtonActionPerformed
        int hours;
        
        jLabel2.setText("Timer has been set for " + timerTextField.getText() + " hours");
    }//GEN-LAST:event_timerButtonActionPerformed

    private void decreaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseButtonActionPerformed
        currentTemp--;
        label.setText("" + currentTemp);        // TODO add your handling code here:
    }//GEN-LAST:event_decreaseButtonActionPerformed

    private void heaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heaterButtonActionPerformed
        int heaterTemp = 30;
        label.setText("" + heaterTemp);
    }//GEN-LAST:event_heaterButtonActionPerformed

    private void coolerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coolerButtonActionPerformed
        int coolerTemp = 16;
        label.setText("" + coolerTemp);
    }//GEN-LAST:event_coolerButtonActionPerformed

    private void smartModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smartModeButtonActionPerformed
        int tempSmartMode = Integer.parseInt(jTextField2.getText());
        int finalTemp = 0;
        
        // Logic for smart-mode settings:
        if (tempSmartMode >= 40 && tempSmartMode <= 50)
        {
            finalTemp = 20;
            label.setText("" + finalTemp);
        }
        else if (tempSmartMode >= 30 && tempSmartMode <= 40)
        {
            finalTemp = 24;
            label.setText("" + finalTemp);
        }
        else
        {
            finalTemp = 16;
            label.setText("" + finalTemp);
        }
    }//GEN-LAST:event_smartModeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ACAppFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ACAppFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ACAppFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ACAppFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACAppFinal().setVisible(true);
            }
        });
    }
    // Static values declaration
    private static int currentTemp = 24;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coolerButton;
    private javax.swing.JButton decreaseButton;
    private javax.swing.JButton heaterButton;
    private javax.swing.JButton increaseButton;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField label;
    private javax.swing.JLabel smartLabel;
    private javax.swing.JButton smartModeButton;
    private javax.swing.JButton timerButton;
    private javax.swing.JTextField timerTextField;
    // End of variables declaration//GEN-END:variables
}
