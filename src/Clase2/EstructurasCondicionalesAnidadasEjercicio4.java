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
public class EstructurasCondicionalesAnidadasEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente 
        // información: cantidad total de preguntas que se le realizaron y la cantidad 
        // de preguntas que contestó correctamente. Se pide confeccionar un programa que 
        // ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje 
        // de respuestas correctas que ha obtenido, y sabiendo que:
	// Nivel máximo:	Porcentaje>=90%.
	// Nivel medio:	        Porcentaje>=75% y <90%.
	// Nivel regular:	Porcentaje>=50% y <75%.
	// Fuera de nivel:	Porcentaje<50%
        Scanner teclado=new Scanner(System.in);
        int totalpreguntas, correctas;
        System.out.println("Ingrese total de preguntas");
        totalpreguntas = teclado.nextInt();
        System.out.println("Ingrese cantidad de preguntas contestadas correctamente");
        correctas = teclado.nextInt();
        int promedio;
        promedio = (correctas * 100) / totalpreguntas;
        if (promedio >= 90) {
            System.out.println("Nivel maximo");
        } else {
            if (promedio >= 75 && promedio < 90) {
                System.out.println("Nivel medio");
            } else {
                if (promedio >= 50 && promedio < 75) {
                    System.out.println("Nivel regular");
                } else {
                    System.out.println("Fuera de nivel");
                }    
            }
        }
    }    
}