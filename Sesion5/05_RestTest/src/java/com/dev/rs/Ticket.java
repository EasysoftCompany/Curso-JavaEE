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
public class Ticket {
    
    private long id;
    private String usuario;
    private String lugar;
    private double precio;
    private Evento evento;

    public Ticket() {
    }

    public Ticket(long id, String usuario, String lugar, double precio, Evento evento) {
        this.id = id;
        this.usuario = usuario;
        this.lugar = lugar;
        this.precio = precio;
        this.evento = evento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    
    
}
