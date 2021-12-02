/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Proyecto;
import Persistencia.Database;
import Vista.ListarProyectos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Luciano Acosta
 */
public class ControlListarProyecto implements ActionListener{
    
    ListarProyectos lp = new ListarProyectos();
    Database db = new Database();
    
    public ControlListarProyecto(ListarProyectos listar){
        this.lp = listar;
    }

    public ControlListarProyecto() {
        
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

    public void listarProyectos(){
        DefaultTableModel datos = (DefaultTableModel) lp.jTable1.getModel();
        datos.setNumRows(0);
        
        ArrayList<Proyecto> lista = db.listarProyectos();
        ArrayList<Cliente> listaC = db.listarClienteProyectos();
        
        for(int i = 0;i<lista.size();i++){
            Object[] fila = {listaC.get(i).getCuit(),
                             lista.get(i).getNombre(),
                             lista.get(i).getFechInicio(),
                             lista.get(i).getHorasEmpleadas(),
                             lista.get(i).isFinalizado()};
            datos.addRow(fila);
            System.out.println(Arrays.toString(fila));
        }
    }
    
    public void buscarProyecto(String nombreProyecto, JTable jTable1) {
        DefaultTableModel datos = (DefaultTableModel) jTable1.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(datos);
        
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(nombreProyecto, 0,1,2,3));
    }
    
}
