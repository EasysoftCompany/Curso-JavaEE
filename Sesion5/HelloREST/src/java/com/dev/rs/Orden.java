package com.dev.rs;

/**
 *
 * @author g_ric
 */
public class Orden {
    
    private long id;
    private String descripcion;
    private int cantidad;
    private double precio;
    private boolean isFacturable;

    public Orden() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isIsFacturable() {
        return isFacturable;
    }

    public void setIsFacturable(boolean isFacturable) {
        this.isFacturable = isFacturable;
    }

   
    
    
    
}
