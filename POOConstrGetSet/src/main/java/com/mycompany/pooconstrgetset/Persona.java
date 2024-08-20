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
public class Persona {

    final private String nombre; // si los atributos son privados, solo se asignan valor con metodos de la clase
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public Persona() {
        this.nombre = "";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(int edad) {
        this.edad = edad;
        this.nombre = "";
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void presentarse() {
        System.out.println("Mi nombre es:" + nombre + " tengo " + edad);
    }
    
    void presentarse(String adicion){
        System.out.println("Mi nombre es:" + nombre + " tengo " + edad);
        System.out.println(adicion);
    }
}
