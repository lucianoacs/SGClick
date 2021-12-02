
package Persistencia;

import Modelo.Cliente;
import Modelo.Domicilio;
import Modelo.EquipoDesarrollo;
import Modelo.Proyecto;
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
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientes","root","2531");
            System.out.println("CONECTADO");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return c;
    }
    
    //CLIENTES    
    public void agregarClientes(Cliente cl, Domicilio d){
        try{
            //hacer funcion para el incremental domicilio
            String cadena1 = "insert into domicilio values (%1,'%2','%3','%4','%5')"
            .replace("%1",""+d.getCodigo())
            .replace("%2",d.getDomicilio())
            .replace("%3",d.getLocalidad())
            .replace("%4",d.getProvincia())
            .replace("%5",d.getPais());            
            
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
        
    public void modificarCliente(Cliente cl, Domicilio d){
        try{
            String cadena1 = "UPDATE domicilio SET calleyaltura='%1',localidad='%2',provincia='%3',pais='%4' WHERE idDomicilio = %5"
            .replace("%5",""+d.getCodigo())
            .replace("%1",d.getDomicilio())
            .replace("%2",d.getLocalidad())
            .replace("%3",d.getProvincia())
            .replace("%4",d.getPais());            
            
            String cadena2 = "UPDATE cliente SET telefono= '%1',mail='%2',razonSocial='%3' WHERE CUIT = %4"
           .replace("%1",cl.getTelefono())
           .replace("%2",cl.getMail())  
           .replace("%3",cl.getRazonSocial())
           .replace("%4",""+cl.getCuit());
            
            Connection c = getConnection();
            c.createStatement().executeUpdate(cadena1);    
            c.createStatement().executeUpdate(cadena2);
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
          String sql = "select a.cuit, a.telefono, a.razonSocial, a.mail, b.idDomicilio as 'id_domicilio', b.calleyaltura, b.localidad, b.provincia, b.pais FROM cliente as a, domicilio as b WHERE a.Domicilio_idDomicilio = b.idDomicilio and visible = 1";
          ResultSet r = s.executeQuery(sql);
        
          
          while(r.next()){
              Cliente cl = new Cliente();
              Domicilio d = new Domicilio(r.getInt("id_domicilio"),r.getString("calleyaltura"),r.getString("localidad"),r.getString("provincia"),r.getString("pais"));              
              
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
    
    //PROYECTOS
    public void agregarEquipo(EquipoDesarrollo eq){
        try{
            //hacer funcion para el incremental domicilio
            String cadena1 = "insert into equipodesarrollo values (%1,'%2')"
            .replace("%1",""+eq.getId())
            .replace("%2",eq.getDescripción());            
            
            Connection c = getConnection();
            c.createStatement().executeUpdate(cadena1);    
        }
        catch(Exception e){
            System.out.println(e);
        } 
    }
    
    public void agregarProyecto(Proyecto p, EquipoDesarrollo eq){
        try{
            agregarEquipo(eq);            
            
            String cadena1 = "insert into proyecto values (%1,'%2','%3','%4',%5,%6,%7)"
           .replace("%1",""+p.getId()) 
           .replace("%2",p.getNombre())
           .replace("%3",p.getDescripcion())  
           .replace("%4",p.getFechInicio().toString())
           .replace("%5",""+p.getHorasEmpleadas())
           .replace("%6",""+p.isFinalizado())
           .replace("%7",""+p.getEquipo().getId());
            
            Connection c = getConnection();
            c.createStatement().executeUpdate(cadena1);    
        }
        catch(Exception e){
            System.out.println(e);
        } 
    }
    
    public ArrayList<Proyecto> listarProyectos(){
        ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();
        try {
          Connection c = getConnection();
          Statement s = c.createStatement();
          String sql = "select distinct a.cuit, e.Nombre, e.fechaInicio, e.horasEmpleadas, e.finalizado"
                  + " from cliente as a, historial as b, factura as c, detalle as d"
                  + " INNER JOIN proyecto as e"
                  + " WHERE a.cuit = b.Cliente_CUIT and b.idHistorial = c.Historial_idHistorial and c.idFactura = d.Factura_idFactura and d.Proyecto_idProyecto = e.idProyecto";
          ResultSet r = s.executeQuery(sql);       
          
          while(r.next()){
              Proyecto p = new Proyecto();
              Cliente cl = new Cliente();
              
              p.setNombre(r.getString("Nombre"));
              p.setFechInicio((r.getString("fechaInicio")));
              p.setHorasEmpleadas(r.getDouble("horasEmpleadas"));
              p.setFinalizado(r.getBoolean("finalizado"));
              
              proyectos.add(p);
          }          
        } catch(Exception e){
            e.printStackTrace();
        }
        return proyectos;
    }
    
    public ArrayList<Cliente> listarClienteProyectos(){
        ArrayList<Cliente> clienteProyectos = new ArrayList<Cliente>();
        try {
          Connection c = getConnection();
          Statement s = c.createStatement();
          String sql = "select distinct a.cuit, e.Nombre, e.fechaInicio, e.horasEmpleadas, e.finalizado"
                  + " from cliente as a, historial as b, factura as c, detalle as d"
                  + " INNER JOIN proyecto as e"
                  + " WHERE a.cuit = b.Cliente_CUIT and b.idHistorial = c.Historial_idHistorial and c.idFactura = d.Factura_idFactura and d.Proyecto_idProyecto = e.idProyecto";
          ResultSet r = s.executeQuery(sql);       
          
          while(r.next()){
              Cliente cl = new Cliente();
              
              cl.setCuit(r.getDouble("cuit"));
              
              clienteProyectos.add(cl);
          }          
        } catch(Exception e){
            e.printStackTrace();
        }
        return clienteProyectos;
    }
    
    //DOMICILIO   
    public ArrayList<String> listarPais(){
        ArrayList<String> pais = new ArrayList<String>();
        try {
          Connection c = getConnection();
          Statement s = c.createStatement();
          String sql = "select descripcion from pais";
          ResultSet r = s.executeQuery(sql);
          
          while(r.next()){
              String p = r.getString("descripcion");
              pais.add(p);
          }          
        } catch(Exception e){
            e.printStackTrace();
        }
        return pais;
    }
     
    public ArrayList<String> listarLocalidad(){
        ArrayList<String> localidades = new ArrayList<String>();
        try {
          Connection c = getConnection();
          Statement s = c.createStatement();
          String sql = "select descripcion from localidad";
          ResultSet r = s.executeQuery(sql);
        
          
          while(r.next()){
              String p = r.getString("descripcion");
              localidades.add(p);
          }          
        } catch(Exception e){
            e.printStackTrace();
        }
        return localidades;
    }
    
    public ArrayList<String> listarProvincia(){
        ArrayList<String> provincias = new ArrayList<String>();
        try {
          Connection c = getConnection();
          Statement s = c.createStatement();
          String sql = "select descripcion from provincia";
          ResultSet r = s.executeQuery(sql);
        
          
          while(r.next()){
              String p = r.getString("descripcion");
              provincias.add(p);
          }          
        } catch(Exception e){
            e.printStackTrace();
        }
        return provincias;
    }
    
    public int listarDomicilios(double cuit){
        int dom = 0;
        try {
          Connection c = getConnection();
          Statement s = c.createStatement();
          String sql = "select a.idDomicilio FROM domicilio as a, cliente as b WHERE a.idDomicilio = b.Domicilio_idDomicilio and b.CUIT = %1".replace("%1",""+cuit);
          ResultSet r = s.executeQuery(sql);        
          
          while(r.next()){
              dom = r.getInt("idDomicilio");                    
          }          
        } catch(Exception e){
            e.printStackTrace();
        }
        return dom;
    }
    
    //EMPLEADOS
    
}
