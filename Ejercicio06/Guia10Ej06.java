/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej06;

import Entidad.Tienda;
import Servicios.TiendaServicio;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Guia10Ej06 {

    /**
     * @param args the command line arguments
     * 
     * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Tienda t1 = new Tienda();
        TiendaServicio ts = new TiendaServicio();
               
        int menu;

        do {

            System.out.println( "\u001B[32m" + " ¡¡BIENVENIDO AL MENU DE LOS PRODUCTOS!!" + "\u001B[32m");
            System.out.println("\u001B[35m" + "------------------------------------------" + "\u001B[35m");
            System.out.println("\u001B[35m" + "1. Ingresar productos a la lista \n"
                    + "\u001B[35m"+  "2. Modificar precio del producto  \n"
                    + "\u001B[35m"+"3. Eliminar un producto de la lista  \n"
                    + "\u001B[35m"+"4. Mostrar lista \n"
                    + "5. Salir"  + "\u001B[35m");
            
              System.out.println("\u001B[31m"+ "Ingrese la opcion"+ "\u001B[31m");
            menu = leer.nextInt();
            
            switch (menu) {
                case 1:
                    ts.ingresarProducto();
                    System.out.println("");
                    break;
                case 2:
                     ts.modificarPrecio(t1);
                    System.out.println("");
                    break;
                case 3:
                    ts.eliminarProducto(t1);
                    System.out.println("");
                    break;
                case 4:
                    ts.mostrarProducto(t1);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Ingreseaste mal una opción del menú, aprendé a contar");
            }

        } while (menu != 5);

    }

    }
    

