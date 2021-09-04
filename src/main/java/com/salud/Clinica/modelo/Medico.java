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
@Table(name = "medicos")
public class Medico extends Persona implements Serializable{
    
    private int matricula;
    private int celular;
    private List<Especialidad> especialidades = new ArrayList<>();
    private List<Turno> turnos = new ArrayList<>();
    
    public Medico(){};
    public Medico(int matricula, int celular, String nombre, String apellido, long dni, Domicilio domicilio) {
        super(nombre, apellido, dni, domicilio);
        this.matricula = matricula;
        this.celular = celular;
    }

    @Column(name = "matricula", nullable = false)
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    @Column(name = "celular", nullable = false)
    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    @ManyToMany(fetch=FetchType.LAZY,
        targetEntity=Especialidad.class,
        cascade=CascadeType.ALL)
        @JoinTable(
        name="MEDICO_ESPECIALIDAD",
        joinColumns=@JoinColumn(name="MEDICO_ID"),
        inverseJoinColumns=@JoinColumn(name="ESPECIALIDAD_ID")
    )

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="IdMedico")
    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
    
    public void addTurno(Turno turno) {
        this.turnos.add(turno);
    }
    
}
