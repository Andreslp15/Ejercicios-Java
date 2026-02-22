/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integradores_java;

import java.util.Scanner;

/**
 *En la ciudad obrera de Misiones, se realiza cada año la "Maraton de Inscripciones"
 * en el marco de la Feria Nacional de inmigrantes. El eveno cuenta con un dia de inscripciones
 * un dia anterior a la carrera, por lo que se desconoce la categoria en donde debe ser inscriptos y su cantidad
 * que puede haber. Desde la Federacion manifestaron que necesitarian la siguiente informacion para la 
 * inscripcion de cada participante: dni, nombre y edad. En cuanto a las categorias posibles: 
 * Menores A ( 6 años a 10 años) 
 * Mennores B ( 11 años a 17 años)
 * Juveniles ( 18 años a 30 años)
 * Adultos ( 31 años a 50)
 * Adultos mayores ( Mayores de 50 )
 * 
 * Se necesita un programa que a partir de los datos ingresados , se muestre por pantalla a que categoria 
 * debe ser inscripto. Se sabe que al finalizar el dia de inscriciones de debe ingresar un dni con 0 y un nombre
 * con la palabra fin
 * @author andres-lopez
 */
public class Categoria_Inscripcion {
    public static void main (String[] args){
        // Pedir Informacion
         System.out.println("Ingrese por favor el dni del participante: ");
         Scanner teclado = new Scanner (System.in);
         String dni = teclado.nextLine();
        System.out.println("Ingrese por favor el nombre del participante: ");
        String nombre = teclado.nextLine();
        Scanner teclado2  = new Scanner (System.in);
        System.out.println("Ingrese por favor la edad del participante: ");
        int edad = teclado2.nextInt();
        
        while( !dni.equals("0")  &&  !nombre.equalsIgnoreCase("fin")){
            // Revisamos las categorias:
            if( edad >=6 && edad <= 10 ){
                System.out.println("La categoria es: Menores A");
            }else if( edad > 10 && edad <=17 ){
                System.out.println("La categoria es: Menores B");
            }else if( edad > 17 && edad <= 30 ){
                System.out.println("La categoria es:  Juveniles");
            }else if( edad > 30 && edad <= 50 ){
                System.out.println("La categoria es Adultos");
            }else if( edad > 50 ){
                System.out.println("La categoria es: Adultos Mayores");
            }else if( edad < 6 ){
                    System.out.println("No puede participar!");
            }
            System.out.println("Ingrese por favor el dni del participante: ");
            teclado = new Scanner(System.in);
            dni = teclado.nextLine();
            System.out.println("Ingrese por favor el nombre del participante: ");
            nombre = teclado.nextLine();
            teclado2 = new Scanner(System.in);
            System.out.println("Ingrese por favor la edad del participante: ");
            edad = teclado2.nextInt();
            
        }
        
    }
}
