/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pooconstrgetset;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        
        final String NOMBRE_PROGRAMA = "Programa para explicar constructores, getters y setters";        
        System.out.println(NOMBRE_PROGRAMA);
        
     
        
        System.out.println("creando objeto jose");
        Persona jose = new Persona(); 
        System.out.println("objeto jose ya esta construido");
        jose.presentarse();
        
        System.out.println("creando objeto Juan");        
        Persona juan = new Persona("Juan");
        juan.presentarse();
        
        System.out.println("creando objeto Mateo");
        Persona mateo = new Persona(20);
        mateo.presentarse();
    
        System.out.println("creando objeto Lucas");
        Persona lucas = new Persona("Lucas", 50);
         
        lucas.presentarse();
        
        // una vez tenga los objetos creados
        // como puedo acceder o modificar los valores?
        // si los atributos son privados?
        
        // mutadores o setters para cambiar valor de atributo privado
        // accesores o getters para obtener el valor de un atributo privado
        lucas.setEdad(51);
        System.out.println("la edad de lucas es: "+ lucas.getEdad());
        lucas.presentarse("adios");
    }
}
