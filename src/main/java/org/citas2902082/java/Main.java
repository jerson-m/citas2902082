package org.citas2902082.java;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.citas2902082.java.entities.Cita;
import org.citas2902082.java.entities.CitaMedico;
import org.citas2902082.java.entities.Consultorio;
import org.citas2902082.java.entities.Enfermero;
import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Paciente;
import org.citas2902082.java.entities.enums.*;

public class Main {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {

        Medico m = new Medico(1, "jeisson", "lesmes" ,
         TipoIdentificacion.CE, 1034857689L, 0, Especialidad.CARDIOLOGIA);

        Medico medico1 = new Medico(2, "Roberto Javier", "Carlos Garcia", TipoIdentificacion.CE, 101547885L, 0, Especialidad.ANESTESIOLOGIA);
        Medico medico2 = new Medico(3, "ricardo", "bautista rincon", TipoIdentificacion.CC, 1011457895L, 0, Especialidad.ALERGOLOGIA);

        Paciente paciente1 = new Paciente(1, "Jerson", "Jimenez", TipoIdentificacion.CC, 1018420005, "jerjim@gmail.com", 3125028990L, LocalDate.of(2006, 01, 31), 1.90, (double) 150, TipoSangre.A, '+');
        Paciente paciente2 = new Paciente(2, "jeisson", "vargas", TipoIdentificacion.CE, 1031647963, "nicoleyjeisson@gmail.com", 315369741L, LocalDate.of(2005, 12, 20), 1.90, 90.0, TipoSangre.AB, '-');
        Paciente paciente3 = new Paciente(3, "Maria", "Villamarin", TipoIdentificacion.CC, 1000414447, "sergioteamo@gmail.com", 3145028990L, LocalDate.of(2010, 01, 11), 1.90, 15.0, TipoSangre.O, '+');
        Paciente paciente4 = new Paciente(4, "Sergio", "Rincon", TipoIdentificacion.PPT, 1014789996, "sergior@gmail.com", 3236146958L, LocalDate.of(2020, 12, 20), 1.50, 40.0, TipoSangre.A, '+');
        Paciente paciente5 = new Paciente(5, "Darwin", "Lemes", TipoIdentificacion.PPT, 1032435768, "darles@gmail.com", 3235847865L, LocalDate.of(2022, 02, 10), 1.10, 10.0, TipoSangre.AB, '-');

        Enfermero enfermero1 = new Enfermero(1, "Dayana", "Vargas", TipoIdentificacion.CC, 51554877L);
        Enfermero enfermero2 = new Enfermero(2, "Esteban", "Marinez", TipoIdentificacion.CE, 1032654789L);
        Enfermero enfermero3 = new Enfermero(3, "Paola", "Martin", TipoIdentificacion.CE, 10547789654L);

        CitaMedico cita1 = new CitaMedico(LocalDateTime.of(2024, 02, 12, 21, 10, 50), paciente5, "Gripe", medico2, EstadoCita.AGENDADA, new Consultorio(1, "Calle 148 #154 F 42", 2));
        CitaMedico cita2 = new CitaMedico(LocalDateTime.of(2024, 04, 25, 11, 30, 00), paciente2, "Escopolamina", medico1, EstadoCita.AGENDADA, new Consultorio(2, "Calle 158 #154 F 42", 1));

        System.out.println("Fecha: "+ cita1.getFecha() + "| Consultorio: "+ cita1.getConsultorio() + "| Nombres y apellidos medico: "+ medico2.getNombres()+" "+ medico2.getApellidos() + "|  Nombres y apellidos paciente: "+ paciente5.getNombres()+" "+ paciente5.getApellidos());
        System.out.println("Fecha: "+ cita2.getFecha() + "| Consultorio: "+ cita2.getConsultorio() + "| Nombres y apellidos medico: "+ medico1.getNombres()+" "+ medico1.getApellidos() + "|  Nombres y apellidos paciente: "+ paciente2.getNombres()+" "+ paciente2.getApellidos());

        CitaMedico cance1 = new CitaMedico(LocalDateTime.of(2023, 12, 30, 21, 10, 32), paciente5, "Gripe", medico2, EstadoCita.CANCELADA, new Consultorio(1, "Calle 148 #154 F 42", 2));
        System.out.println("Cita cancelada: "+ cance1.getEstado());
    }
}