/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Persistencia.Database;
import Vista.ListarClientes;
import Vista.ModificarCliente;
import Vista.NuevoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Luciano Acosta
 */
public class ControlListarCliente implements ActionListener{
    
    Database db = new Database();
    ListarClientes listar = new ListarClientes();
    
    public ControlListarCliente(ListarClientes lc){
        this.listar=lc;
        this.listar.btn_darBaja.addActionListener(this);
        this.listar.btn_editarform.addActionListener(this);
        this.listar.btn_nuevocliente.addActionListener(this);
    }

    public ControlListarCliente() {
        
    }

    public void listarClientes(){
        DefaultTableModel datos = (DefaultTableModel) listar.tabla_clientes.getModel();
        datos.setNumRows(0);
        
        ArrayList<Cliente> lista = db.listarClientes();
        
        for(int i = 0;i<lista.size();i++){
            Object[] fila = {lista.get(i).getCuit(),
                             lista.get(i).getTelefono(),
                             lista.get(i).getMail(),
                             lista.get(i).getRazonSocial(),
                             lista.get(i).getDomicilio().getDomicilio(),
                             lista.get(i).getDomicilio().getLocalidad(),
                             lista.get(i).getDomicilio().getProvincia(),
                             lista.get(i).getDomicilio().getPais(),
                             lista.get(i).isVisible()
                             };
            
            datos.addRow(fila);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==listar.btn_nuevocliente){
            crearCliente();
            listarClientes();
        }
        if(e.getSource()==listar.btn_darBaja){
            darBajaCliente();
        }
        if(e.getSource()==listar.btn_editarform){
            editarCliente();
        }
    }

    private void crearCliente() {
        NuevoCliente nc = new NuevoCliente();  
        ControlCliente control = new ControlCliente(nc);
        control.cargar();   
        cargarCombos(nc);
        
    }

    private void darBajaCliente() {
        if(listar.tabla_clientes.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(null, "No fue seleccionado ninguna fila");
        }else{
            int fila = listar.tabla_clientes.getSelectedRow();
        
            Double cuit = Double.parseDouble(listar.tabla_clientes.getValueAt(fila, 0).toString());
        
            db.eliminarCliente(cuit);
            listarClientes();
        }
        
    }

    private void editarCliente() {
        if(listar.tabla_clientes.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(null, "No fue seleccionado ninguna fila");
        }else{
            int fila = listar.tabla_clientes.getSelectedRow();
        
            Double cuit = Double.parseDouble(listar.tabla_clientes.getValueAt(fila, 0).toString());
            String telefono = listar.tabla_clientes.getValueAt(fila, 1).toString();
            String mail = listar.tabla_clientes.getValueAt(fila, 2).toString();
            String razonSocial = listar.tabla_clientes.getValueAt(fila, 3).toString();
            String domicilio = listar.tabla_clientes.getValueAt(fila, 4).toString();
            String localidad = listar.tabla_clientes.getValueAt(fila, 5).toString();
            String Provincia = listar.tabla_clientes.getValueAt(fila, 6).toString();           
            String pais = listar.tabla_clientes.getValueAt(fila, 7).toString();
            
            ModificarCliente nc = new ModificarCliente();  
            ControlMCliente control = new ControlMCliente(nc);
            control.cargar();   
            
            nc.txt_localidad.setText(localidad);
            nc.txt_pais.setText(pais);
            nc.txt_provincia.setText(Provincia);
            nc.txt_cuit.setText(cuit.toString());
            nc.txt_direccion1.setText(domicilio);
            nc.txt_telefono1.setText(telefono);
            nc.txt_mail.setText(mail);
            nc.txt_razonSocial.setText(razonSocial);
        }
    }
    
    public void cargarCombos(NuevoCliente nc) {
        ArrayList<String> pais = db.listarPais();  
        ArrayList<String> provincia = db.listarProvincia();  
        ArrayList<String> localidad = db.listarLocalidad();  
        
        for(int i=0;i<pais.size();i++){
            nc.cb_pais.addItem(pais.get(i));
        }
        for(int i=0;i<provincia.size();i++){
            nc.cb_provincia1.addItem(provincia.get(i));
        }
        for(int i=0;i<localidad.size();i++){
            nc.cb_localidad.addItem(localidad.get(i));
        }
    }

    public void buscarCliente(String cuit, JTable tabla_clientes) {
        DefaultTableModel datos = (DefaultTableModel) tabla_clientes.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(datos);
        
        tabla_clientes.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(cuit));
    }
}
