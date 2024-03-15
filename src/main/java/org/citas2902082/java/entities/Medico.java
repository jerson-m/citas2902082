package org.citas2902082.java.entities;
import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.*;
public class Medico extends Usuario{

    private int registroMedico;
    private Especialidad especialidad;

    public Medico(Integer id,
        String nombres,
        String apellidos,
        TipoIdentificacion tipoIdentificacion,
        Long numeroIdentificacion,
        int registroMedico,
        Especialidad especialidad) {
            //constructor de la clase padre
            //en un constructor de clase hija
            //es lo primero ue debe aparecer

        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);

        //iniciar los atriutos
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public int getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(int registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return
        super.toString()+
         "Medico [registroMedico=" + registroMedico + ", especialidad=" + especialidad + "]";
    }

    
     
    
    
   
    
}
