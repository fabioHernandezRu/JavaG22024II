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
public class Terreno {
    
    int alto;
    int ancho;
    String material;
    ArrayList<Jaula> jaulas;

    public Terreno(int alto, int ancho, String material) {
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        jaulas = new ArrayList<>();
        Jaula j1 = new Jaula(10, 10, "acero");
        Jaula j2 = new Jaula(10, 10, "Madera");
        jaulas.add(j1);
        jaulas.add(j2);
    }

    @Override
    public String toString() {
        return "Terreno{" + "alto=" + alto + ", ancho=" + ancho + ", material=" + material + ", jaulas=" + jaulas + '}';
    }
    
    
    
}
