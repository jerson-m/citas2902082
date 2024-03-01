package org.citas2902082.java.entities;
import org.citas2902082.java.entities.enums.*;
public class Medico {
    public Integer id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public int numeroIdentificacion;
    public int registroMedico;
    public Especialidad especialidad;
   
    public Medico( String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            int numeroIdentificacion, int registroMedico, Especialidad especialidad) {
        
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    
}
