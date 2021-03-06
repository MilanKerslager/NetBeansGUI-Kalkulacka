package main;

import javax.swing.JOptionPane;
import javax.swing.text.DefaultEditorKit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class HlavniOkno extends javax.swing.JFrame {

    /**
     * Creates new form HlavniOkno
     */
    public HlavniOkno() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextFieldOperand1 = new javax.swing.JTextField();
        jTextFieldOperand2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelVysledek = new javax.swing.JLabel();
        jButtonVypočti = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBoxOperator = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCopy = new javax.swing.JMenuItem();
        jMenuItemVlozit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemOProgramu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulačka");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kalkulačka");

        jTextFieldOperand1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldOperand1.setText("3");

        jTextFieldOperand2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldOperand2.setText("5");

        jLabel3.setText("=");

        jLabelVysledek.setText("Výsledek");

        jButtonVypočti.setText("Vypočti!");
        jButtonVypočti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVypočtiActionPerformed(evt);
            }
        });

        jButton1.setText("Konec");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxOperator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));

        jMenu1.setText("Soubor");

        jMenuItem1.setText("Ukončit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Upravit");

        jMenuItemCopy.setAction(new DefaultEditorKit.CopyAction());
        jMenuItemCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCopy.setText("Kopírovat");
        jMenu2.add(jMenuItemCopy);

        jMenuItemVlozit.setAction(new DefaultEditorKit.PasteAction());
        jMenuItemVlozit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemVlozit.setText("Vložit");
        jMenuItemVlozit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVlozitActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemVlozit);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Nápověda");

        jMenuItemOProgramu.setText("O programu");
        jMenuItemOProgramu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOProgramuActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemOProgramu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldOperand1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldOperand2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVypočti)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelVysledek)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldOperand1, jTextFieldOperand2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButtonVypočti});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOperand1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldOperand2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelVysledek)
                    .addComponent(jComboBoxOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVypočti)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVypočtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVypočtiActionPerformed
        // sečtení operandů, nejprve postupně
        /*
        String op1 = jTextFieldOperand1.getText();
        String op2 = jTextFieldOperand2.getText();
        double iop1 = Double.parseDouble(op1);
        double iop2 = Double.parseDouble(op2);
        double vysledek = iop1 + iop2;
        String svysledek = String.valueOf(vysledek);
        jLabelVysledek.setText(svysledek);
        */
        // práce s operandy, tentokrát najednou
        switch (jComboBoxOperator.getSelectedIndex()) {
            case 0:
                jLabelVysledek.setText(String.valueOf(
                    Double.parseDouble(jTextFieldOperand1.getText())+
                    Double.parseDouble(jTextFieldOperand2.getText())));
                break;
            case 1:
                jLabelVysledek.setText(String.valueOf(
                    Double.parseDouble(jTextFieldOperand1.getText())-
                    Double.parseDouble(jTextFieldOperand2.getText())));
                break;
            case 2:
                jLabelVysledek.setText(String.valueOf(
                    Double.parseDouble(jTextFieldOperand1.getText())*
                    Double.parseDouble(jTextFieldOperand2.getText())));
                break;
            case 3:
                if (Double.parseDouble(jTextFieldOperand2.getText()) == 0) {
                    JOptionPane.showMessageDialog(this,
                            "Dělitel nesmí být nula!", "Chyba vstupu",
                            JOptionPane.ERROR_MESSAGE);
                    jLabelVysledek.setText("Nedefinováno");
                } else {
                    jLabelVysledek.setText(String.valueOf(
                        Double.parseDouble(jTextFieldOperand1.getText())/
                        Double.parseDouble(jTextFieldOperand2.getText())));
                }
                break;
        }

    }//GEN-LAST:event_jButtonVypočtiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItemOProgramuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOProgramuActionPerformed
        JOptionPane.showMessageDialog(this,
                "DatlingSoft s.r.o.", "O programu",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemOProgramuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemVlozitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVlozitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemVlozitActionPerformed

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
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HlavniOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HlavniOkno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonVypočti;
    private javax.swing.JComboBox<String> jComboBoxOperator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelVysledek;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCopy;
    private javax.swing.JMenuItem jMenuItemOProgramu;
    private javax.swing.JMenuItem jMenuItemVlozit;
    private javax.swing.JTextField jTextFieldOperand1;
    private javax.swing.JTextField jTextFieldOperand2;
    // End of variables declaration//GEN-END:variables
}
