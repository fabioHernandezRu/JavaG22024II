/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase3j2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Calculadora {

    Scanner scanner = new Scanner(System.in);

    // atributos
    float numero1;
    float numero2;
    float suma;
    float resta;

    // metodos
    void pedirNumeros() {
        System.out.println("Ingrese numero1:");
        numero1 = scanner.nextFloat();
        System.out.println("Ingrese numero2:");
        numero2 = scanner.nextFloat();
    }

    void sumar() {
        suma = numero1 + numero2;
    }

    void restar() {
        resta = numero1 - numero2;
    }
    
    void realizarOperaciones(){
        sumar();
        restar();        
    }
    
    void mostrarResultados(){
        System.out.println("resultados de las operaciones de los numeros " + numero1 + " ,"+ numero2);
        System.out.println("suma= "+ suma);
        System.out.println("resta= "+ resta);
    }
}
