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
public class EstructuraDeProgramaciónSecuencialEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio.
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        int Num1;
        Num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor");
        int Num2;
        Num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer valor");
        int Num3;
        Num3 = teclado.nextInt();
        System.out.println("Ingrese el cuarto valor");
        int Num4;
        Num4 = teclado.nextInt();
        int suma;
        suma = Num1 + Num2 + Num3 + Num4;
        int promedio;
        promedio = (Num1 + Num2 + Num3 + Num4) / 4;
        System.out.println("La suma de los cuatro valores ingresados es " +suma);
        System.out.println("El promedio de los cuatro valores ingresados es " +promedio);   
    }  
}
