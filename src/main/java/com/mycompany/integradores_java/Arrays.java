
package com.mycompany.integradores_java;

import java.util.Scanner;




public class Arrays {
    public static void main(String[] args){
        // Declaracion
        int vector [] = new int  [4];
        
        // Asignacion manual
        
        vector[0] = 20;
        vector[1] = 14;
        vector[2] = 333;
        vector[3] = 5555;
        
        // Recorrido
        for( int i = 0; i < 4; i++){
            System.out.println(vector[i]);
        }
        
        // Carga
        int vector2 [] = new int [4];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vector2.length; i++){
            System.out.println("Ingrese el numero a cargar en memoria en el indice: " + i);
            vector2[i] = teclado.nextInt();
        }
    }

}