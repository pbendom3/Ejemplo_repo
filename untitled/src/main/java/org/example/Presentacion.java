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

    public void votar() {

        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

        System.out.println("¿Cómo te llamas?: ");
        String nombre = entradaEscaner.next();

        System.out.println("Hola " + nombre + ". Introduce tu edad: ");
        int X = entradaEscaner.nextInt();

        while (X < 0){
            System.out.println("Introduce de nuevo tu edad: ");
            X = entradaEscaner.nextInt();
        }

        //Invocamos un método sobre un objeto Scanner
        int anyos;
        final int edadVoto = 18; //constante que no cambia durante el programa

        if (X >= edadVoto){ //si edad introducida >= 18,
            System.out.println("Enhorabuena " + nombre + ". Puedes votar."); //sacamos este mensaje por pantalla
        }else{ //si la edad < 18
            System.out.println("Lo siento " + nombre + ". No puedes votar."); //sacamos este otro mensaje por pantalla
            anyos = edadVoto - X;
            System.out.println("Te faltan " + anyos + " años para ser mayor de edad.") ; //sacamos este otro mensaje por pantalla
        }

    }

    public void bienvenida(){

        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

        System.out.println("¿Cómo te llamas?: "); //preguntamos el nombre al usuario
        String nombre = entradaEscaner.next(); //el usuario introduce su nombre por teclado

        System.out.println("¿A qué curso vas: "); //preguntamos a qué curso va el usuario
        String curso = entradaEscaner.next(); //el usuario introduce su curso por teclado

        System.out.println("Hola " + nombre + ", bienvenido a " + curso + "."); //saludamos al usuario con un mensaje personalizado con su nombre y curso

        System.out.println("Introduce un número: "); //le pedimos el primer sumando al usuario por teclado
        int num1 = entradaEscaner.nextInt();

        System.out.println("Introduce otro número: "); //pedimos el segundo sumando
        int num2 = entradaEscaner.nextInt();

        int resultado = num1 + num2; //realizamos la operación suma y la guardamos en la variable resultado

        System.out.println("El resultado de sumar los dos números es: " + resultado); //mostramos el resultado de la suma por pantalla

    }


}
