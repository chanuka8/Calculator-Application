/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sumal
 */
public class calc extends javax.swing.JFrame {

    /**
     * Creates new form calc
     */
    double NumEnter1;
    double NumEnter2;
    double Resalt;
    String Op;
    
    public calc() {
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

        jTextresalt = new javax.swing.JTextField();
        jbtnC = new javax.swing.JButton();
        jbtnPS = new javax.swing.JButton();
        jBtnBS = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnplus = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnmin = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnPower = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jbtnEqul = new javax.swing.JButton();
        jbtndivision = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(400, 620));
        setPreferredSize(new java.awt.Dimension(410, 320));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextresalt.setEditable(false);
        jTextresalt.setBackground(new java.awt.Color(204, 255, 255));
        jTextresalt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextresalt.setForeground(new java.awt.Color(6, 0, 0));
        jTextresalt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextresalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextresaltActionPerformed(evt);
            }
        });
        getContentPane().add(jTextresalt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 340, 70));

        jbtnC.setBackground(new java.awt.Color(255, 255, 0));
        jbtnC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnC.setText("C");
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 70, 70));

        jbtnPS.setBackground(new java.awt.Color(0, 204, 102));
        jbtnPS.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnPS.setText("±");
        jbtnPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 70, 70));

        jBtnBS.setBackground(new java.awt.Color(255, 51, 51));
        jBtnBS.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBtnBS.setText("<-");
        jBtnBS.setToolTipText("");
        jBtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 70));

        jbtnCE.setBackground(new java.awt.Color(255, 255, 0));
        jbtnCE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 70, 70));

        jbtnDigit9.setBackground(new java.awt.Color(255, 153, 0));
        jbtnDigit9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 70, 70));

        jbtnplus.setBackground(new java.awt.Color(0, 204, 102));
        jbtnplus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnplus.setText("+");
        jbtnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnplusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 70, 70));

        jbtnDigit7.setBackground(new java.awt.Color(255, 153, 0));
        jbtnDigit7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 70));

        jbtnDigit8.setBackground(new java.awt.Color(255, 153, 0));
        jbtnDigit8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 70, 70));

        jbtnDigit4.setBackground(new java.awt.Color(255, 153, 0));
        jbtnDigit4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 70, 70));

        jbtnmin.setBackground(new java.awt.Color(0, 204, 102));
        jbtnmin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnmin.setText("-");
        jbtnmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnminActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 70, 70));

        jbtnDigit6.setBackground(new java.awt.Color(255, 153, 0));
        jbtnDigit6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 70, 70));

        jbtnDigit5.setBackground(new java.awt.Color(255, 153, 0));
        jbtnDigit5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 70, 70));

        jbtnDigit1.setBackground(new java.awt.Color(255, 153, 0));
        jbtnDigit1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 70, 70));

        jbtnPower.setBackground(new java.awt.Color(0, 204, 102));
        jbtnPower.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnPower.setText("*");
        jbtnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPowerActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPower, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 70, 70));

        jbtnDigit3.setBackground(new java.awt.Color(255, 153, 0));
        jbtnDigit3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 70, 70));

        jbtnDigit2.setBackground(new java.awt.Color(255, 153, 0));
        jbtnDigit2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 70, 70));

        jButton21.setText("jButton1");
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 70, 70));

        jButton22.setText("jButton1");
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 70, 70));

        jButton23.setText("jButton1");
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 70));

        jButton24.setText("jButton1");
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 70, 70));

        jbtnEqul.setBackground(new java.awt.Color(0, 204, 102));
        jbtnEqul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnEqul.setText("=");
        jbtnEqul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqulActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEqul, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 70, 70));

        jbtndivision.setBackground(new java.awt.Color(0, 204, 102));
        jbtndivision.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtndivision.setText("/");
        jbtndivision.setToolTipText("");
        jbtndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndivisionActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 70, 70));

        jbtnDigit0.setBackground(new java.awt.Color(255, 153, 0));
        jbtnDigit0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 70, 70));

        jbtnDot.setBackground(new java.awt.Color(0, 204, 102));
        jbtnDot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 70, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void EnterNumbers(String q)
{
    String Nums = jTextresalt.getText() + q;
    jTextresalt.setText(Nums);
    
}

    private void jTextresaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextresaltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextresaltActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
        jTextresalt.setText("");
        
        String Fn, Sn;
        Fn = String.valueOf(NumEnter1);
        Sn = String.valueOf(NumEnter2);
        
        Fn = "";
        Sn = "";
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
        if (! jTextresalt.getText().contains("."))
        {
            jTextresalt.setText(jTextresalt.getText() + jbtnDot.getText());
        }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jBtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBSActionPerformed
        String backsp = null;
        
        if (jTextresalt.getText().length()>0)
        {
            StringBuilder sb = new StringBuilder(jTextresalt.getText());
            sb.deleteCharAt(jTextresalt.getText().length()-1);
            backsp = sb.toString();
            jTextresalt.setText(backsp);
        }
    }//GEN-LAST:event_jBtnBSActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
        EnterNumbers("5"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
       EnterNumbers("7");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
        EnterNumbers("8");         // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
        EnterNumbers("9"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
        EnterNumbers("6"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
        EnterNumbers("4"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
        EnterNumbers("3"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
        EnterNumbers("2"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
        EnterNumbers("1"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
        EnterNumbers("0"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndivisionActionPerformed
        NumEnter1 = Double.parseDouble(jTextresalt.getText());// TODO add your handling code here:
        jTextresalt.setText("");
        Op = "/";
    }//GEN-LAST:event_jbtndivisionActionPerformed

    private void jbtnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPowerActionPerformed
        NumEnter1 = Double.parseDouble(jTextresalt.getText());// TODO add your handling code here:
        jTextresalt.setText("");
        Op = "*";        
    }//GEN-LAST:event_jbtnPowerActionPerformed

    private void jbtnminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnminActionPerformed
        NumEnter1 = Double.parseDouble(jTextresalt.getText());// TODO add your handling code here:
        jTextresalt.setText("");
        Op = "-";        
    }//GEN-LAST:event_jbtnminActionPerformed

    private void jbtnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnplusActionPerformed
        NumEnter1 = Double.parseDouble(jTextresalt.getText());// TODO add your handling code here:
        jTextresalt.setText("");
        Op = "+";        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnplusActionPerformed

    private void jbtnPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPSActionPerformed
        double nums = Double.parseDouble(String.valueOf(jTextresalt.getText()));
        nums = nums * (-1);
        jTextresalt.setText(String.valueOf(nums));
        
    }//GEN-LAST:event_jbtnPSActionPerformed

    private void jbtnEqulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqulActionPerformed
        NumEnter2 = Double.parseDouble(jTextresalt.getText());
        
        if (Op == "+")
        {
            Resalt = NumEnter1 + NumEnter2;
            jTextresalt.setText(String.valueOf(Resalt));
        }
        
        else if (Op == "-")
        {
            Resalt = NumEnter1 - NumEnter2;
            jTextresalt.setText(String.valueOf(Resalt));
        }
        
        else if (Op == "/")
        {
            Resalt = NumEnter1 / NumEnter2;
            jTextresalt.setText(String.valueOf(Resalt));
        }
                
        if (Op == "*")
        {
            Resalt = NumEnter1 * NumEnter2;
            jTextresalt.setText(String.valueOf(Resalt));
        }
                        

    }//GEN-LAST:event_jbtnEqulActionPerformed

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
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBS;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JTextField jTextresalt;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEqul;
    private javax.swing.JButton jbtnPS;
    private javax.swing.JButton jbtnPower;
    private javax.swing.JButton jbtndivision;
    private javax.swing.JButton jbtnmin;
    private javax.swing.JButton jbtnplus;
    // End of variables declaration//GEN-END:variables
}
