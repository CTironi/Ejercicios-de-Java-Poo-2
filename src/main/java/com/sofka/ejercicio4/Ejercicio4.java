package com.sofka.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        float sueldo;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el sueldo: ");
        sueldo = entrada.nextInt();

        if (sueldo < 1000){
            System.out.println("Sueldo menor a 1000: " + sueldo * 1.15);
        }else {
            System.out.println("Sueldo mayor a 1000: " + sueldo * 1.12);
        }
    }
}
