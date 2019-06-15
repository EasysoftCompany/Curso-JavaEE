/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.rs;

/**
 *
 * @author g_ric
 */
public class Evento {
        private long clave;
        private String nombre;
        private String genero;
        private String fecha;

    public Evento() {
    }

    public Evento(long clave, String nombre, String genero, String fecha) {
        this.clave = clave;
        this.nombre = nombre;
        this.genero = genero;
        this.fecha = fecha;
    }

    public long getClave() {
        return clave;
    }

    public void setClave(long clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Evento{" + "clave=" + clave + ", nombre=" + nombre + ", genero=" + genero + ", fecha=" + fecha + '}';
    }
        
        
    
}
