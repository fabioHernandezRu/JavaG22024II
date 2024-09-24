/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.estaticosagregacioncomposicion;

/**
 *
 * @author User
 */
public class Alimento {
    String nombre;
    String tipo;

    public Alimento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Alimento{" + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
}
