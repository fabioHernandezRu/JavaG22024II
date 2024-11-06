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
public class LinkedList {
 
    Nodo head;

    public LinkedList() {
    }
    
    public void agregarAlFinal(int valor){
        Nodo NodoAAgregar = new Nodo(valor);
        if (head == null){
            head = NodoAAgregar;
            head.siguiente = null;
        }else{
            Nodo nodoActual = head;
            while(nodoActual.siguiente != null){
                nodoActual = nodoActual.siguiente;
            }
           nodoActual.siguiente = NodoAAgregar;     
        }        
    }
    
    public void mostrarLista(){
         Nodo nodoActual = head;
        while(nodoActual != null){
            System.out.println(nodoActual.valor);
            nodoActual = nodoActual.siguiente;
        }
    }
}
