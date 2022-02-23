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
public class DoWhileEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que acumule (sume) valores ingresados por teclado
        //hasta ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
        //Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.
        Scanner teclado=new Scanner(System.in);
        int num, suma;
        suma=0;
        do {
            System.out.println("Ingrese un valor");
            num=teclado.nextInt();
            if (num !=9999)
                suma = suma + num;
        } while(num != 9999);
        System.out.println("El valor acumulado es: " +suma);
        if (suma > 0) {
            System.out.println("El valor es mayor a cero");
        } else {
            if (suma < 0) {
                System.out.println("El valor es menor a cero");
            } else {
                System.out.println("El valor es cero");
            }
        }
    }
}
