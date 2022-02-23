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
public class EstructurasCondicionalesSimplesYCompuestasEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) 
        // mostrar un mensaje indicando si el número tiene uno o dos dígitos.
        // (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
        Scanner teclado=new Scanner(System.in);
        int Num;
        System.out.println("Ingrese un numero positivo de 1 o 2 digitos");
        Num = teclado.nextInt();
        if (Num<10){
            System.out.println("El numero tiene 1 digito");
        } else {
            System.out.println("El nuemero tiene 2 digitos");
        }    
            
        
    };
                
    
}