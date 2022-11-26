package com.sofka.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int total, num, ele, i = 1;

        System.out.print("Numero a elevar: ");
        num = entrada.nextInt();

        System.out.print("Elevar a la: ");
        ele = entrada.nextInt();
        total = num;

        while (i < ele) {
            i += 1;
            total *= num;
        }
        System.out.println("Total: " + total);
    }
}
