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
public class EstructurasCondicionalesAnidadasEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Confeccionar un programa que permita cargar un número entero positivo
        // de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. 
        // Mostrar un mensaje de error si el número de cifras es mayor.
        Scanner teclado=new Scanner(System.in);
        int Num;
        System.out.println("Ingrese un numero entero");
        Num = teclado.nextInt();
        if (Num < 10) {
            System.out.println("El numero tiene una cifra");
        } else {
            if (Num <100) {
                System.out.println("El numero tiene dos cifras");
            } else {
                if (Num < 1000) {
                    System.out.println("El numero tiene tres cifras");
                } else {
                    System.out.println("Error");
                }
            }
        }
    }
}