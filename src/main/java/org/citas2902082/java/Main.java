package org.citas2902082.java;

import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {

        Medico m = new Medico(1, "jeisson", "lesmes" ,
         TipoIdentificacion.CE, 1034857689L, 0, Especialidad.CARDIOLOGIA);

        System.out.println(m.toString());

        Usuario u = new Usuario();
    }
}