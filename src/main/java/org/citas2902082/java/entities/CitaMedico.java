package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.EstadoCita;

public class CitaMedico extends Cita implements IAgendable{

    private String motivo;
    private Medico medico;
    private EstadoCita estado;
    
    public CitaMedico(LocalDateTime fecha, Paciente paciente, String motivo, Medico medico, EstadoCita estado) {
        super(fecha, paciente);
        this.motivo = motivo;
        this.medico = medico;
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public EstadoCita getEstado() {
        return estado;
    }
    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }

    @Override
    public void canelarCita() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canelarCita'");
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reagendarCita'");
    }



    

    
}
