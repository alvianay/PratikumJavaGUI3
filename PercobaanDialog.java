
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YOLANDA
 */
public class PercobaanDialog extends javax.swing.JFrame {

    /**
     * Creates new form PercobaanDialog
     */
    public PercobaanDialog() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rbError = new javax.swing.JRadioButton();
        rbInfo = new javax.swing.JRadioButton();
        rbWarning = new javax.swing.JRadioButton();
        rbPlain = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Contoh Penggunaan JOptionPane");

        jButton1.setText("ShowMessage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Yes/No Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Yes/No/Cancel Confirm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Input Dialog(TextField)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Input Dialog(ComboBox)");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Massage Type");

        buttonGroup1.add(rbError);
        rbError.setText("ErrorMessage");

        buttonGroup1.add(rbInfo);
        rbInfo.setText("Information");

        buttonGroup1.add(rbWarning);
        rbWarning.setText("Warning");

        buttonGroup1.add(rbPlain);
        rbPlain.setText("Plain");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbError)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8))
                    .addComponent(rbInfo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbWarning, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbPlain, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbInfo)
                        .addGap(3, 3, 3)
                        .addComponent(rbWarning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbPlain)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)))
                .addComponent(jButton5)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int intoptionType = 0;
        int optionType = 0;
if (rbPlain.isSelected()) optionType = JOptionPane.PLAIN_MESSAGE;
if (rbError.isSelected()) optionType = JOptionPane.ERROR_MESSAGE;
if (rbInfo.isSelected()) optionType = JOptionPane.INFORMATION_MESSAGE;
if (rbWarning.isSelected()) optionType = JOptionPane.WARNING_MESSAGE;

JOptionPane.showMessageDialog(null, "Contoh Show Message",
                "Title Message", optionType);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int intoptionType = 0;
        int optionType = 0;
if (rbPlain.isSelected()) optionType = JOptionPane.PLAIN_MESSAGE;
if (rbError.isSelected()) optionType = JOptionPane.ERROR_MESSAGE;
if (rbInfo.isSelected()) optionType = JOptionPane.INFORMATION_MESSAGE;
if (rbWarning.isSelected()) optionType = JOptionPane.WARNING_MESSAGE;

JOptionPane.showConfirmDialog(null, "SilahkanPilih Yes atau No",
                "Confirm Title", JOptionPane.YES_NO_OPTION, optionType);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int intoptionType = 0;
        int optionType = 0;
if (rbPlain.isSelected()) optionType = JOptionPane.PLAIN_MESSAGE;
if (rbError.isSelected()) optionType = JOptionPane.ERROR_MESSAGE;
if (rbInfo.isSelected()) optionType = JOptionPane.INFORMATION_MESSAGE;
if (rbWarning.isSelected()) optionType = JOptionPane.WARNING_MESSAGE;

JOptionPane.showConfirmDialog(null, "SilahkanPilih Yes, No atau Cancel",
                "Confirm Title", JOptionPane.YES_NO_CANCEL_OPTION, optionType);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int intoptionType = 0;
        int optionType = 0;
if (rbPlain.isSelected()) optionType = JOptionPane.PLAIN_MESSAGE;
if (rbError.isSelected()) optionType = JOptionPane.ERROR_MESSAGE;
if (rbInfo.isSelected()) optionType = JOptionPane.INFORMATION_MESSAGE;
if (rbWarning.isSelected()) optionType = JOptionPane.WARNING_MESSAGE;

JOptionPane.showInputDialog(null, "MasukkannamaAndadisini: ",
                "Input Dialog Title", optionType);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int intoptionType = 0;
        int optionType = 0;
if (rbPlain.isSelected()) optionType = JOptionPane.PLAIN_MESSAGE;
if (rbError.isSelected()) optionType = JOptionPane.ERROR_MESSAGE;
if (rbInfo.isSelected()) optionType = JOptionPane.INFORMATION_MESSAGE;
if (rbWarning.isSelected()) optionType = JOptionPane.WARNING_MESSAGE;

String[] Options = {"Apple", "Mangga", "Nanas", "Jeruk"};
JOptionPane.showInputDialog(null, "Pilihbuahkesukaananda?",
                "Title PilihBuah", optionType, null, Options, "Apple");

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(PercobaanDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PercobaanDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PercobaanDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PercobaanDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PercobaanDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rbError;
    private javax.swing.JRadioButton rbInfo;
    private javax.swing.JRadioButton rbPlain;
    private javax.swing.JRadioButton rbWarning;
    // End of variables declaration//GEN-END:variables
}
