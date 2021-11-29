
package Persistencia;

import Modelo.Cliente;
import Modelo.Domicilio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Marisol
 */
public class Database {
    Connection getConnection(){
        Connection c = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientes","root","");
            System.out.println("CONECTADO");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return c;
    }
    
    public void agregarClientes(Cliente cl, Domicilio d){
        try{
            //hacer funcion para el incremental domicilio
            String cadena1 = "insert into domicilio values (%1,'%2')"
            .replace("%1",""+d.getCodigo())
            .replace("%2",d.getDomicilio());            
            
            String cadena2 = "insert into cliente values (%1,'%2','%3','%4',%5,%6)"
           .replace("%1",""+cl.getCuit()) 
           .replace("%2",cl.getTelefono())
           .replace("%3",cl.getMail())  
           .replace("%4",cl.getRazonSocial())
           .replace("%5",""+d.getCodigo())
           .replace("%6",""+cl.isVisible());
            
            Connection c = getConnection();
            c.createStatement().executeUpdate(cadena1);    
            c.createStatement().executeUpdate(cadena2);
        }
        catch(Exception e){
            System.out.println(e);
        } 
    }
    
    public void eliminarCliente(double cuit){
        try{
            String cadena = "UPDATE cliente SET visible = 0 WHERE cuit = %1"
           .replace("%1",""+cuit); 
                      
            Connection c = getConnection();
            c.createStatement().executeUpdate(cadena);                
        }
        catch(Exception e){
            System.out.println(e);
        } 
    }
    
    public ArrayList<Cliente> listarClientes(){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        try {
          Connection c = getConnection();
          Statement s = c.createStatement();
          String sql = "select a.cuit, a.telefono, a.razonSocial, a.mail, b.idDomicilio as 'id_domicilio', b.domicilio FROM cliente as a, domicilio as b WHERE a.Domicilio_idDomicilio = b.idDomicilio and visible = 1";
          ResultSet r = s.executeQuery(sql);
        
          
          while(r.next()){
              Cliente cl = new Cliente();
              Domicilio d = new Domicilio(r.getInt("id_domicilio"),r.getString("domicilio"));              
              
              cl.setCuit(r.getDouble("cuit"));
              cl.setTelefono(r.getString("telefono"));
              cl.setMail(r.getString("mail"));
              cl.setRazonSocial(r.getString("razonSocial"));                   
              cl.setDomicilio(d);
              clientes.add(cl);
          }          
        } catch(Exception e){
            e.printStackTrace();
        }
        return clientes;
    }
    
    public void modificarCliente(Cliente cl, Domicilio d){
        try{
            String cadena1 = "UPDATE domicilio SET domicilio='%1' WHERE id_Domicilio = %2"
            .replace("%2",""+d.getCodigo())
            .replace("%1",d.getDomicilio());            
            
            String cadena2 = "UPDATE cliente SET telefono= '%1',mail='%2',razonSocial='%3' WHERE CUIT = %4"
           .replace("%1",cl.getTelefono())
           .replace("%2",cl.getMail())  
           .replace("%3",cl.getRazonSocial())
           .replace("%4",""+cl.getCuit());
            
            Connection c = getConnection();
            c.createStatement().executeUpdate(cadena1);    
            
        }
        catch(Exception e){
            System.out.println(e);
        } 
    }
}
