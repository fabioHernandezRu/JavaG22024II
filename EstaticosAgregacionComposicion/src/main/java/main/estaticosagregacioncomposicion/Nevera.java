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
public class Nevera {
    String nombre;
    String marca;
    ArrayList<Alimento> alimentos;

    public Nevera(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
        alimentos = new ArrayList<>();
    }
    
    public void AgregarAlimento(Alimento alimento){
        alimentos.add(alimento);
    }

    @Override
    public String toString() {
        return "Nevera{" + "nombre=" + nombre + ", marca=" + marca + ", alimentos=" + alimentos + '}';
    }
    
}
