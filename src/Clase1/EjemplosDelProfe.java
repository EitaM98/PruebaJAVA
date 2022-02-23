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
public class EjemplosDelProfe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calcular el sueldo mensual de un operario conociendo la cantidad de horas trabajadas y el pago por hora
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese Horas Trabajadas");
        int horasTrabajadas;
        horasTrabajadas = teclado.nextInt();
        System.out.println("Ingrese Pago por Hora");
        float pagoHora;
        pagoHora = teclado.nextFloat();
        float Sueldo;
        Sueldo = horasTrabajadas * pagoHora;
        System.out.println("Total del sueldo mensual:" +Sueldo);
      
    }
    
}
