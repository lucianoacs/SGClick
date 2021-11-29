
package Modelo;

import java.math.BigInteger;



/**
 *
 * @author Marisol
 */
public class Cliente {
    private double cuit; //le va a quedar muy chico como para int -> hay una clase llamada BigInteger de la librería math, solo es probar que tal. 
    private String telefono;//lo mismo que cuit. 
    private String mail;
    private String razonSocial;
    private Domicilio domicilio; //domicilio como clase ya que tiene la direccion, pais, provincia y localidad xd(?
    private boolean visible; //podemos hacer una conversión en vez de trabajar con un byte como tipo de dato. 

    public Cliente(){
        
    }
    public Cliente(double cuit, String telefono, String mail, String razonSocial, Domicilio domicilio, boolean visible) {
        this.cuit = cuit;
        this.telefono = telefono;
        this.mail = mail;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.visible = visible;
    }
    
    public double getCuit() {
        return cuit;
    }

    /**
     *
     * @param cuit
     */
    public void setCuit(double cuit) {
        this.cuit = cuit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cuit=" + cuit + ", telefono=" + telefono + ", mail=" + mail + ", razonSocial=" + razonSocial + ", domicilio=" + domicilio + ", visible=" + visible + '}';
    } 
            
}
