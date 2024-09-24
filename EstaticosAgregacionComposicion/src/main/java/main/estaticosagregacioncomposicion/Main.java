/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.estaticosagregacioncomposicion;

import java.lang.Math;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        // miembros estáticos
        
        //System.out.println("el valor de PI es " + Math.PI);
        //System.out.println("el valor absoluto de -5.2 es " + Math.abs(-5.2f));
        
        // relacion de agregacion
        Jaula j1 = new Jaula(10, 10, "acero");
        Animal animal1 = new Animal("Pepe", 0, 10);
        Animal animal2 = new Animal("Pepa", 0, 20);
        
        System.out.println("j1 "+ j1);
        
        j1.AgregarAnimal(animal1);
        j1.AgregarAnimal(animal2);
        
        System.out.println("j1 "+ j1);
        
        Nevera n1 = new Nevera("Nevera1","MABE");
        Alimento a1 = new Alimento("Manzana", "Fruta");
        Alimento a2 = new Alimento("Lechuga", "Verdura");
        
        n1.AgregarAlimento(a1);
        n1.AgregarAlimento(a2);
        System.out.println("n1 "+ n1);
        
        // Relacion de composicion
        Terreno t1 = new Terreno(50, 50, "arena");
        System.out.println("t1 "+ t1);
    }
}
