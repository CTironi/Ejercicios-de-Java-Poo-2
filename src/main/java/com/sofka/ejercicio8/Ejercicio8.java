package com.sofka.ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        int trabajadores, sueldo;
        double nomina = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cuantos trabajadores cobran: ");
        trabajadores = entrada.nextInt();

        /*creamos una variable trabajadores para que el usuario pueda de esta forma
        indicar cual sera el tamaño de nuestro array, y de una manera mas elegante el
        programa saber cuantos sueldos debe pedirle al usuario antes de ejecutar las operaciones*/


        double nsueldo[] = new double[trabajadores];

        for (int i = 0; i < trabajadores; i++) {
            System.out.print("Ingrese el sueldo " + i + " : ");
            sueldo = entrada.nextInt();
            if (sueldo < 1000) {
                nsueldo[i] = sueldo * 1.15;
            }
            if (sueldo >= 1000) {
                nsueldo[i] = sueldo * 1.12;
            }
            nomina = nomina + nsueldo[i];
        }
        System.out.println("\nLa nomina es: " + nomina + "\n");
        for (int i = 0; i < trabajadores; ++i)
            System.out.println("El sueldo final del trabajador nº " + i + " es: " + nsueldo[i]);
    }
}
