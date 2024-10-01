/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author User
 */
public class Pez extends Animal {
    
    protected boolean tieneEscamas;

    public Pez(boolean tieneEscamas, String nombre, int id) {
        super(nombre, id);
        this.tieneEscamas = tieneEscamas;
    }
    
    @Override
    public void comer(){
        System.out.println("el pez "+this.nombre+" está comiendo");
    }
    
    @Override
    public String toString() {
        return "Pez "+id+"{" +nombre  +" tieneEscamas=" + tieneEscamas + '}';
    }
    
    
    
}
