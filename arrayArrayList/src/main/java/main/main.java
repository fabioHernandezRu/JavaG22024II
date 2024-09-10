/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        String nombreAlumnos[] = {"Mateo", "Marcos", "Lucas", "Juan"}; 
        System.out.println("el arreglo nombreAlumnos tiene longitud " + nombreAlumnos.length);
        
        for(int i = 0; i<nombreAlumnos.length; i++){
            System.out.println("alumno["+i+"]"+"="+nombreAlumnos[i]);
        }
        
        String nombreAlumnos2[]= new String[10];
        System.out.println("el arreglo nombreAlumnos2 tiene longitud " + nombreAlumnos2.length);
        for(int i = 0; i<nombreAlumnos.length; i++){
             nombreAlumnos2[i] = nombreAlumnos[i];
        }
        
        nombreAlumnos[1] = "alskjdflñasjdflña";
        
        for(int i = 0; i<nombreAlumnos2.length; i++){
            System.out.println("alumno["+i+"]"+"="+nombreAlumnos2[i]);
        }*/

 /*
        ArrayList<String> nombreAlumnos = new ArrayList<>(); //creo un arrayList de capacidad 10
        System.out.println("capacidad inicial de nombreAlumnos ");
        for(int i=0; i<4; i++){
            System.out.println("Ingrese el nombre "+ (i+1));
            String nombre = scanner.nextLine();
            nombreAlumnos.add(nombre);
        }        
        System.out.println("Contenido de nombre Alumnos "+ nombreAlumnos);
         */
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el nombre " + (i + 1));
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el nombre " + (i + 1));
            String email = scanner.nextLine();
            estudiantes.add(new Estudiante(i, nombre, email));
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(estudiantes.get(i));
        }
        
        ArrayList<Estudiante> estudiantes2 = new ArrayList<>(estudiantes);
        estudiantes.get(1).setNombre("asdfasdfasdf"); //shallow copy!
        for (int i = 0; i < 4; i++) {
            System.out.println(estudiantes2.get(i));
        }
        

    }
}
