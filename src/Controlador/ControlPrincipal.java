/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Persistencia.Database;
import Vista.ListarClientes;
import Vista.NuevoCliente;
import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Luciano Acosta
 */
public class ControlPrincipal implements  ActionListener{
    
    JPanel container1 = new JPanel();
    Database db = new Database();
    VistaPrincipal vp = new VistaPrincipal();    
    
    public ControlPrincipal(VistaPrincipal v){
        this.vp=v;        
        this.vp.btn_nuevoCliente1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vp.btn_nuevoCliente1){
            NuevoCliente nc = new NuevoCliente();  
            ControlCliente control = new ControlCliente(nc);
            control.cargar();   
            cargarCombos(nc);
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

}
