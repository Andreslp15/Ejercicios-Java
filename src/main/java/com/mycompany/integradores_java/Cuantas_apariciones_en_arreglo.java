
package com.mycompany.integradores_java;

import java.util.Scanner;

// Realizar un programa que cargue 15 numeros en un vector y me devuelva cuantas veces 
// realizamos la carga de numero 3


public class Cuantas_apariciones_en_arreglo {
    public static void main (String[] args){
        int vector [] = new int [15];
        
        Scanner teclado = new Scanner (System.in);
        int contador_apariciones = 0;
        
        for( int i = 0; i < vector.length; i++){
            System.out.println("Ingrese los numeros que quieres cargar: ");
            vector[i] = teclado.nextInt();
        }
        
        // Recorro y reviso cuantas apariciones tiene el numero 3
        for( int i = 0; i < vector.length; i++){
            if(vector[i] == 3){
                contador_apariciones++;
            }
        }
        System.out.println("Total de apariciones del numero 3 es: " + contador_apariciones);
    }

}