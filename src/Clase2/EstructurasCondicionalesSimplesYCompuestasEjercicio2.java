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
public class EstructurasCondicionalesSimplesYCompuestasEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se ingresan tres notas de un alumno, si el promedio es mayor o igual 
        // a siete mostrar un mensaje "Promocionado".
        Scanner teclado=new Scanner(System.in);
        int Nota1, Nota2, Nota3, promedio ;
        System.out.println("Ingrese primera nota");
        Nota1 = teclado.nextInt();
        System.out.println("Ingrese segunda nota");
        Nota2 = teclado.nextInt();
        System.out.println("Ingrese terceera nota");
        Nota3 = teclado.nextInt();
        promedio = (Nota1 + Nota2 + Nota3) / 3;
        if (promedio >= 7) {
            System.out.println("Promocionado");
        }
    }                
}
