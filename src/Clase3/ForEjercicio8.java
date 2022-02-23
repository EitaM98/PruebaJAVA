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
public class ForEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se cuenta con la siguiente información:
        //Las edades de 50 estudiantes del turno mañana.
        //Las edades de 60 estudiantes del turno tarde.
        //Las edades de 110 estudiantes del turno noche.
        //Las edades de cada estudiante deben ingresarse por teclado.
        //a) Obtener el promedio de las edades de cada turno (tres promedios)
        //b) Imprimir dichos promedios (promedio de cada turno)
        //c) Mostrar por pantalla un mensaje que indique cual de los tres turnos tiene un promedio de edades mayor.
        Scanner teclado=new Scanner(System.in);
        int f, m, t, n, suma1, suma2, suma3, promedio1, promedio2, promedio3;
        suma1=0;
        for(f=1;f<=50;f++)  {
          System.out.println("Ingrese edad de estudiante del turno mañana");
            m=teclado.nextInt();
            suma1 = suma1 + m;
        }
        suma2=0;
        for(f=1;f<=60;f++)  {
            System.out.println("Ingrese edad de estudiante del turno tarde");
            t=teclado.nextInt();
            suma2 = suma2 + t;
        }
        suma3=0;
        for(f=1;f<=110;f++) {
            System.out.println("Ingrese edad de estudiante del turno noche");
            n=teclado.nextInt();
            suma3 = suma3 + n;
        }
        promedio1 = suma1 / 50;
        System.out.println("El promedio de edad del turno mañana es de: " +promedio1);
        promedio2 = suma2 / 60;
        System.out.println("El promedio de edad del turno tarde es de: " +promedio2);
        promedio3 = suma3 / 110;
        System.out.println("El promedio de edad del turno noche es de: " +promedio3);
        if (promedio1 > promedio2 && promedio1 > promedio3) {
            System.out.println("El turno mañana tiene el mayor promedio de edad");
        } else {
            if (promedio2 > promedio3) {
                System.out.println("El turno tarde tiene el mayor promedio de edad");
            } else {
                System.out.println("El turno noche tiene el mayor promedio de edad");
            }
        }
          
        
          
    }
    
}
