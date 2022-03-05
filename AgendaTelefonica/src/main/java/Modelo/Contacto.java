/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author gerar
 */
public class Contacto {
    private String nombre;
    private String apellidos;
    private String apodo;
    private LocalDateTime fechaHora;
    private String direccion;
    private String tParticular;
    private String tMovil;
    private String tTrabajo;
    private String extension;
    private String eMail;
    private String tipo;
    private String nota;

    public Contacto() {
    }

    public Contacto(String nombre, String apellidos, String apodo, LocalDateTime fechaHora, String direccion, String tParticular, String eMail, String tipo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.apodo = apodo;
        this.fechaHora = fechaHora;
        this.direccion = direccion;
        this.tParticular = tParticular;
        this.eMail = eMail;
        this.tipo = tipo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String gettParticular() {
        return tParticular;
    }

    public void settParticular(String tParticular) {
        this.tParticular = tParticular;
    }

    public String gettMovil() {
        return tMovil;
    }

    public void settMovil(String tMovil) {
        this.tMovil = tMovil;
    }

    public String gettTrabajo() {
        return tTrabajo;
    }

    public void settTrabajo(String tTrabajo) {
        this.tTrabajo = tTrabajo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", apodo=" + apodo + ", fechaHora=" + fechaHora + ", direccion=" + direccion + ", tParticular=" + tParticular + ", tMovil=" + tMovil + ", tTrabajo=" + tTrabajo + ", extension=" + extension + ", eMail=" + eMail + ", tipo=" + tipo + ", nota=" + nota + '}';
    }

    public Boolean equals(Contacto a){
        return this.nombre.equals(a.nombre);
    }
    
}
