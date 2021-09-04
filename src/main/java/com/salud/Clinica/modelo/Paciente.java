
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
@Table(name = "pacientes")
public class Paciente extends Persona implements Serializable{

    
    private int nroSocio;
    private List<Turno> turnos = new ArrayList<>();
    private HistoriaClinica historiaClinica;
    public Paciente(){}
    public Paciente(int nroSocio, String nombre, String apellido, long dni, Domicilio domicilio) {
        super(nombre, apellido, dni, domicilio);
        this.nroSocio = nroSocio;
    }
    @Column(name = "nroSocio")
    public int getNroSocio() {
        return nroSocio;
    }
    
    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdPaciente")
    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "historiaClinca_id")
    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public void addTurno(Turno turno) {
        this.turnos.add(turno);
    }
    
    
}
