package org.citas2902082.java.entities;

import java.time.LocalDate;

import org.citas2902082.java.entities.enums.*;

public class Paciente {
    private Integer id;
    private String nombres;
    private String apellidos;
    private TipoIdentificacion tipoIdentificacion;
    private Integer numeroIdentificacion;
    private String correoElectronico;
    private Long celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

    
  
    public Paciente(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion, String correoElectronico, Long celular, LocalDate fechaNacimiento,
            Double altura, Double peso, TipoSangre tipoSangre, char factorRH) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

    public Paciente() {
    }

    public Integer getId() {
        return id;
    }





    public void setId(Integer id) {
        this.id = id;
    }





    public String getNombres() {
        return nombres;
    }





    public void setNombres(String nombres) {
        this.nombres = nombres;
    }





    public String getApellidos() {
        return apellidos;
    }





    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }





    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }





    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }





    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }





    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }





    public String getCorreoElectronico() {
        return correoElectronico;
    }





    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }





    public long getCelular() {
        return celular;
    }





    public void setCelular(Long celular) {
        this.celular = celular;
    }





    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }





    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }





    public Double getAltura() {
        return altura;
    }





    public void setAltura(Double altura) {
        this.altura = altura;
    }





    public Double getPeso() {
        return peso;
    }





    public void setPeso(Double peso) {
        this.peso = peso;
    }





    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }





    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }





    public char getFactorRH() {
        return factorRH;
    }





    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }







    
}
