/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase3j2;

/**
 *
 * @author User
 */
public class main {
    
    public static void main(String[] args) {
        System.out.println("creando objeto de la clase persona");
        Persona michaelRuiz = new Persona(); 
        michaelRuiz.nombre = "Michaelasdfasdfasd";
        michaelRuiz.presentarse();
        System.out.println("El objeto tiene por nombre "+ michaelRuiz.nombre);
        System.out.println("fin del programa");
        
        
        Calculadora calc1 = new Calculadora();        
        calc1.pedirNumeros();
        calc1.realizarOperaciones();
        calc1.mostrarResultados();
    }
    
}
