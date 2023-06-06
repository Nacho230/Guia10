/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej01;

import Entidad.Perro;
import Servicio.PerroServicio;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Guia10Ej01_Ej02 {
   static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     * 
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Perro p1 = new Perro();
        PerroServicio ps = new PerroServicio();
        
        ps.perrito();
        ps.mostrarRazas();
        ps.buscarPerro(p1);
        ps.mostrarOrdenar();
    }
    
}
