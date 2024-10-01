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
public class Mojarra extends Pez{

    public Mojarra(int id) {
        super(true, "mojarra "+id, id);
    }
    
    @Override
     public void comer(){
        System.out.println("la mojarra "+this.nombre+" está comiendo");
    }
}
