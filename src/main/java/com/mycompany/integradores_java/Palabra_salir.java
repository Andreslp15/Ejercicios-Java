/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integradores_java;

import java.util.Scanner;

/**
 * Realice un programa que imprima las palabras ingresadas hasta que se ingrese
 * la palabra salir, todo en minuscula.
 * @author andres-lopez
 */
public class Palabra_salir {
    
    public static void main ( String[] args){
        //Pedirle el usuario que ingrese palabra
        System.out.println("Ingrese palabras o ingrese la palabra salir para abortar:   ");
        Scanner teclado = new Scanner (System.in);
        
        String palabra = teclado.next();
        
        while ( !palabra.equalsIgnoreCase("salir") ){
            System.out.println("La palabra es: " + palabra);
            System.out.println("Ingrese palabras o ingrese la palabra salir para abortar:   ");
            palabra = teclado.next();
        }
    }
    
}
