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
public class Animal {
    String nombre;
    int id;

    public Animal(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public void respirar(){
        System.out.println("el animal "+this.nombre+" está respirando");
    }
        
    public void comer(){
        System.out.println("el animal "+this.nombre+" está comiendo");
    }
    
    
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", id=" + id + '}';
    }
    
    
}
