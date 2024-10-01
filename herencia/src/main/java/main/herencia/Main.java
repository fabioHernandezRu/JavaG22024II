/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.herencia;

import Animal.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {

        //Animal animal1 = new Animal("perla",1);
        //animal1.comer();
        //System.out.println(animal1);
        //Pez pez1 = new Pez(true, "mojarra1", 2);
        //pez1.respirar();
        //pez1.comer();
        //System.out.println(pez1);
        //Mojarra pez2 = new Mojarra(3);
        //pez2.respirar();
        //pez2.comer();
        //System.out.println(pez2);
        //Gato gato1 = new Gato("misifu",4);
        //gato1.comer();
        //gato1.respirar();
        //gato1.maullar();
        //
        Animal gato2 = new Gato("coco", 5);
        Animal animal1 = new Animal("perla", 1);
        Animal pez1 = new Pez(true, "mojarra1", 2);
        Animal pez2 = new Mojarra(3);
        Animal gato1 = new Gato("misifu", 4);

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(gato2);
        animales.add(animal1);
        animales.add(pez1);
        animales.add(pez2);
        animales.add(gato1);
        
        for(int i = 0; i<animales.size(); i++){
            animales.get(i).comer();
        }

    }

}
