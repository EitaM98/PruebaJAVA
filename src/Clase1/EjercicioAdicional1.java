/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase1;

import java.util.Scanner;

/**
 *
 * @author matic
 */
public class EjercicioAdicional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declara dos variables numericas (con el valor que desees), muestra por consola la suma, resta, multi, div y modulo(resto de la divison)
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
        float Num1;
        Num1 = teclado.nextFloat();
        System.out.println("Ingrese el segundo numero");
        float Num2;
        Num2 = teclado.nextFloat();
        float suma;
        suma = Num1 + Num2;
        System.out.println("El resultado de la suma es " +suma);
        float resta;
        resta = Num1 - Num2;
        System.out.println("El resultado de la resta es " +resta);
        float multi;
        multi = Num1 * Num2;
        System.out.println("El resultado de la multiplicacion es " +multi);
        float div;
        div = Num1 / Num2;
        System.out.println("El resultado de la division es " +div);
        float mod;
        mod = Num1 % Num2;
        System.out.println("El modulo es " +mod);
        
    }
    
}
