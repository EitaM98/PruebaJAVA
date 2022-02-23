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
public class EjercicioAdicional3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lee un numero entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese numero
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un numero entero");
        int NumeroEntero;
        NumeroEntero = teclado.nextInt();
        int Doble;
        Doble = NumeroEntero * 2;
        System.out.println("El doble es " +Doble);
        int Triple;
        Triple = NumeroEntero * 3;
        System.out.println("El triple es " +Triple);
        
    }
    
}
