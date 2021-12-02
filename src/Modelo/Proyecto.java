
package Modelo;

import java.util.Date;

/**
 *
 * @author Marisol
 */
public class Proyecto {
    private int id;
    private String nombre;
    private String descripcion;
    private String fechInicio;
    private double horasEmpleadas;
    private boolean finalizado;
    private EquipoDesarrollo equipo;

    
    public Proyecto(int id, String nombre, String descripcion, String fechInicio, double horasEmpleadas, boolean finalizado, EquipoDesarrollo equipo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechInicio = fechInicio;
        this.horasEmpleadas = horasEmpleadas;
        this.finalizado = finalizado;
        this.equipo = equipo;
    }

    public Proyecto() {
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechInicio() {
        return fechInicio;
    }

    public void setFechInicio(String fechInicio) {
        this.fechInicio = fechInicio;
    }

    public double getHorasEmpleadas() {
        return horasEmpleadas;
    }

    public void setHorasEmpleadas(double horasEmpleadas) {
        this.horasEmpleadas = horasEmpleadas;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public EquipoDesarrollo getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoDesarrollo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechInicio=" + fechInicio + ", horasEmpleadas=" + horasEmpleadas + ", finalizado=" + finalizado + ", equipo=" + equipo + '}';
    }
    
}
