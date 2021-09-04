package com.salud.Clinica.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author diego
 */
@Entity
@Table(name = "historiasClinicas")
public class HistoriaClinica extends EntityBean implements Serializable{
    private int numero;
    private Date fechaAlta;
    
    private List<DetalleHistoriaClinica> deltallesClinicos = new ArrayList<>();
    
    private Paciente paciente;

    public HistoriaClinica(int numero, Date fechaAlta, Paciente paciente) {
        this.numero = numero;
        this.fechaAlta = fechaAlta;
        this.paciente = paciente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="IdHisClinica")
    public List<DetalleHistoriaClinica> getDeltallesClinicos() {
        return deltallesClinicos;
    }

    public void setDeltallesClinicos(List<DetalleHistoriaClinica> deltallesClinicos) {
        this.deltallesClinicos = deltallesClinicos;
    }
    @OneToOne(cascade=CascadeType.ALL, mappedBy = "historiaClinica")
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void addDetalleClinico(DetalleHistoriaClinica detalle) {
        this.deltallesClinicos.add(detalle);
    }
    
}
