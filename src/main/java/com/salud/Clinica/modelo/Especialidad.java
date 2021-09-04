package com.salud.Clinica.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author diego
 */
@Entity
@Table(name = "Especialidades")
public class Especialidad extends EntityBean implements Serializable{
    
    private String denominacion;
    private List<Medico> especialistas = new ArrayList<>();
    
    public Especialidad(){};
    public Especialidad(String denominacion) {
        this.denominacion = denominacion;
    }
    @Column(name = "denominacion")
    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    @ManyToMany(
        cascade = {CascadeType.PERSIST, CascadeType.MERGE},
        mappedBy = "especialidades",
        targetEntity = Medico.class
    )
    public List<Medico> getEspecialistas() {
        return especialistas;
    }

    public void setEspecialistas(List<Medico> especialistas) {
        this.especialistas = especialistas;
    }
    
    
}
