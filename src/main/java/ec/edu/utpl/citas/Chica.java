/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.citas;

/**
 *
 * @author SALAS
 */
public class Chica extends Persona{
    private String nombre;
    private int edad;
    private String nacionalidad;
    
    @Override
    public String Descripcion() {
        return "Nombre: "+nombre+"\n Edad: "+ edad + "\n Nacionalidad: "+ nacionalidad;
    }

    public Chica(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
}
