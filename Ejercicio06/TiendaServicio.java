/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import utilidad.UTILIDAD;

/**
 *
 * @author nacho
 */
public class TiendaServicio {
    
    /*
    Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
    */
    
    static Scanner leer = new Scanner(System.in);
    HashMap<String, Double> tiendaAux = new HashMap();
    UTILIDAD u1 = new UTILIDAD();

    public void ingresarProducto() {
        boolean respuesta = true;
        boolean aux = true;
        do {
            Tienda t1 = new Tienda();
            System.out.println("Introduzca el nombre del producto: ");
            t1.setProducto(leer.next().toLowerCase());

            System.out.println("Introduzca el precio del producto: ");
            do {
                t1.setPrecio(leer.nextDouble());
                if (t1.getPrecio() >= 0) {
                    aux = false;
                    System.out.println("El precio introducido es correcto...");
                } else {
                    System.out.println("Introduzca un precio correcto");
                    aux = true;
                }
            } while (aux);

            tiendaAux.put(t1.getProducto(), t1.getPrecio());

            respuesta = u1.verificarDato();

        } while (respuesta);

        //System.out.println(tiendaAux);
    }

    public void modificarPrecio(Tienda t1) {
        boolean aux = true;
        System.out.println("Ingrese el nombre del producto que desea modificar su precio: ");
        String productoAux = leer.next().toLowerCase();
        t1.setProducto(productoAux);

        if (tiendaAux.containsKey(productoAux)) {
            aux = true;
            System.out.println("Ingrese el valor nuevo del producto: ");
            Double precioAux = leer.nextDouble();
            t1.setPrecio(precioAux);
            tiendaAux.put(t1.getProducto(), t1.getPrecio());
        } else {
            aux = false;
        }

        if (!aux) {
            System.out.println("El producto no se encuentra en la lista");
        }
        //System.out.println(tiendaAux);
    }

    public void eliminarProducto(Tienda t1) {
        boolean aux = true;
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        String productoAux = leer.next().toLowerCase();
        t1.setProducto(productoAux);

        if (tiendaAux.containsKey(productoAux)) {
            System.out.println("Eliminando producto...");
            aux = true;
            tiendaAux.remove(productoAux);
            System.out.println("La lista actualizada es: ");
            System.out.println(tiendaAux);

        } else {
            aux = false;
        }
        if (!aux) {
            System.out.println("El producto no se encuentra en la lista");
        }
        //System.out.println(tiendaAux);
    }

    public void mostrarProducto(Tienda t1) {
        if (tiendaAux.isEmpty()) {
            System.out.println("La lista está vacia, primero ingresa valores tonto");
        } else {
            System.out.println("La lista de productos es: ");
            System.out.println(tiendaAux);
        }
    }
}
