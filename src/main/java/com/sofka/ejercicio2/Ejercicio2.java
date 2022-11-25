package com.sofka.ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args){

        int sep = 0;

        for(int i = 0; i < 800;){

            if(sep == 0){   //La variable sep(separador) inicia en 0 y se cumple la condicion,
                i = i + 2;  //entonces la variable 1 se le suma +2 (de 0 pasa a 2),
                sep = 1;    //Se cambia el valor de la variable sep
            }
            else{
                i = i + 3;  //Como no se cumple la condicion de que sep sea = 0 a i se le suman + 3 (de 2 pasa a 5)
                sep = 0;    //Se vuelve a cambiar el valor de sep a 0 y se vuelve a inicial el bucle
            }

            System.out.println(i);
        }
    }
}
