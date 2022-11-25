package com.sofka.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {


        Scanner teclado=new Scanner(System.in);

        int impar=0, par=0, prom=0, residuo;

        /*La letra del ejercicio pedia que se pidieran 270 numeros enteros,
        pero para poder probar q el codigo funciona de forma correcta solo se pide que ingresen 5 numeros*/

        for(int i = 1; i <= 5; ++i){

            System.out.print("Ingrese un numero " + i + ": ");

            int num = teclado.nextInt();

            residuo = num % 2;

            if(residuo == 0){

                prom = prom + num;

                par = par + 1;
            }
            if (residuo != 0)
                impar = impar + num;
        }
        prom = prom / par;

        System.out.println("Promedio de los numeros pares: " + prom +
                "\nSuma de los numeros impares: " + impar);

    }
}


