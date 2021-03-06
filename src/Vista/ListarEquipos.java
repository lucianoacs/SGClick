/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

/**
 *
 * @author Marisol
 */
public class ListarEquipos extends javax.swing.JPanel {

    /**
     * Creates new form ListarEquipos
     */
    public ListarEquipos() {
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

        jPanel1 = new javax.swing.JPanel();
        bgBienvenida1 = new javax.swing.JPanel();
        lbl_bienvenida1 = new javax.swing.JLabel();
        lbl_infoUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bgCuit = new javax.swing.JPanel();
        txt_busqueda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_nuevoProy = new javax.swing.JButton();
        btn_editarProy = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgBienvenida1.setBackground(new java.awt.Color(0, 0, 0));
        bgBienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        bgBienvenida1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_bienvenida1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lbl_bienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bienvenida1.setText("Equipos");
        bgBienvenida1.add(lbl_bienvenida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(bgBienvenida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 830, 60));

        lbl_infoUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_infoUsuario.setText("Usuario: Nombre y apellido empleado - Rol: Administrador");
        jPanel1.add(lbl_infoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Descripcion", "Integrantes y roles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 830, 440));

        bgCuit.setBackground(new java.awt.Color(231, 197, 59));
        bgCuit.setForeground(new java.awt.Color(255, 255, 255));
        bgCuit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_busqueda.setBorder(null);
        txt_busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_busquedaMouseClicked(evt);
            }
        });
        bgCuit.add(txt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 390, 20));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel2.setText("Descripcion");
        bgCuit.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_nuevoProy.setBackground(new java.awt.Color(231, 197, 59));
        btn_nuevoProy.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_nuevoProy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconNuevo.png"))); // NOI18N
        btn_nuevoProy.setText("Nuevo Equipo");
        btn_nuevoProy.setBorder(null);
        btn_nuevoProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoProyActionPerformed(evt);
            }
        });
        bgCuit.add(btn_nuevoProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 150, -1));

        btn_editarProy.setBackground(new java.awt.Color(231, 197, 59));
        btn_editarProy.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_editarProy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconEditar.png"))); // NOI18N
        btn_editarProy.setText("Editar Equipo");
        btn_editarProy.setBorder(null);
        bgCuit.add(btn_editarProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 140, -1));

        jPanel1.add(bgCuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 830, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_busquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_busquedaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busquedaMouseClicked

    private void btn_nuevoProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoProyActionPerformed
        NuevoProyecto view= new NuevoProyecto();
        view.setVisible(true);
    }//GEN-LAST:event_btn_nuevoProyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgBienvenida1;
    private javax.swing.JPanel bgCuit;
    private javax.swing.JButton btn_editarProy;
    private javax.swing.JButton btn_nuevoProy;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_bienvenida1;
    private javax.swing.JLabel lbl_infoUsuario;
    private javax.swing.JTextField txt_busqueda;
    // End of variables declaration//GEN-END:variables
}
