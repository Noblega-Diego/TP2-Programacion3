package com.salud.Clinica.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "domicilios")
public class Domicilio extends EntityBean implements Serializable{
    
    private String Localidad;
    private String calle;
    private int numero;
    private Persona persona;

    public Domicilio(String Localidad, String calle, int numero) {
        this.Localidad = Localidad;
        this.calle = calle;
        this.numero = numero;
    }
    
    
    
    @Column(name = "localidad")
    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }
    @Column(name = "calle")
    public String getCalle() {
        return calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    @Column(name = "numero")
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
