package com.sofka.ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int total, num, ele;

        System.out.print("Numero a elevar: ");
        num = entrada.nextInt();

        System.out.print("Elevar a la: ");
        ele = entrada.nextInt();
        total = num;

        for (int i = 2; i <= ele; i++) {
            total *= num;
        }
        System.out.println("Total: " + total);
    }
}
