/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControlCliente;

/**
 *
 * @author Marisol
 */
public class NuevoCliente extends javax.swing.JFrame {

    /**
     * Creates new form NuevoCliente
     */
    public NuevoCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_nuevocliente = new javax.swing.JLabel();
        lbl_cuit = new javax.swing.JLabel();
        lbl_razSocial = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_domicilio = new javax.swing.JLabel();
        lbl_pais = new javax.swing.JLabel();
        txt_cuit = new javax.swing.JTextField();
        txt_razonSocial = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        cb_pais = new javax.swing.JComboBox<>();
        cb_localidad = new javax.swing.JComboBox<>();
        lbl_Provincia1 = new javax.swing.JLabel();
        cb_provincia1 = new javax.swing.JComboBox<>();
        lbl_localidad1 = new javax.swing.JLabel();
        txt_telefono1 = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(132, 119, 112));
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 232, 118));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nuevocliente.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lbl_nuevocliente.setText("NUEVO CLIENTE");
        jPanel1.add(lbl_nuevocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lbl_cuit.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_cuit.setText("CUIT N°");
        jPanel1.add(lbl_cuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        lbl_razSocial.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_razSocial.setText("Razón Social");
        jPanel1.add(lbl_razSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        lbl_email.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_email.setText("Correo Electrónico");
        jPanel1.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        lbl_telefono.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_telefono.setText("Teléfono");
        jPanel1.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        lbl_domicilio.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_domicilio.setText("Domicilio");
        jPanel1.add(lbl_domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        lbl_pais.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_pais.setText("País");
        jPanel1.add(lbl_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        txt_cuit.setBorder(null);
        jPanel1.add(txt_cuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 110, -1));

        txt_razonSocial.setBorder(null);
        jPanel1.add(txt_razonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 250, -1));

        txt_mail.setBorder(null);
        jPanel1.add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 250, -1));

        txt_direccion.setBorder(null);
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 250, -1));

        cb_pais.setEditable(true);
        cb_pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cb_pais.setBorder(null);
        jPanel1.add(cb_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 150, -1));

        cb_localidad.setEditable(true);
        cb_localidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cb_localidad.setBorder(null);
        jPanel1.add(cb_localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, -1));

        lbl_Provincia1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_Provincia1.setText("Provincia");
        jPanel1.add(lbl_Provincia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        cb_provincia1.setEditable(true);
        cb_provincia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cb_provincia1.setBorder(null);
        jPanel1.add(cb_provincia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, -1));

        lbl_localidad1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_localidad1.setText("Localidad");
        jPanel1.add(lbl_localidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        txt_telefono1.setBorder(null);
        jPanel1.add(txt_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 100, -1));

        btn_registrar.setBackground(new java.awt.Color(153, 204, 0));
        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconCheck.png"))); // NOI18N
        btn_registrar.setText("Añadir Usuario");
        btn_registrar.setBorder(null);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 140, 40));

        btn_cancelar.setBackground(new java.awt.Color(255, 0, 51));
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconCancel.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
               
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_cancelar;
    public javax.swing.JButton btn_registrar;
    public javax.swing.JComboBox<String> cb_localidad;
    public javax.swing.JComboBox<String> cb_pais;
    public javax.swing.JComboBox<String> cb_provincia1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Provincia1;
    private javax.swing.JLabel lbl_cuit;
    private javax.swing.JLabel lbl_domicilio;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_localidad1;
    private javax.swing.JLabel lbl_nuevocliente;
    private javax.swing.JLabel lbl_pais;
    private javax.swing.JLabel lbl_razSocial;
    private javax.swing.JLabel lbl_telefono;
    public javax.swing.JTextField txt_cuit;
    public javax.swing.JTextField txt_direccion;
    public javax.swing.JTextField txt_mail;
    public javax.swing.JTextField txt_razonSocial;
    public javax.swing.JTextField txt_telefono1;
    // End of variables declaration//GEN-END:variables
}
