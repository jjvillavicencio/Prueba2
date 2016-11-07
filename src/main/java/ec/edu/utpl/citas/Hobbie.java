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
public abstract class Hobbie extends Persona{
    
    protected Persona chicaHobie; 
    private String hobie;

    public Hobbie(Persona chicaHobie, String hobie) {
        this.chicaHobie = chicaHobie;
        this.hobie = hobie;
    }
    
    
    public String Descripcion() {
        return chicaHobie.Descripcion()+ "\n hobbie: " + hobie;
    }
}
