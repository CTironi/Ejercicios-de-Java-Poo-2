package com.sofka.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        int calificacion, promedio = 0;
        int prom[] = new int[21];
        Scanner entrada = new Scanner(System.in);


        /*Utilizamos un array de 21 espacios ya que en la variable i iniciamos de la posicion
        1 en lugar de la 0, esto nadamas por un motivo estetico a la hora de imprimir en consola
        y dar una informacion mas clara*/

        
        for(int i = 1; i <= 20; i++){
            System.out.print("Ingrese calificacion " + i + " : ");
            calificacion = entrada.nextInt();
            prom[i] += calificacion;
            promedio = promedio + calificacion;
        }
        System.out.println("---------------" +
                "\nEl promedio es: " + promedio / 20 +
                "\n---------------");
        for (int i = 20; i >= 1; i--){
            System.out.println("Calificaciones invertidas " + i + " : " + prom[i]);
        }
    }
}
