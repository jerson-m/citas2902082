package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class CitaEnfermero extends Cita{

    private String procedimiento;
    private Enfermero enfermero;
    public CitaEnfermero(LocalDateTime fecha, Paciente paciente, String procedimiento, Enfermero enfermero) {
        super(fecha, paciente);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }

    

    

}
