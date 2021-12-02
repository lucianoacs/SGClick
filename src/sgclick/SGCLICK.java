package sgclick;


import Controlador.ControlPrincipal;
import Persistencia.Database;
import Vista.VistaPrincipal;

public class SGCLICK {

    public static void main(String[] args) {
        
        Database db = new Database();
//        Domicilio d = new Domicilio(2,"Rivadavia 1050");
//        Cliente cl = new Cliente(2038243416,"3816024995","lucianoacosta28@gmail.com","LUCIANO SA",d,true);
//        db.agregarClientes(cl); 
//        db.eliminarCliente(2038243415);

//        ArrayList<Cliente> cl = db.listarClientes();
//        
//        for(int i=0;i<cl.size();i++){
//            System.out.println(cl.get(i));
//        }

        VistaPrincipal v = new VistaPrincipal();
        ControlPrincipal cp = new ControlPrincipal(v);
        v.setVisible(true);

        
//        ControlCliente c = new ControlCliente();
//        Domicilio d = new Domicilio(2,"Rivadavia 1050","San Miguel","Tucuman","Argentina");
//        Cliente cl = new Cliente(2038243416,"3816024995","lucianoacosta28@gmail.com","LUCIANO SA",d,true);
//        c.agregarCliente();
        
    }
    
}
