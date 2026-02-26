/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.integradores_java;

import java.util.Scanner;

/**
 * Escriba un programa que dado un un limite numerico, muestre en pantalla todos los numeros 
 * hasta el limite comenzando desde el numero 1.
 * @author andres-lopez
 */
public class Integradores_Java {

    public static void main(String[] args) {
        // Necesitamos pedirle el limite a ingresar al usuario
        System.out.println("Por favor ingrese el limite que deseas:  ");
        Scanner teclado = new Scanner (System.in);
        int limite = teclado.nextInt();
        
        for( int i = 1; i <= limite; i++){
            System.out.println(i);
        }
        
    }
}
