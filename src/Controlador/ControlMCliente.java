/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Domicilio;
import Persistencia.Database;
import Vista.ModificarCliente;
import Vista.NuevoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Luciano Acosta
 */
class ControlMCliente implements ActionListener{

    ModificarCliente mCliente = new ModificarCliente();
    Database db = new Database();
    
    public ControlMCliente(ModificarCliente nvo){
        this.mCliente=nvo;
        this.mCliente.btn_registrar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== mCliente.btn_registrar){
            modificarCliente();
        }
    }
    
    void cargar() {
        mCliente.setVisible(true);
    }

    private void modificarCliente() {
        double CUIT = Double.parseDouble(mCliente.txt_cuit.getText());
        String razon = mCliente.txt_razonSocial.getText();
        String correo = mCliente.txt_mail.getText();
        String telefono = mCliente.txt_telefono1.getText();
        
        String domicilio = mCliente.txt_direccion1.getText();
        String localidad = mCliente.txt_localidad.getText();
        String provincia = mCliente.txt_provincia.getText();
        String pais = mCliente.txt_pais.getText();
        
        int codigo = db.listarDomicilios(CUIT);
        
        Domicilio d = new Domicilio(codigo,domicilio,localidad,provincia,pais);
        Cliente cl = new Cliente(CUIT,telefono,correo,razon,d,true);
        db.modificarCliente(cl, d);
    }
    
}
