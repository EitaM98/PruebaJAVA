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
public class CondicionesCompuestasconOperadoresLógicosEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que pida cargar una fecha cualquiera, luego 
        // verificar si dicha fecha corresponde a Navidad.
        Scanner teclado=new Scanner(System.in);
        int dia, mes;
        System.out.println("Ingrese dia");
        dia = teclado.nextInt();
        System.out.println("Ingrese mes");
        mes = teclado.nextInt();
        if (dia == 24 && mes == 12) {
            System.out.println("Esta fecha es Navidad");
        }
    }
}
