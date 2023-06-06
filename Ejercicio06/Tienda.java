/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.HashMap;

/**
 *
 * @author nacho
 */
public class Tienda {
    
 private double precio;
 private String producto;

    public Tienda() {
    }

    public Tienda(double precio, String producto) {
        this.precio = precio;
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
 
 
    
}
