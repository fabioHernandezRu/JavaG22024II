/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_java.estructurasdedatos;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("test");

        LinkedList lista = new LinkedList();

        lista.agregarAlFinal(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);
        
        lista.mostrarLista();

    }

}
