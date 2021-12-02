/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Domicilio;
import Persistencia.Database;
import Vista.ListarClientes;
import Vista.NuevoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marisol
 */
public class ControlCliente implements ActionListener{

    Database db = new Database();
    NuevoCliente vNvoCliente = new NuevoCliente();
    ListarClientes listar = new ListarClientes();
    
    public ControlCliente(NuevoCliente nvo){
        this.vNvoCliente=nvo;
        this.vNvoCliente.btn_registrar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vNvoCliente.btn_registrar){
            System.out.println("entro action crear");
            agregarCliente();
        }
    }    
    
    public void cargar() {
        vNvoCliente.setVisible(true);
    }    
    
    public void agregarCliente() {
        int CUIT = Integer.parseInt(vNvoCliente.txt_cuit.getText());
        String razon = vNvoCliente.txt_razonSocial.getText();
        String correo = vNvoCliente.txt_mail.getText();
        String telefono = vNvoCliente.txt_telefono1.getText();
        
        String domicilio = vNvoCliente.txt_direccion.getText();
        String localidad = vNvoCliente.cb_localidad.getSelectedItem().toString();
        String provincia = vNvoCliente.cb_provincia1.getSelectedItem().toString();
        String pais = vNvoCliente.cb_pais.getSelectedItem().toString();
        
        int codigo = generarCodDomicilio(26);
        
        Domicilio d = new Domicilio(codigo,domicilio,localidad,provincia,pais);
        Cliente cl = new Cliente(CUIT,telefono,correo,razon,d,true);
        db.agregarClientes(cl, d);
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

    private int generarCodDomicilio(int numero) {
        int codigo = numero+1;
        return codigo;
    }
}
