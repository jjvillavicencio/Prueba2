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
public class Estudiante implements Persona {
    private String nombre = "Estudiante";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void Ocupacion (){
        System.out.println(nombre +" esta aprendiendo");
    }  
   
    
}
