/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

import java.util.Scanner;

/**
 *
 * @author matic
 */
public class CondicionesCompuestasconOperadoresLógicosEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa en el cual: dada una lista de tres valores numéricos
        // distintos se calcule e informe su rango de variación (debe mostrar el mayor 
        // y el menor de ellos)
        Scanner teclado=new Scanner(System.in);
        int Num1, Num2, Num3 ;
        System.out.println("Ingrese primer valor");
        Num1 = teclado.nextInt();
        System.out.println("Ingrese segundo valor");
        Num2 = teclado.nextInt();
        System.out.println("Ingrese tercer valor");
        Num3 = teclado.nextInt();
        if (Num1 > Num2 && Num1 > Num3 && Num2 > Num3){
            System.out.println(+Num1 + " es el mayor");
            System.out.println(+Num3 +" es el menor");
        } else {
            if (Num1 > Num2 && Num1 > Num3 && Num2 < Num3) {
              System.out.println(+Num1 + " es el mayor");
              System.out.println(+Num2 +" es el menor");  
            } else {
                if (Num2 > Num1 && Num2 > Num3 && Num1 > Num3) {
                    System.out.println(+Num2 + " es el mayor");
                    System.out.println(+Num3 +" es el menor");
                } else {
                    if (Num2 > Num1 && Num2 > Num3 && Num1 < Num3) {
                        System.out.println(+Num2 + " es el mayor");
                        System.out.println(+Num1 +" es el menor");
                    } else {
                        if (Num3 > Num1 && Num3 > Num2 && Num1 < Num2) {
                            System.out.println(+Num3 + " es el mayor");
                            System.out.println(+Num1 +" es el menor");
                        } else {
                            if (Num3 > Num1 && Num3 > Num2 && Num1 > Num2) {
                                System.out.println(+Num3 + " es el mayor");
                                System.out.println(+Num2 +" es el menor");
                            }
                        }
                    }
                }
            }
        }
    }
}
