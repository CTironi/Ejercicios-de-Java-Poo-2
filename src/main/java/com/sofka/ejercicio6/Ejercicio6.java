package com.sofka.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
