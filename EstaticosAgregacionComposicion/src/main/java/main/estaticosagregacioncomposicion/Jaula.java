/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.estaticosagregacioncomposicion;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Jaula {
    float alto;
    float ancho;
    String material;
    ArrayList<Animal> animales;

    public Jaula(float alto, float ancho, String material) {
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        animales = new ArrayList<>();
    }
    
    public void AgregarAnimal(Animal animal){
        animales.add(animal);
    }

    @Override
    public String toString() {
        return "Jaula{" + "alto=" + alto + ", ancho=" + ancho + ", material=" + material + ", animales=" + animales + '}';
    }
    
    
    
    
}
