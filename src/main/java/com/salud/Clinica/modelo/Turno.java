package com.salud.Clinica.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
/**
 *
 * @author diego
 */
@Entity
@Table(name = "turnos")
public class Turno extends EntityBean implements Serializable{
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "horas")
    private int hora;
    @Column(name = "minutos")
    private int minutos;
    @ManyToOne
    @JoinColumn(name = "IdMedico")
    private Medico medico;
    @ManyToOne
    @JoinColumn(name = "IdPaciente")
    private Paciente paciente;

    public Turno(Date fecha, int hora, int minutos, Medico medico, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.minutos = minutos;
        this.medico = medico;
        this.paciente = paciente;
    }
    
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
    
    
}
