/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import utilidad.UTILIDAD;

/**
 *
 * @author nacho
 */
public class AlumnoServicio {
    //En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//tmoda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    UTILIDAD u1 = new UTILIDAD();

    ArrayList<Alumno> alumnoLista = new ArrayList();

    public void init() {

        int notasAux;

        boolean respuesta = true;

        do {
            Alumno a1 = new Alumno();
            ArrayList<Integer> notas = new ArrayList();
            System.out.println("Ingrese el nombre del alumno: ");
            a1.setNombreAlumno(leer.next());

            System.out.println("Ingrese las 3 notas del alumno: ");

            for (int i = 0; i < 3; i++) {
                notasAux = leer.nextInt();
                notas.add(notasAux);
            }

            a1.setNotas(notas);

            alumnoLista.add(a1);
            respuesta = u1.verificarDato();

        } while (respuesta);

        System.out.println(alumnoLista);

    }

    //Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
    public void notaFinal(Alumno a1) {

        System.out.println("Ingrese el nombre del alumno: ");
        a1.setNombreAlumno(leer.next());
        boolean auxB = true;
        int promedio = 0;

        //Iterator<Alumno> it = alumnoLista.iterator();
        //while(it.hasNext()){
        //Alumno aux = it.next();
        
        System.out.println(a1.getNombreAlumno());

        for (Alumno alumno : alumnoLista) {

            if (a1.getNombreAlumno().equals(a1.getNombreAlumno())) {
                System.out.println("Alumno encontrado");

                for (int notas : alumno.getNotas()) {
                    promedio += notas;

                }
                System.out.println("El promedio del alumno es " + (promedio / 3));

            }

        }
        if (!auxB) {
            System.out.println("El alumno no se encuentra en la lista");

        }
    }

}
