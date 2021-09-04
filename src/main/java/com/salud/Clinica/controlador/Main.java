package com.salud.Clinica.controlador;

import com.salud.Clinica.modelo.DetalleHistoriaClinica;
import com.salud.Clinica.modelo.Domicilio;
import com.salud.Clinica.modelo.HistoriaClinica;
import com.salud.Clinica.modelo.Medico;
import com.salud.Clinica.modelo.Paciente;
import com.salud.Clinica.modelo.Turno;
import java.util.Date;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args){
        try{
            Gestor gestorDB = new Gestor();
            gestorDB.iniciarSecion();
            Medico medico = new Medico(123, 123334, "Juan", "Martin", 224434, new Domicilio("Las heras", "San Martin", 122));
            Paciente paciente = new Paciente(322, "Morel", "Suarez", 234128, new Domicilio("Las heras", "San Martin", 123));
            paciente.setHistoriaClinica(new HistoriaClinica(0, new Date(), paciente));
            paciente.getHistoriaClinica().addDetalleClinico(new DetalleHistoriaClinica(
                    new Date(), 
                    "Alergia", 
                    "Alergia al pelo de gato", 
                    "estornudos", 
                    paciente.getHistoriaClinica()));
            Turno turno = new Turno(new Date(), 3, 4, medico, paciente);
            paciente.addTurno(turno);
            medico.addTurno(turno);
            gestorDB.guardar(medico);
            gestorDB.guardar(paciente);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
