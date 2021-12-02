/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

/**
 *
 * @author Marisol
 */
public class HistorialCliente extends javax.swing.JPanel {

    /**
     * Creates new form HistorialCliente
     */
    public HistorialCliente() {
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
        bgCuit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();
        btn_guardartodo = new javax.swing.JButton();
        btn_darBaja = new javax.swing.JButton();
        bg_tituloTab = new javax.swing.JPanel();
        lbl_tituloTab = new javax.swing.JLabel();
        jTabPanel_menu = new javax.swing.JTabbedPane();
        tab_detallesGral = new javax.swing.JToolBar();
        bg_tab_detallesGral = new javax.swing.JPanel();
        lbl_Provincia = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        cb_pais = new javax.swing.JComboBox<>();
        lbl_razSocial = new javax.swing.JLabel();
        lbl_cuit = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_pais = new javax.swing.JLabel();
        lbl_domicilio = new javax.swing.JLabel();
        lbl_localidad = new javax.swing.JLabel();
        txt_cuit = new javax.swing.JTextField();
        txt_razonSocial = new javax.swing.JTextField();
        lbl_codPostal = new javax.swing.JLabel();
        cb_provincia = new javax.swing.JComboBox<>();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        cb_localidad = new javax.swing.JComboBox<>();
        txt_codPostal = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        btn_editarform = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        tab_proyectos = new javax.swing.JToolBar();
        bg_tab_proyectos = new javax.swing.JPanel();
        btn_nuevoProy = new javax.swing.JButton();
        btn_editarProy = new javax.swing.JButton();
        btn_detallesProy = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_proyectos = new javax.swing.JTable();
        lbl_nombreproy = new javax.swing.JLabel();
        txt_descriproy = new javax.swing.JTextField();
        lbl_saldoDeuda = new javax.swing.JLabel();
        lbl_horasempleadas = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        txt_nombreProy = new javax.swing.JTextField();
        txt_horasempleadas = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        txt_saldoadeudado = new javax.swing.JTextField();
        cb_estadoproy = new javax.swing.JComboBox<>();
        lbl_fechaInicio = new javax.swing.JLabel();
        lbl_estadoProy = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        lbl_descripProy = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_equipo = new javax.swing.JTable();
        txt_fechaInicio = new javax.swing.JFormattedTextField();
        lbl_detalleEquipo = new javax.swing.JLabel();
        lbl_deudatotal1 = new javax.swing.JLabel();
        cb_nroEquipo = new javax.swing.JComboBox<>();
        tab_facturas = new javax.swing.JToolBar();
        bg_tab_factura = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_detalleFac = new javax.swing.JTable();
        lbl_nroFac = new javax.swing.JLabel();
        lbl_fechaEmision = new javax.swing.JLabel();
        lbl_deudatotal2 = new javax.swing.JLabel();
        lbl_rznSocFac = new javax.swing.JLabel();
        lbl_totalFac = new javax.swing.JLabel();
        lbl_saldoDeudaFac = new javax.swing.JLabel();
        lbl_cuitFactura = new javax.swing.JLabel();
        btn_nuevaFactura = new javax.swing.JButton();
        btn_bajaFactura = new javax.swing.JButton();
        btn_emitirfac = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_facturas = new javax.swing.JTable();
        jSeparator8 = new javax.swing.JSeparator();
        btn_detallesFactura1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_infoUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_infoUsuario.setText("Usuario: Nombre y apellido empleado - Rol: Administrador");
        add(lbl_infoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        bgCuit.setBackground(new java.awt.Color(231, 197, 59));
        bgCuit.setForeground(new java.awt.Color(255, 255, 255));
        bgCuit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel1.setText("CUIT N°");
        bgCuit.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txt_busqueda.setBorder(null);
        txt_busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_busquedaMouseClicked(evt);
            }
        });
        bgCuit.add(txt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 380, 20));

        btn_guardartodo.setBackground(new java.awt.Color(102, 153, 0));
        btn_guardartodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_guardartodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconGuardar.png"))); // NOI18N
        btn_guardartodo.setText("Guardar Cambios");
        btn_guardartodo.setBorder(null);
        bgCuit.add(btn_guardartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 150, 40));

        btn_darBaja.setBackground(new java.awt.Color(255, 0, 51));
        btn_darBaja.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_darBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconBaja.png"))); // NOI18N
        btn_darBaja.setText("Dar de baja");
        btn_darBaja.setBorder(null);
        bgCuit.add(btn_darBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 130, 40));

        add(bgCuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 830, 60));

        bg_tituloTab.setBackground(new java.awt.Color(0, 0, 0));
        bg_tituloTab.setForeground(new java.awt.Color(255, 255, 255));
        bg_tituloTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_tituloTab.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lbl_tituloTab.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tituloTab.setText("Historial del cliente");
        bg_tituloTab.add(lbl_tituloTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        add(bg_tituloTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 830, 60));

        jTabPanel_menu.setBackground(new java.awt.Color(39, 18, 7));
        jTabPanel_menu.setForeground(new java.awt.Color(255, 255, 255));
        jTabPanel_menu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        tab_detallesGral.setBackground(new java.awt.Color(39, 18, 7));
        tab_detallesGral.setBorder(null);
        tab_detallesGral.setFloatable(false);
        tab_detallesGral.setFocusable(false);

        bg_tab_detallesGral.setBackground(new java.awt.Color(255, 255, 255));
        bg_tab_detallesGral.setFocusable(false);
        bg_tab_detallesGral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Provincia.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_Provincia.setText("Provincia");
        bg_tab_detallesGral.add(lbl_Provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        txt_mail.setBorder(null);
        txt_mail.setEnabled(false);
        bg_tab_detallesGral.add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 250, 20));

        cb_pais.setEditable(true);
        cb_pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_pais.setBorder(null);
        cb_pais.setEnabled(false);
        bg_tab_detallesGral.add(cb_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 100, -1));

        lbl_razSocial.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_razSocial.setText("Razón Social");
        bg_tab_detallesGral.add(lbl_razSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        lbl_cuit.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_cuit.setText("CUIT N°");
        bg_tab_detallesGral.add(lbl_cuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        lbl_email.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_email.setText("Correo Electrónico");
        bg_tab_detallesGral.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        lbl_pais.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_pais.setText("País");
        bg_tab_detallesGral.add(lbl_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        lbl_domicilio.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_domicilio.setText("Domicilio");
        bg_tab_detallesGral.add(lbl_domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        lbl_localidad.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_localidad.setText("Localidad");
        bg_tab_detallesGral.add(lbl_localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        txt_cuit.setBorder(null);
        txt_cuit.setEnabled(false);
        bg_tab_detallesGral.add(txt_cuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 110, 20));

        txt_razonSocial.setBorder(null);
        txt_razonSocial.setEnabled(false);
        bg_tab_detallesGral.add(txt_razonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 250, 20));

        lbl_codPostal.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_codPostal.setText("Código Postal");
        bg_tab_detallesGral.add(lbl_codPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        cb_provincia.setEditable(true);
        cb_provincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_provincia.setBorder(null);
        cb_provincia.setEnabled(false);
        bg_tab_detallesGral.add(cb_provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 100, -1));

        txt_telefono.setBorder(null);
        txt_telefono.setEnabled(false);
        bg_tab_detallesGral.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 110, 20));

        txt_direccion.setBorder(null);
        txt_direccion.setEnabled(false);
        bg_tab_detallesGral.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 320, 20));

        cb_localidad.setEditable(true);
        cb_localidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_localidad.setBorder(null);
        cb_localidad.setEnabled(false);
        bg_tab_detallesGral.add(cb_localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 100, -1));

        txt_codPostal.setBorder(null);
        txt_codPostal.setEnabled(false);
        bg_tab_detallesGral.add(txt_codPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 110, 20));

        lbl_telefono.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_telefono.setText("Teléfono");
        bg_tab_detallesGral.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        btn_editarform.setBackground(new java.awt.Color(231, 197, 59));
        btn_editarform.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_editarform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconEditar.png"))); // NOI18N
        btn_editarform.setText("Editar formulario");
        btn_editarform.setBorder(null);
        btn_editarform.setBorderPainted(false);
        btn_editarform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarformActionPerformed(evt);
            }
        });
        bg_tab_detallesGral.add(btn_editarform, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 160, -1));

        jSeparator1.setBackground(new java.awt.Color(243, 234, 232));
        bg_tab_detallesGral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 330, 10));

        jSeparator2.setBackground(new java.awt.Color(243, 234, 232));
        bg_tab_detallesGral.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 120, 10));

        jSeparator4.setBackground(new java.awt.Color(243, 234, 232));
        bg_tab_detallesGral.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 330, 10));

        jSeparator3.setBackground(new java.awt.Color(243, 234, 232));
        bg_tab_detallesGral.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 260, 10));

        jSeparator5.setBackground(new java.awt.Color(243, 234, 232));
        bg_tab_detallesGral.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 260, 10));

        jSeparator6.setBackground(new java.awt.Color(243, 234, 232));
        bg_tab_detallesGral.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 120, 10));

        tab_detallesGral.add(bg_tab_detallesGral);

        jTabPanel_menu.addTab("Datos Generales", tab_detallesGral);

        tab_proyectos.setBackground(new java.awt.Color(39, 18, 7));
        tab_proyectos.setBorder(null);
        tab_proyectos.setFloatable(false);
        tab_proyectos.setForeground(new java.awt.Color(255, 255, 255));

        bg_tab_proyectos.setBackground(new java.awt.Color(255, 255, 255));
        bg_tab_proyectos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_nuevoProy.setBackground(new java.awt.Color(231, 197, 59));
        btn_nuevoProy.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_nuevoProy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconNuevo.png"))); // NOI18N
        btn_nuevoProy.setText("Nuevo Proyecto");
        btn_nuevoProy.setBorder(null);
        btn_nuevoProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoProyActionPerformed(evt);
            }
        });
        bg_tab_proyectos.add(btn_nuevoProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, -1));

        btn_editarProy.setBackground(new java.awt.Color(231, 197, 59));
        btn_editarProy.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_editarProy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconEditar.png"))); // NOI18N
        btn_editarProy.setText("Editar Proyecto");
        btn_editarProy.setBorder(null);
        bg_tab_proyectos.add(btn_editarProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 140, -1));

        btn_detallesProy.setBackground(new java.awt.Color(231, 197, 59));
        btn_detallesProy.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_detallesProy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconInfo.png"))); // NOI18N
        btn_detallesProy.setText("Más Detalles...");
        btn_detallesProy.setBorder(null);
        bg_tab_proyectos.add(btn_detallesProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 20, 140, -1));

        table_proyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id.", "Nombre", "Descripción", "Horas empleadas", "Saldo Adeudado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_proyectos);
        if (table_proyectos.getColumnModel().getColumnCount() > 0) {
            table_proyectos.getColumnModel().getColumn(4).setHeaderValue("Saldo Adeudado");
        }

        bg_tab_proyectos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 740, 120));

        lbl_nombreproy.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_nombreproy.setText("Nombre");
        bg_tab_proyectos.add(lbl_nombreproy, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        txt_descriproy.setBorder(null);
        txt_descriproy.setEnabled(false);
        bg_tab_proyectos.add(txt_descriproy, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 250, 20));

        lbl_saldoDeuda.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_saldoDeuda.setText("Saldo Adeudado");
        bg_tab_proyectos.add(lbl_saldoDeuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        lbl_horasempleadas.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_horasempleadas.setText("Horas Empleadas");
        bg_tab_proyectos.add(lbl_horasempleadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(243, 234, 232));
        bg_tab_proyectos.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 120, 10));

        jSeparator9.setBackground(new java.awt.Color(243, 234, 232));
        bg_tab_proyectos.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 120, 10));

        txt_nombreProy.setBorder(null);
        txt_nombreProy.setEnabled(false);
        bg_tab_proyectos.add(txt_nombreProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 160, 20));

        txt_horasempleadas.setBorder(null);
        txt_horasempleadas.setEnabled(false);
        bg_tab_proyectos.add(txt_horasempleadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 110, 20));

        jSeparator12.setBackground(new java.awt.Color(243, 234, 232));
        bg_tab_proyectos.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 170, 10));

        txt_saldoadeudado.setBorder(null);
        txt_saldoadeudado.setEnabled(false);
        bg_tab_proyectos.add(txt_saldoadeudado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 110, 20));

        cb_estadoproy.setEditable(true);
        cb_estadoproy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_estadoproy.setBorder(null);
        cb_estadoproy.setEnabled(false);
        bg_tab_proyectos.add(cb_estadoproy, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 100, -1));

        lbl_fechaInicio.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_fechaInicio.setText("Fecha de Inicio");
        bg_tab_proyectos.add(lbl_fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        lbl_estadoProy.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_estadoProy.setText("Estado");
        bg_tab_proyectos.add(lbl_estadoProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jSeparator11.setBackground(new java.awt.Color(243, 234, 232));
        bg_tab_proyectos.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 140, 10));

        jSeparator10.setBackground(new java.awt.Color(243, 234, 232));
        bg_tab_proyectos.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 260, 10));

        lbl_descripProy.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_descripProy.setText("Descripción");
        bg_tab_proyectos.add(lbl_descripProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        tabla_equipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre y apellido", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_equipo.setEnabled(false);
        jScrollPane2.setViewportView(tabla_equipo);

        bg_tab_proyectos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 320, 120));

        txt_fechaInicio.setBorder(null);
        txt_fechaInicio.setEnabled(false);
        bg_tab_proyectos.add(txt_fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 120, 20));

        lbl_detalleEquipo.setBackground(new java.awt.Color(204, 0, 0));
        lbl_detalleEquipo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lbl_detalleEquipo.setText("Numero de equipo");
        bg_tab_proyectos.add(lbl_detalleEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        lbl_deudatotal1.setBackground(new java.awt.Color(204, 0, 0));
        lbl_deudatotal1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_deudatotal1.setText("Deuda total: $valordeuda");
        bg_tab_proyectos.add(lbl_deudatotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        cb_nroEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_nroEquipo.setBorder(null);
        cb_nroEquipo.setEnabled(false);
        bg_tab_proyectos.add(cb_nroEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 80, -1));

        tab_proyectos.add(bg_tab_proyectos);

        jTabPanel_menu.addTab("Proyectos", tab_proyectos);

        tab_facturas.setBorder(null);
        tab_facturas.setFloatable(false);

        bg_tab_factura.setBackground(new java.awt.Color(255, 255, 255));
        bg_tab_factura.setFocusable(false);
        bg_tab_factura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_detalleFac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Detalle", "Hs a pagar", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_detalleFac.setEnabled(false);
        jScrollPane4.setViewportView(tabla_detalleFac);

        bg_tab_factura.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 320, 120));

        lbl_nroFac.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_nroFac.setText("Factura N°: xxxxxxxxxx");
        bg_tab_factura.add(lbl_nroFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        lbl_fechaEmision.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_fechaEmision.setText("Fecha de emisión: xx/xx/xxxx");
        bg_tab_factura.add(lbl_fechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        lbl_deudatotal2.setBackground(new java.awt.Color(204, 0, 0));
        lbl_deudatotal2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_deudatotal2.setText("Deuda total: $valordeuda");
        bg_tab_factura.add(lbl_deudatotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        lbl_rznSocFac.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_rznSocFac.setText("Razón Social: xxxxxxxxxxxxx");
        bg_tab_factura.add(lbl_rznSocFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        lbl_totalFac.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_totalFac.setText("Total: $xxxx,xx");
        bg_tab_factura.add(lbl_totalFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        lbl_saldoDeudaFac.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_saldoDeudaFac.setText("Saldo Adeudado: $xxxxxx,xx");
        bg_tab_factura.add(lbl_saldoDeudaFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        lbl_cuitFactura.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_cuitFactura.setText("CUIT N°: xx-xxxxxxxx-x");
        bg_tab_factura.add(lbl_cuitFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        btn_nuevaFactura.setBackground(new java.awt.Color(231, 197, 59));
        btn_nuevaFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_nuevaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconNuevo.png"))); // NOI18N
        btn_nuevaFactura.setText("Nueva Factura");
        btn_nuevaFactura.setBorder(null);
        btn_nuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaFacturaActionPerformed(evt);
            }
        });
        bg_tab_factura.add(btn_nuevaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, -1));

        btn_bajaFactura.setBackground(new java.awt.Color(255, 0, 0));
        btn_bajaFactura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_bajaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconCancel.png"))); // NOI18N
        btn_bajaFactura.setText("Dar de baja una factura");
        btn_bajaFactura.setBorder(null);
        bg_tab_factura.add(btn_bajaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 190, -1));

        btn_emitirfac.setBackground(new java.awt.Color(102, 153, 0));
        btn_emitirfac.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_emitirfac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconEnviar.png"))); // NOI18N
        btn_emitirfac.setText("Emitir factura");
        btn_emitirfac.setBorder(null);
        btn_emitirfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emitirfacActionPerformed(evt);
            }
        });
        bg_tab_factura.add(btn_emitirfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 150, 50));

        tabla_facturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nro. Factura", "Fecha de emisión", "Total hs pagas", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla_facturas);

        bg_tab_factura.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 740, 120));
        bg_tab_factura.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 640, 10));

        btn_detallesFactura1.setBackground(new java.awt.Color(231, 197, 59));
        btn_detallesFactura1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_detallesFactura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconInfo.png"))); // NOI18N
        btn_detallesFactura1.setText("Más Detalles...");
        btn_detallesFactura1.setBorder(null);
        bg_tab_factura.add(btn_detallesFactura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 20, 140, -1));

        tab_facturas.add(bg_tab_factura);

        jTabPanel_menu.addTab("Facturas", tab_facturas);

        add(jTabPanel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 830, 490));
        jTabPanel_menu.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarformActionPerformed
       txt_codPostal.setEnabled(true);
       txt_direccion.setEnabled(true);
       txt_mail.setEnabled(true);
       txt_telefono.setEnabled(true);
       cb_localidad.setEnabled(true);
       cb_pais.setEnabled(true);
       cb_provincia.setEnabled(true);
    }//GEN-LAST:event_btn_editarformActionPerformed

    private void btn_nuevoProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoProyActionPerformed
        NuevoProyecto view= new NuevoProyecto();
        view.setVisible(true);
    }//GEN-LAST:event_btn_nuevoProyActionPerformed

    private void txt_busquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_busquedaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busquedaMouseClicked

    private void btn_nuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaFacturaActionPerformed
        NuevaFactura view = new NuevaFactura();
        view.setVisible(true);
    }//GEN-LAST:event_btn_nuevaFacturaActionPerformed

    private void btn_emitirfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emitirfacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_emitirfacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgCuit;
    private javax.swing.JPanel bg_tab_detallesGral;
    private javax.swing.JPanel bg_tab_factura;
    private javax.swing.JPanel bg_tab_proyectos;
    private javax.swing.JPanel bg_tituloTab;
    private javax.swing.JButton btn_bajaFactura;
    private javax.swing.JButton btn_darBaja;
    private javax.swing.JButton btn_detallesFactura1;
    private javax.swing.JButton btn_detallesProy;
    private javax.swing.JButton btn_editarProy;
    private javax.swing.JButton btn_editarform;
    private javax.swing.JButton btn_emitirfac;
    private javax.swing.JButton btn_guardartodo;
    private javax.swing.JButton btn_nuevaFactura;
    private javax.swing.JButton btn_nuevoProy;
    private javax.swing.JComboBox<String> cb_estadoproy;
    private javax.swing.JComboBox<String> cb_localidad;
    private javax.swing.JComboBox<String> cb_nroEquipo;
    private javax.swing.JComboBox<String> cb_pais;
    private javax.swing.JComboBox<String> cb_provincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabPanel_menu;
    private javax.swing.JLabel lbl_Provincia;
    private javax.swing.JLabel lbl_codPostal;
    private javax.swing.JLabel lbl_cuit;
    private javax.swing.JLabel lbl_cuitFactura;
    private javax.swing.JLabel lbl_descripProy;
    private javax.swing.JLabel lbl_detalleEquipo;
    private javax.swing.JLabel lbl_deudatotal1;
    private javax.swing.JLabel lbl_deudatotal2;
    private javax.swing.JLabel lbl_domicilio;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_estadoProy;
    private javax.swing.JLabel lbl_fechaEmision;
    private javax.swing.JLabel lbl_fechaInicio;
    private javax.swing.JLabel lbl_horasempleadas;
    private javax.swing.JLabel lbl_infoUsuario;
    private javax.swing.JLabel lbl_localidad;
    private javax.swing.JLabel lbl_nombreproy;
    private javax.swing.JLabel lbl_nroFac;
    private javax.swing.JLabel lbl_pais;
    private javax.swing.JLabel lbl_razSocial;
    private javax.swing.JLabel lbl_rznSocFac;
    private javax.swing.JLabel lbl_saldoDeuda;
    private javax.swing.JLabel lbl_saldoDeudaFac;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_tituloTab;
    private javax.swing.JLabel lbl_totalFac;
    private javax.swing.JToolBar tab_detallesGral;
    private javax.swing.JToolBar tab_facturas;
    private javax.swing.JToolBar tab_proyectos;
    private javax.swing.JTable tabla_detalleFac;
    private javax.swing.JTable tabla_equipo;
    private javax.swing.JTable tabla_facturas;
    private javax.swing.JTable table_proyectos;
    private javax.swing.JTextField txt_busqueda;
    private javax.swing.JTextField txt_codPostal;
    private javax.swing.JTextField txt_cuit;
    private javax.swing.JTextField txt_descriproy;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JFormattedTextField txt_fechaInicio;
    private javax.swing.JTextField txt_horasempleadas;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombreProy;
    private javax.swing.JTextField txt_razonSocial;
    private javax.swing.JTextField txt_saldoadeudado;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
