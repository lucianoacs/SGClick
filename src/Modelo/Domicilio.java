/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Marisol
 */
public class Domicilio {
    private int codigo; 
    private String domicilio;
    private String localidad;
    private String provincia;
    private String pais;

    public Domicilio(int codigo, String domicilio, String localidad, String provincia, String pais) {
        this.codigo = codigo;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
    }

    public Domicilio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "codigo=" + codigo + ", domicilio=" + domicilio + ", localidad=" + localidad + ", provincia=" + provincia + ", pais=" + pais + '}';
    } 
    
}
