package sgclick;

import Modelo.Cliente;
import Modelo.Domicilio;
import Persistencia.Database;
import java.util.ArrayList;

public class SGCLICK {

    public static void main(String[] args) {
        
        Database db = new Database();
//        Domicilio d = new Domicilio(2,"Rivadavia 1050");
//        Cliente cl = new Cliente(2038243416,"3816024995","lucianoacosta28@gmail.com","LUCIANO SA",d,true);
//        db.agregarClientes(cl); 
//        db.eliminarCliente(2038243415);

        ArrayList<Cliente> cl = db.listarClientes();
        
        for(int i=0;i<cl.size();i++){
            System.out.println(cl.get(i));
        }
    }
    
}
