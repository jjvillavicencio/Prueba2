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
public class main {
    public static void main(String[] args) {
        Escuela priescuela = Escuela.getSingletonInstance("Escuela1");
        System.out.println(priescuela.getNombre()); 
        
        
        Persona clases[] = new Persona[11];
        
        for (int i=0; i< clases.length; i++){
            if (i == 0){
                clases[i] = FactoryPersona.crearPersona("Profesor");
            }else{
                clases[i] = FactoryPersona.crearPersona("Estudiante");
            }
        }
        
        for (Persona clase : clases) {
            clase.Ocupacion();
        }
        
        
    }
    
}
