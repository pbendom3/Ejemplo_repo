package org.example;

import java.util.Scanner;

public class Presentacion {

    public void ejercicio1() {


        System.out.println("Hola, soy Patricia y soy profe de programación");

        System.out.println("¿Qué edad tienes?");

        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        int edad = entradaEscaner.nextInt();

        System.out.println("Tengo " + edad + " años.");


    }


}
