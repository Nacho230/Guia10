/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import Utilidades.Utilidad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class PerroServicio {

    static Scanner leer = new Scanner(System.in);
    Utilidad u1 = new Utilidad();
    private ArrayList<String> perros;

    public PerroServicio() {
        this.perros = new ArrayList();
    }

    public Perro perrito() {

        boolean respuesta = true;

        Perro p1 = new Perro();

        do {

            System.out.println("Ingrese la raza del perro: ");

            String raza = leer.nextLine();
            perros.add(raza);

            respuesta = u1.verificarDato();
        } while (respuesta);

        return p1;
    }

    public void mostrarRazas() {

        System.out.println("La lista de perros es: ");
        for (String aux : perros) {
            System.out.println("- " + aux);
        }

    }

    
    /*
    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
    */
    public void buscarPerro(Perro p1){
        boolean bandera = true;
        Iterator<String> it =  perros.iterator(); 
        System.out.println("Ingrese una raza de perro a buscar: ");
        String raza = leer.nextLine();
        
        while (it.hasNext()){
            String aux = it.next();
     
            if (raza.equals(aux)) {
                System.out.println("VAMOS A MATAR A ESE PERRO");
                it.remove();
                bandera = true;
                break;
                       }else{
                bandera = false;
                
            }
            
        }
            if(!bandera){
                System.out.println("El perro ingresado no se encuentra!!");
            }
            
        
            }
        
            
    public void mostrarOrdenar(){
     Collections.sort(perros);
        System.out.println("La lista de perros ordenadas es: " + perros);
        
    }
       
        
    }
    

