
package com.salud.Clinica.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "empleados")
public class Empleado extends Persona{

    @Column(name = "legajo")
    private int nroLegajo;
    @Column(name = "suledo")
    private double sueldo;

    public Empleado(){}
    public Empleado(int nroLegajo, double sueldo, String nombre, String apellido, long dni, Domicilio domicilio) {
        super(nombre, apellido, dni, domicilio);
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
