/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebasclasesjava;

import java.util.Scanner;

/**
 *
 * @author neo_0
 */
public class PruebasClasesJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Ingrese un numero: ");
        int next = sc.nextInt();
        System.out.println(next);
        
        
        for (int num1 =0; num1<10; num1++){
            System.out.println("buenas");
        }
        
        
        //System.out.println("Ingrese un numero: ");
        //int next = sc.nextInt();
        //System.out.println(next);
        */
        int destornillador = 10;
        boolean control = true;
        int input = 0;
        int input2 = 0;
        
        while (control) {
            input2 = 0;
            input = 0;
            
            System.out.println("""
                               Que desea hacer? 
                               (1)Pedir herramienta
                               (2)Dejar herramienta""");
            input = sc.nextInt();
            
            switch (input) {
                case 1 -> {
                    if (destornillador > 0){
                        System.out.println("Quedan " + destornillador + " destornilladores");
                        System.out.println("¿Cuantos quiere retirar?");
                        input2 = sc.nextInt();
                        
                        if (input2 > destornillador){
                            
                            System.out.println("No quedan suficientes destornilladores");
                            
                        } else {
                            
                            destornillador = destornillador - input2;
                            
                            System.out.println("Ahora quedan " + destornillador + " herramientas");
                            
                            control=false;
                            
                        }
                    } else {
                        
                        System.out.println("No quedan destornilladores");
                        
                    }
                }
                    
                case 2 -> {
                    System.out.println("¿Cuantas herramientas devolvera?");
                    input2 = sc.nextInt();
                    System.out.println("Esperamos que vuelva!");
                    destornillador = destornillador + input2;
                    
                    control=false;
                }
                    
                default -> {
                    System.out.println("No ingreso una opcion registrada");
                    throw new AssertionError();
                }
                    
            }
            
        }
    }
}
