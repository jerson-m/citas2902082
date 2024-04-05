package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class Cita {

    protected static Integer id;
    protected LocalDateTime fecha;
    protected Paciente paciente;
    protected static Consultorio consultorio;
    
    
    public Cita() {
    } 


    public Cita(Integer id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio) {
        this.id = id;
        this.fecha = fecha;
        this.paciente = paciente;
        this.consultorio = consultorio;
    }





    public LocalDateTime getFecha() {
        return fecha;
    }


    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public Paciente getPaciente() {
        return paciente;
    }


    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    public static Consultorio getConsultorio() {
        return consultorio;
    }


    public static void setConsultorio(Consultorio consultorio) {
        Cita.consultorio = consultorio;
    }

    


    

    
}
