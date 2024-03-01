package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class Cita {

    public Integer id;
    public LocalDateTime fecha;
    public Medico medico;
    public Consultorio consultorio;
    public Paciente paciente;
    
    public Cita( LocalDateTime fecha) {
      
        this.fecha = fecha;
    }

    
}
