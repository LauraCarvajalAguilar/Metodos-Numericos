package TemasNumericos;

public class Tema1 extends javax.swing.JFrame {

    

    public Tema1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tem = new javax.swing.JLabel();
        T1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AproximadoJ = new javax.swing.JTextField();
        RealJ = new javax.swing.JTextField();
        JResul = new javax.swing.JButton();
        jtxtRedo_ABSO = new javax.swing.JTextField();
        jtxtERR_REL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        redonabs = new javax.swing.JTextField();
        RedonRela = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        Decimal = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tem.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Tem.setForeground(new java.awt.Color(255, 255, 255));
        Tem.setText("TEMA 1");
        getContentPane().add(Tem, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        T1.setText("MENU");
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });
        getContentPane().add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VALOR REAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VALOR APROXIMADO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        AproximadoJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AproximadoJActionPerformed(evt);
            }
        });
        getContentPane().add(AproximadoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 130, -1));
        getContentPane().add(RealJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, -1));

        JResul.setText("Calcular");
        JResul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JResulActionPerformed(evt);
            }
        });
        getContentPane().add(JResul, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        jtxtRedo_ABSO.setRequestFocusEnabled(false);
        getContentPane().add(jtxtRedo_ABSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 160, -1));

        jtxtERR_REL.setRequestFocusEnabled(false);
        getContentPane().add(jtxtERR_REL, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 150, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ERROR ABSOLUTO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ERROR RELATIVO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setText("TRUNCAMIENTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("REDONDEO");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        redonabs.setRequestFocusEnabled(false);
        getContentPane().add(redonabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 160, -1));

        RedonRela.setRequestFocusEnabled(false);
        getContentPane().add(RedonRela, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 160, -1));

        jButton4.setText("Decimales");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));
        getContentPane().add(Decimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 80, -1));

        Fondo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/imagen1.jpg"))); // NOI18N
        Fondo.setText("ED ");
        Fondo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                FondoAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -200, 579, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        MenuNum men = new MenuNum();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_T1ActionPerformed
double resu1, resu2;
    private void JResulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JResulActionPerformed
        String cadena, cadena1;// cadenas
        float resul1, resul2;// valores flotantes
        float flotante, flotante2;//flotantes 

        cadena = AproximadoJ.getText();//recibe valor 
        cadena1 = RealJ.getText();//recibe valor

        flotante = Float.parseFloat(cadena);// los convierte en string a float 
        flotante2 = Float.parseFloat(cadena1);//los convierte en string a float 

        resul1 = flotante - flotante2;// hace las operaciones
        resul2 = resul1 / flotante;//hace las operaciones

        if (resul1 < 0) {// entra a esta condicion si resultado1 es negativo
            resul1 = resul1 * -1;// convierte a valores positivos

            // antes de enviar los conviertes en string
            String total = Float.toString(resul1);// conversion Float a string 
            String totales = Float.toString(resul2);//conversion float a string

            // set envia los datos a tu JtxtField
            jtxtRedo_ABSO.setText(total);//son string 
            jtxtERR_REL.setText(totales);

        }
       
        if (resul2 < 0) {// cuando resultado2 es negativo entra 
            resul2 = resul2 * -1;// convierte a valores positivos

            String total = Float.toString(resul1);// conversion Float a string 
            String totales = Float.toString(resul2);//conversion float a string

            jtxtRedo_ABSO.setText(total);
            jtxtERR_REL.setText(totales);
            // conviertes antes de enviar 
        } 
        
        else {
            String totales = Float.toString(resul1);// conversion Float a string 
            String totaless = Float.toString(resul2);//conversion float a string

            jtxtRedo_ABSO.setText(totales);//
            jtxtERR_REL.setText(totaless);// 
        }// fin de else 
          resu1 = resul1;//resultado de primera fase
        resu2 = resul2;
 
    }//GEN-LAST:event_JResulActionPerformed

    private void FondoAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_FondoAncestorMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_FondoAncestorMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String datos;
        double recibido, recibido2;

        datos = Decimal.getText();

        int decima = Integer.parseInt(datos);

        recibido = truncarDecimal(resu1, decima);
        recibido2 = truncarDecimal(resu2, decima);
        if (recibido < 0) {
            recibido = recibido * (-1);
        }

        if (recibido2 < 0) {
            recibido2 = recibido2 * (-1);
        }

        String total1 = Double.toString(recibido);
        String total2 = Double.toString(recibido2);

        RedonRela.setText(total1);
        redonabs.setText(total2);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AproximadoJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AproximadoJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AproximadoJActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String dato1;
        double rec, rec2;
        dato1 = Decimal.getText();//dato igual a decimal ingresada

        int decima = Integer.parseInt(dato1); //decima absorve el valor de dato1 en tipo int

        rec = redondearDecimal(resu1, decima);
        rec2 = redondearDecimal(resu2, decima);
        if (rec < 0) {
            rec = rec * (-1);
        }
        if (rec2 < 0) {
            rec2 = rec2 * (-1);
        }

        String total1 = Double.toString(rec);
        String total2 = Double.toString(rec2);

        RedonRela.setText(total1);
        redonabs.setText(total2);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Tema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tema1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AproximadoJ;
    private javax.swing.JTextField Decimal;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton JResul;
    private javax.swing.JTextField RealJ;
    private javax.swing.JTextField RedonRela;
    private javax.swing.JButton T1;
    private javax.swing.JLabel Tem;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtxtERR_REL;
    private javax.swing.JTextField jtxtRedo_ABSO;
    private javax.swing.JTextField redonabs;
    // End of variables declaration//GEN-END:variables

    private double redondearDecimal(double res, int decimal) {
        double parteEntera = 0, resultado = 0;
        resultado = res;
        parteEntera = Math.floor(resultado);

       
        resultado = (resultado - parteEntera) * Math.pow(10, decimal);

        resultado = Math.round(resultado);

        resultado = (resultado / Math.pow(10, decimal)) + parteEntera;
        return resultado;
    }

    private double truncarDecimal(double result, int decimal) {
        double parteEntera, truncado;
        truncado = result;
        parteEntera = Math.floor(truncado);
        truncado = (truncado - parteEntera) * Math.pow(10, decimal - 1);
        truncado = Math.floor(truncado);
        truncado = (truncado / Math.pow(10, decimal - 1)) + parteEntera;

        return truncado;
    }
}
