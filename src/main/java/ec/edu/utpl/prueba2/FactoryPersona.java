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
public class FactoryPersona {
    public static Persona crearPersona(String tipo){
        if (tipo.equals("Estudiante")) {
            return new Estudiante();
        }
        else {
            return new Profesor();
        }
    }
    
}
