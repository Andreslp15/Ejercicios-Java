package com.mycompany.integradores_java;


import java.util.Scanner;

public class Temperatura_vectores {
    public static void main(String[] args){
        String ciudades [] = new String [5];
        double minima []  = new double[5];
        double maxima []  = new double[5];
        
        Scanner teclado = new Scanner (System.in);
        Scanner teclado2 = new Scanner (System.in);
        
        // Carga los vectores
        for( int i = 0; i < ciudades.length; i++ ){
            System.out.println("Por favor ingrese la ciudad indicada: " + i);
            ciudades[i] = teclado.next();
            
            System.out.println("Por favor ingrese la minima temperatura de la ciudad: " + i);
            minima[i] = teclado2.nextDouble();
            
            System.out.println("Por favor ingrese la temperatura maxima de la ciudad: " + i);
            maxima[i] = teclado2.nextDouble();
        }
        
        double temp_minima = 99999999.9;
        double temp_maxima = -999999999.9;
        int posicion_min = -1;
        int posicion_max = -1;
        
        // Determinamos la temperatura minima y maxima
        for (int i = 0; i < minima.length; i++) {
            if(minima[i] < temp_minima){
                temp_minima = minima[i];
                posicion_min = i;
            }else if(maxima[i] > temp_maxima){
                temp_maxima =maxima[i];
                posicion_max = i;
            }
        }
        
        System.out.println("La temperatura minima es: " + temp_minima + " Se registro en la ciudad de: " + posicion_min);
        System.out.println("La temperatura maxima es: " + temp_maxima + " Se registro en la ciudad de: " + posicion_max);
        
    }
}