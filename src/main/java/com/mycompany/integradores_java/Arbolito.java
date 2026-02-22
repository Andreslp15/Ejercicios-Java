package com.mycompany.integradores_java;

public class Arbolito {
    public static void main(String[] args){
        // Declaramos la altura del arbol
        int altura_arbol = 4;
        
        // Bucle para recorrer las filas (altura)
        for( int fila = 0; fila < altura_arbol; fila++ ){
            // Bucle para los espacios
            for( int espacio = 0; espacio < (altura_arbol -  fila - 1); espacio++){
                System.out.print(" ");
            }
            // Bucle asteriscos
            for( int asterisco = 0; asterisco < (fila * 2) + 1; asterisco++){
                System.out.print("*");
            }
            
            // Salto de Linea
            System.out.println("");
        }
        
        // Tronco 
        int largo_tronco = 1;
        int ancho_tronco = 3; // ancho fijo del tronco
        int espacios_tronco = altura_arbol - 2; // ajustamos para centrar
        
        for( int base = 0; base < largo_tronco; base++){
            // Espacios en blanco
            for( int espacio = 0; espacio < espacios_tronco; espacio++){
                System.out.print(" ");
            }
            
            // Barritas tronco
            for( int tronco = 0; tronco < ancho_tronco; tronco++){
                System.out.print("|");
            }
            System.out.println("");
         }
    }
}

/**
 * Fila asterisco 0 * 2 + 1 = 1
 *                            1 * 2 + 1 = 3
 *                            2 * 2 + 1 = 5
 */

/* (espacio < altura - fila -1)
4 - 0 -1 = 3
4 - 1 - 1 = 2
4 - 2 - 1 = 1
4 - 3 - 1 = 0
*/

//    *
//   ***
//  *****
// *******
//   |||