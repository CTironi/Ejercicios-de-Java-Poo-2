package com.sofka.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double monto, total = 0;

        System.out.print("Total a pagar: ");
        monto = entrada.nextDouble();

        if (monto <= 500) {
            total = monto;
        }
        else if (monto > 500 & monto <= 1000) {
            total = monto * 0.95;
        }
        else if (monto > 1000 & monto <= 7000) {
            total = monto * 0.89;
        }
        else if (monto > 7000 & monto <= 15000) {
            total = monto * 0.82;
        }
        else if (monto > 15000) {
            total = monto * 0.75;
        }
        System.out.println("Total a pagar con descuento: " + total);
    }
}
