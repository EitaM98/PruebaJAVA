/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3;

import java.util.Scanner;

/**
 *
 * @author matic
 */
public class ForEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
        //a)La cantidad de valores ingresados negativos.
        //b)La cantidad de valores ingresados positivos.
        //c)La cantidad de múltiplos de 15.
        //d)El valor acumulado de los números ingresados que son pares.
        Scanner teclado=new Scanner(System.in);
        int f, num, positivo, negativo, par, multiplo;
        positivo=0;
        negativo=0;
        multiplo=0;
        par=0;
        for(f=1;f<=10;f++) {
            System.out.println("Ingrese un valor entero");
            num=teclado.nextInt();
            if (num > 0) {
                positivo = positivo + 1;
            } else {
                negativo = negativo + 1;
            }
            if (num%2==0) {
                par = par + 1;
            }
            if (num%15==0) {
                multiplo = multiplo + 1;
            }
        }        
        System.out.println("La cantidad de valores negativos son: " +negativo);
        System.out.println("La cantidad de valores positivos son: " +positivo);
        System.out.println("La cantidad de numeros multiplos de 15 son " +multiplo);
        System.out.println("La cantidad de numeros pares son " +par);
    }
    
}
