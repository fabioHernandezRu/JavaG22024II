/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase2j1;

/**
 *
 * @author User
 */
public class main {

    public static void main(String[] args) {

        int numero;

        numero = 10;
        if (numero < 11) {
            System.out.println("el número es menor a 11");
            if (numero > 5) {
                System.out.println("el numero es mayor a 5");
            }
            System.out.println("sigo en el if true");
        } else {
            System.out.println("el numero no es menor a 11");
        }
        int contador;

        contador = 1;
        while (contador < 6) {
            System.out.println(contador);
            contador = contador + 1;
        }
        System.out.println("finaliza el programa");
    }

}
