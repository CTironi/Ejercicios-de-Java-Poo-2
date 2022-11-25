package com.sofka.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        int cant, num, mayor = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero de trabajadores: ");
        cant = entrada.nextInt();

        for (int i = 1; i <= cant; i++) {
            System.out.print("Ingrese el sueldo: ");
            num = entrada.nextInt();

            if (num > mayor)
                mayor = num;
        }
        System.out.println("Trabajador con mayor sueldo: " + mayor );
    }
}
