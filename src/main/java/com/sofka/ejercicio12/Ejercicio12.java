package com.sofka.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    static int p1, p2, p3, p4, p5, v1, v2, v3, v4, v5, t1, t2, t3, t4, t5;
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el valor de los boletos\n");
        System.out.print("Boleto 1: ");
        p1 = entrada.nextInt();
        System.out.print("Boleto  2: ");
        p2 = entrada.nextInt();
        System.out.print("Boleto  3: ");
        p3 = entrada.nextInt();
        System.out.print("Boleto  4: ");
        p4 = entrada.nextInt();
        System.out.print("Boleto  5: ");
        p5 = entrada.nextInt();

        menu();

    }

    static void menu() {


        System.out.println("Que boleto desea comprar " +
                "\n1: Boleto  de " + p1 +
                "\n2: Boleto  de " + p2 +
                "\n3: Boleto  de " + p3 +
                "\n4: Boleto  de " + p4 +
                "\n5: Boleto  de " + p5 +
                "\n6: TOTAL ");

        int opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                v1 += 1;
                t1 = v1 * p1;
                menu();
                break;
            case 2:
                v2 += 1;
                t2 = v2 * p2;
                menu();

                break;
            case 3:
                v3 += 1;
                t3 = v3 * p3;
                menu();
                break;
            case 4:
                v4 += 1;
                t4 = v4 * p4;
                menu();

                break;
            case 5:
                v5 += 1;
                t5 = v5 * p5;
                menu();

                break;
            case 6:
                System.out.println("Los boletos de " + p1 + " se vendieron " + v1 +
                        "\nLos boletos de " + p2 + " se vendieron " + v2 +
                        "\nLos boletos de " + p3 + " se vendieron " + v3 +
                        "\nLos boletos de " + p4 + " se vendieron " + v4 +
                        "\nLos boletos de " + p5 + " se vendieron " + v5 +
                        "\nEl total de boleto vendidos fue de : $" + (t1 + t2 + t3 + t4 + t5));
                break;
            default:

                System.out.println("Entrada invalida");
                menu();
                break;
        }
    }
}
