package com.salud.Clinica.modelo;

import javax.persistence.*;

/**
 *
 * @author diego
 */
@MappedSuperclass// clase padre de las entidades
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona extends EntityBean implements java.io.Serializable{

    
    private String nombre;
    private String apellido;
    private long dni;
    protected Domicilio domicilio;
    public Persona(){}
    public Persona(String nombre, String apellido, long dni, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
    }
    @Column(name = "nombre", nullable = false)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Column(name = "apellido", nullable = false)
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Column(name = "dni", nullable = false)
    public long getDni() {
        return dni;
    }
    
    public void setDni(long dni) {
        this.dni = dni;
    }
    @OneToOne(targetEntity = Domicilio.class, cascade = CascadeType.ALL)
    @JoinColumn(name="domicilio_id",referencedColumnName="id",nullable = false)
    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    
}
