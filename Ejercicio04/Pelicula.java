/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author nacho
 */
public class Pelicula {
    /**
     * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
     */
    
    private String titulo;
    private String directorPelicula;
    private double duracionPelicula;

    public Pelicula() {
    }

    public Pelicula(String titulo, String directorPelicula, double duracionPelicula) {
        this.titulo = titulo;
        this.directorPelicula = directorPelicula;
        this.duracionPelicula = duracionPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirectorPelicula() {
        return directorPelicula;
    }

    public void setDirectorPelicula(String directorPelicula) {
        this.directorPelicula = directorPelicula;
    }

    public double getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(double duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula:{" + "titulo=" + titulo + ", directorPelicula=" + directorPelicula + ", duracionPelicula=" + duracionPelicula + '}';
    }
    
    
}
