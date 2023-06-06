/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import utilidad.UTILIDAD;

/**
 *
 * @author nacho
 */
public class PaisServicio {
    /*
     El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
    */
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    UTILIDAD u1 = new UTILIDAD();
    boolean respuesta = true;
     private HashSet<String> Paises = new HashSet();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.Paises);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaisServicio other = (PaisServicio) obj;
        if (!Objects.equals(this.Paises, other.Paises)) {
            return false;
        }
        return true;
    }
     
    public void init(){
        String pais;
        do {
            
            System.out.println("Ingrese un país: ");
            pais = leer.nextLine().toLowerCase();
            
            Paises.add(pais);
            
            respuesta = u1.verificarDato();
            
            
        } while (respuesta);
        
        mostrarPais();
        
    }
    
    public void mostrarPais(){
        
        for(String aux : Paises){
            System.out.println("Los paises ingresados son: -" + aux);
        }
        
    }
    
    public void ordenarPais(){
       ArrayList<String> ArrayAux = new ArrayList(Paises);
        System.out.println("Los paises ordenados alfabeticamente son: ");
        Collections.sort(ArrayAux);
        System.out.println(ArrayAux);
       
    }
    
    
    /*
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
     * 
    */
    
    public void borrarPais(){
        
        System.out.println("Ingrese el pais a borrar: ");
        String pais = leer.nextLine().toLowerCase();
        boolean auxV = true;
        Iterator<String> it = Paises.iterator();
        
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(pais)) {
                System.out.println("Se encontró el pais, procedo a borrarlo");
                auxV = true;
                it.remove();
                mostrarPais();
            }else{
                auxV = false;
               
            }
            
           
        }
         if (!auxV) {
                System.out.println("No se encontró el pais");
            }
        
    }
    

}