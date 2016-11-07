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
public class Main {
    public static void main(String[] args) {
        Persona chica1 = new Chica("Daniela", 23, "Ecuatoriana");
        Persona chicahobie1 = new Hobbie(chica1, "Bailar") {
        };
        
        System.out.println(chicahobie1.Descripcion());
    }
}
