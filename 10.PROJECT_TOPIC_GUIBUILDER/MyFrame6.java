/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectTopics_GUIBUILDER.apps;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.String.valueOf;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MyFrame6 extends javax.swing.JFrame {

    /**
     * Creates new form MyFrame6
     */
    public MyFrame6() {
        super("Prashant`s Frame");
        initComponents();
        super.setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image img=tk.getImage("D:\\icon.png");
        super.setIconImage(img);
        myPanel.setBackground(Color.cyan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMeters = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("KM TO METER CONVERTER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Enter KM");

        txtKM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKMActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("After Convertiong To Meter");

        txtMeters.setEditable(false);
        txtMeters.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMeters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetersActionPerformed(evt);
            }
        });

        btnConvert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myPanelLayout = new javax.swing.GroupLayout(myPanel);
        myPanel.setLayout(myPanelLayout);
        myPanelLayout.setHorizontalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelLayout.createSequentialGroup()
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myPanelLayout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMeters, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(219, 219, 219))
        );
        myPanelLayout.setVerticalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMeters, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvert)
                    .addComponent(btnClear)
                    .addComponent(btnQuit))
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       txtKM.setText("");
       txtMeters.setText("");
       txtKM.requestFocus();
       txtMeters.setForeground(Color.black);
       
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKMActionPerformed
        
    }//GEN-LAST:event_txtKMActionPerformed

    private void txtMetersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetersActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
       int ans=JOptionPane.showConfirmDialog(null,"Are you sure to quit ?" ,"exit", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
       if(ans==JOptionPane.YES_OPTION){
         System.exit(0);
       }
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        String Km=txtKM.getText();
        try{
        int kiloMeter=Integer.parseInt(Km.trim());
        long meters=kiloMeter*1000L;
        txtMeters.setText(valueOf(meters));
        }catch(NumberFormatException ex){
//        txtMeters.setText("Only digits allow!");
//        txtMeters.setForeground(Color.red);
//          ImageIcon icon=new ImageIcon("D:\\cross.jpg");
//          JOptionPane.showMessageDialog(null,"Plese enter digits only!","exit",JOptionPane.PLAIN_MESSAGE,icon);
          JOptionPane.showMessageDialog(null,"Plese enter digits only!","exit",JOptionPane.ERROR_MESSAGE);
      
        }
    }//GEN-LAST:event_btnConvertActionPerformed

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
            java.util.logging.Logger.getLogger(MyFrame6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnQuit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel myPanel;
    private javax.swing.JTextField txtKM;
    private javax.swing.JTextField txtMeters;
    // End of variables declaration//GEN-END:variables
}
