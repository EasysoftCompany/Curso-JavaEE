/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author g_ric
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Empleado {
    
    private Departamento dpto;
    private String apellido;
    
    @XmlAttribute
    private int id;
    private String nombre;

    public Empleado() {
    }

    public Empleado(Departamento dpto, String apellido, int id, String nombre) {
        this.dpto = dpto;
        this.apellido = apellido;
        this.id = id;
        this.nombre = nombre;
    }

    public Departamento getDpto() {
        return dpto;
    }

    public void setDpto(Departamento dpto) {
        this.dpto = dpto;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dpto=" + dpto + ", apellido=" + apellido + ", id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
