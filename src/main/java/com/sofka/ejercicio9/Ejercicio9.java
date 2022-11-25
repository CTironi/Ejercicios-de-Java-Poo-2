package com.sofka.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        int cant, num, mayor = 0, menor = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cuantos numeros desea comparar: ");
        cant = entrada.nextInt();

        for (int i = 1; i <= cant; i++) {
            System.out.print("Ingrese un numero: ");
            num = entrada.nextInt();

            if (i == 1) {
                mayor = num;
                menor = num;
            }
            if (num < menor)
                menor = num;
            if (num > mayor)
                mayor = num;
        }
        System.out.println("Numero mayor= " + mayor + "\nNumero menor= " + menor);
    }
}
