
package com.mycompany.integradores_java;

import java.util.Scanner;




public class Matrices {
    public static void main (String[] args){
        // Declaracion 
        int matriz [][] = new int [3][3];
        
        // Asignacion Manual
        
        matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[0][2] = 2;
        matriz[1][0] =78;
        matriz[1][1] = 5677;
        matriz[1][2] = 6666;
        matriz[2][0] = 53;
        matriz[2][1] = 7;
        matriz[2][2] = 24;
        
        // Recorrido
        
        for( int i = 0; i < 3; i++){
            for( int j = 0; j < 3; j++){
                System.out.println("El valor de la fila es: " + i + " y la columna es: " + j);
                System.out.println("El valor es de: " + matriz[i][j]);
            }
        }
        
        // Declaracion y carga por consola
        
        int matriz2 [][] = new int [3][3];
        
        Scanner teclado = new Scanner (System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de  de la fila : " + i + " y la columna es: " + j);
                matriz2[i][j] = teclado.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("El valor de la fila es: " + i + " y la columna es: " + j);
                System.out.println("El valor es de: " + matriz2[i][j]);
            }
        }
    }

}