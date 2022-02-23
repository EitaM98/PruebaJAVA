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
public class EjercicioAdicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declara un string que contenga tu nombre, despues muestra un mensaje de bienvenida por consola
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String Nombre;
        Nombre = teclado.next();
        System.out.println("Bienvenido " +Nombre);
        
    }
    
}
