package com.sofka.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int matricula, calificacion, prom = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su matricula: ");
        matricula = entrada.nextInt();

        for(int i = 0; i <= 5; i++){
            System.out.print("Ingrese calificacion " + i + " : ");
            calificacion = entrada.nextInt();
            prom += calificacion;
        }
        if (prom / 5 >= 6){
            System.out.println("El alumno: " + matricula + " Aprobo con un promedio de: " + prom / 5);
        }else {
            System.out.println("El alumno: " + matricula + " No Aprobo, con un promedio de: " + prom / 5);
        }
    }
}
