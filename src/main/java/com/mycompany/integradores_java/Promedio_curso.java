
package com.mycompany.integradores_java;

import java.util.Scanner;

public class Promedio_curso {
    public static void main(String[] args){
        double matriz [][] = new double [4][4];
        Scanner teclado = new Scanner (System.in);
        double suma = 0.0;
        
        // For para cargar
        for( int fila = 0; fila < 4; fila++ ){
            for( int columna = 0; columna < 3; columna++ ){
                System.out.println("Ingrese el alumno numero: " + fila );
                matriz[fila][columna] = teclado.nextDouble();
                suma += matriz[fila][columna];
            }
            matriz[fila][3] = suma / 3;
            suma = 0.0;
        }
        
        // For para recorrer
        for (int fila = 0; fila < 4; fila++) {
            System.out.println("Las notas del alumno: " + " " + fila + "son: ");
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("Nota numero : " + " " + matriz[fila][columna]);
            }
            System.out.println("El promedio de las notas es: " +  matriz[fila][3]);
        }
    }

}