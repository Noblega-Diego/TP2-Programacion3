package com.salud.Clinica.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "DetallesHisCli")
public class DetalleHistoriaClinica extends EntityBean implements Serializable{

    private Date fechaAtencion;
    private String sintomas;
    private String diagnostico;
    private String observaciones;
    private HistoriaClinica historiaClinica;

    public DetalleHistoriaClinica(Date fechaAtencion, String sintomas, String diagnostico, String observaciones, HistoriaClinica historiaClinica) {
        this.fechaAtencion = fechaAtencion;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
        this.historiaClinica = historiaClinica;
    }

    @Column(name= "fechaAtencion")
    public Date getFechaAtencion() {
        return fechaAtencion;
    }
    
    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
    @Column(name= "sintomas")
    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    @Column(name= "diagnostico")
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    @Column(name= "observaciones")
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    @ManyToOne
    @JoinColumn(name="IdHisClinica")
    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
    
    
    
}
