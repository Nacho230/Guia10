/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ej03;

import Entidad.Pelicula;
import Servicio.PeliculaServicio;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Guia10_Ej04 {

    /**
     * @param args the command line arguments
     * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        PeliculaServicio ps = new PeliculaServicio();
        Scanner leer = new Scanner(System.in);
        Pelicula p1 = new Pelicula();
        System.out.println("Introduce información de una pelicula");
        ps.init();

        int menu;

        do {

            System.out.println("\u001B[30m" + "¿Qué dato le gustaría saber acerca de las peliculas ingresadas?" + "\u001B[30m");
            System.out.println("\u001B[31m" + "------------------------------------------" + "\u001B[31m");
            System.out.println("\u001B[31m" + "1. Mostrar peliculas con una duración mayor a 1 hora  \n"
                    + "\u001B[31m" + "2. Mostrar peliculas ordenadas de menor a mayor  \n"
                    + "\u001B[31m" + "3. Mostrar peliculas ordenadas de mayor a menor \n"
                    + "\u001B[31m" + "4. Mostrar peliculas ordenadas alfabeticamente segun titulo \n"
                    + "\u001B[31m" + "5. Mostrar peliculas ordenadas alfabeticamente segun director  \n"
                    + "\u001B[31m" + "6. Mostrar todas las peliculas ingresadas  \n"
                    + "7. Salir" + "\u001B[30m");

            System.out.println("\u001B[30m" + "Ingrese la opcion" + "\u001B[30m");
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    ps.mostrarPeliculaSuperior();
                    System.out.println("");
                    break;
                case 2:
                    ps.ordenarPeliculaMayor(p1);
                    System.out.println("");
                    break;
                case 3:
                    ps.ordenarPeliculaMenor(p1);
                    System.out.println("");
                    break;
                case 4:
                    ps.ordenarTitulo(p1);
                    System.out.println("");
                    break;
                case 5:
                    ps.ordenarDirector(p1);
                    System.out.println("");
                    break;
                case 6:
                    ps.mostrarPelicula();
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Ingreseaste mal una opción del menú");
            }

        } while (menu != 7);

    }

}

