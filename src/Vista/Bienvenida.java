/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

/**
 *
 * @author Marisol
 */
public class Bienvenida extends javax.swing.JPanel {

    /**
     * Creates new form Bienvenida
     */
    public Bienvenida() {
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

        lbl_infoUsuario = new javax.swing.JLabel();
        bgBienvenida1 = new javax.swing.JPanel();
        lbl_bienvenida1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_infoUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_infoUsuario.setText("Usuario: Nombre y apellido empleado - Rol: Administrador");
        add(lbl_infoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        bgBienvenida1.setBackground(new java.awt.Color(0, 0, 0));
        bgBienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        bgBienvenida1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_bienvenida1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lbl_bienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bienvenida1.setText("¬°Bienvenido Nombre empleado!");
        bgBienvenida1.add(lbl_bienvenida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        add(bgBienvenida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 830, 60));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgBienvenida1;
    private javax.swing.JLabel lbl_bienvenida1;
    private javax.swing.JLabel lbl_infoUsuario;
    // End of variables declaration//GEN-END:variables
}
