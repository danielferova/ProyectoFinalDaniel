/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasInterfazD;

/**
 *
 * @author danie
 */
public class CrearAviones extends javax.swing.JFrame {

    /**
     * Creates new form CrearAviones
     */
    public CrearAviones() {
        initComponents();
         this.setLocationRelativeTo(null);
           setSize(1290, 1000);
           setTitle("FEROVA GAME");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegresarTipos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldV7 = new javax.swing.JTextField();
        jComboBoxV1 = new javax.swing.JComboBox<>();
        jTextFieldV6 = new javax.swing.JTextField();
        jTextFieldV1 = new javax.swing.JTextField();
        jTextFieldV2 = new javax.swing.JTextField();
        jTextFieldV5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldV3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldV4 = new javax.swing.JTextField();
        jButtonCrearA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonRegresarTipos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegresarTipos.setFont(new java.awt.Font("Dubai", 3, 36)); // NOI18N
        jButtonRegresarTipos.setForeground(new java.awt.Color(0, 255, 0));
        jButtonRegresarTipos.setText("Regresar");
        jButtonRegresarTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarTiposActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresarTipos);
        jButtonRegresarTipos.setBounds(60, 680, 260, 100);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("Crear Vehículos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(580, 70, 470, 40);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingrese Velocidad:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 530, 420, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesD/aviones.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 20, 620, 150);

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ingrese nombre del Vehículo:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 330, 510, 40);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ingrese Defensa:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(210, 480, 420, 40);

        jTextFieldV7.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldV7.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldV7.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldV7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldV7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldV7);
        jTextFieldV7.setBounds(490, 240, 310, 40);

        jComboBoxV1.setFont(new java.awt.Font("Dubai", 3, 36)); // NOI18N
        jComboBoxV1.setForeground(new java.awt.Color(255, 0, 51));
        jComboBoxV1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija Vehículo", "Avión", "Tanque", " " }));
        jComboBoxV1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxV1ItemStateChanged(evt);
            }
        });
        jComboBoxV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxV1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxV1);
        jComboBoxV1.setBounds(200, 230, 270, 60);

        jTextFieldV6.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldV6.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldV6.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldV6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldV6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldV6);
        jTextFieldV6.setBounds(490, 530, 310, 40);

        jTextFieldV1.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldV1.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldV1.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldV1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldV1);
        jTextFieldV1.setBounds(490, 330, 310, 40);

        jTextFieldV2.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldV2.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldV2.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldV2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldV2);
        jTextFieldV2.setBounds(490, 380, 310, 40);

        jTextFieldV5.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldV5.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldV5.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldV5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldV5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldV5);
        jTextFieldV5.setBounds(490, 480, 310, 40);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese Puntería:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 380, 420, 40);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese Ataque:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 430, 420, 40);

        jTextFieldV3.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldV3.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldV3.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldV3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldV3);
        jTextFieldV3.setBounds(490, 430, 310, 40);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("COSTO DEL VEHÍCULO:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 590, 420, 40);

        jTextFieldV4.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldV4.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jTextFieldV4.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldV4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldV4);
        jTextFieldV4.setBounds(490, 590, 310, 40);

        jButtonCrearA.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCrearA.setFont(new java.awt.Font("Dubai", 3, 48)); // NOI18N
        jButtonCrearA.setForeground(new java.awt.Color(0, 255, 0));
        jButtonCrearA.setText("Guardar Vehículo");
        jButtonCrearA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearAActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrearA);
        jButtonCrearA.setBounds(490, 680, 510, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesD/FinesseGrande.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1810, 1300);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingrese Ataque:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 410, 420, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldV1ActionPerformed

    private void jTextFieldV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldV2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldV2ActionPerformed

    private void jTextFieldV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldV3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldV3ActionPerformed

    private void jTextFieldV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldV4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldV4ActionPerformed

    private void jButtonCrearAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearAActionPerformed
        // TODO add your handling code here:
        JuegoTableros entrada2 = new JuegoTableros();
        entrada2.show();
        entrada2.setSize(1290, 1000);
        dispose();

        /*Sring nombre = jTextFieldNombre.getText();
        String v1 = jTextFieldV1.getText();
        String v2 = jTextFieldV2.getText();
        String v3 = jTextFieldV3.getText();
        String tipo1 = Jmostrar1.getText();
        String tipo2 = Jmostrar2.getText();
        String tipo3 = Jmostrar3.getText();
        //NOMBRE DE LA PERSONA ATRUBUTOS
        Persona  person = new Persona(nombre, v1, v2, v3, tipo1, tipo2, tipo3);
        contenedor.add(person);
        //Limpia
        jTextFieldNombre.setText("");
        jTextFieldV1.setText("");
        jTextFieldV2.setText("");
        jTextFieldV3.setText("");*/
    }//GEN-LAST:event_jButtonCrearAActionPerformed

    private void jTextFieldV5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldV5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldV5ActionPerformed

    private void jTextFieldV6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldV6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldV6ActionPerformed

    private void jButtonRegresarTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarTiposActionPerformed
        // TODO add your handling code here:
        //Persona persona = new Persona(jTextFieldNombre.getText() );
        //lista.add(persona);
        this.setVisible(false);

        new CrearVehiculos ().setVisible(true);

        setSize(1290, 1000);
        dispose();
        /*  String nombre = jTextFieldNombre.getText();
        String v1 = jTextFieldV1.getText();
        String v2 = jTextFieldV2.getText();
        String v3 = jTextFieldV3.getText();
        String tipo1 = Jmostrar1.getText();
        String tipo2 = Jmostrar2.getText();
        String tipo3 = Jmostrar3.getText();
        //NOMBRE DE LA PERSONA ATRUBUTOS
        Persona  person = new Persona(nombre, v1, v2, v3, tipo1, tipo2, tipo3);
        contenedor.add(person);
        //Limpia
        jTextFieldNombre.setText("");
        jTextFieldV1.setText("");
        jTextFieldV2.setText("");
        jTextFieldV3.setText("");*/
    }//GEN-LAST:event_jButtonRegresarTiposActionPerformed

    private void jComboBoxV1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxV1ItemStateChanged
        // TODO add your handling code here:
        this.jTextFieldV7.setText("= "+jComboBoxV1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxV1ItemStateChanged

    private void jComboBoxV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxV1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxV1ActionPerformed

    private void jTextFieldV7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldV7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldV7ActionPerformed

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
            java.util.logging.Logger.getLogger(CrearAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearAviones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearA;
    private javax.swing.JButton jButtonRegresarTipos;
    private javax.swing.JComboBox<String> jComboBoxV1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldV1;
    private javax.swing.JTextField jTextFieldV2;
    private javax.swing.JTextField jTextFieldV3;
    private javax.swing.JTextField jTextFieldV4;
    private javax.swing.JTextField jTextFieldV5;
    private javax.swing.JTextField jTextFieldV6;
    private javax.swing.JTextField jTextFieldV7;
    // End of variables declaration//GEN-END:variables
}
