/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.prueba2;

/**
 *
 * @author SALAS
 */
public class Escuela {
    private String nombre;
    private static Escuela escuela;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Escuela(String nombre) {
        this.nombre = nombre;
        System.out.println("El nombre de la escuela es: " + this.nombre);
    }

    public static Escuela getSingletonInstance(String nombre) {
        if (escuela == null){
            escuela = new Escuela(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre);
        }
        return escuela;
    }

    public String getNombre() {
        return nombre;
    }
    
}
