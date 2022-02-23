//Desarrollar un programa que cargue los lados de un
//triángulo e implemente los siguientes métodos:
//inicializar los atributos, imprimir el valor del lado
//mayor y otro método que muestre si es equilátero o no.
package Clase4;

import java.util.Scanner;

/**
 *
 * @author matic
 */
public class Triangulo {
    private Scanner teclado;
    private int lado1;
    private int lado2;
    private int lado3;
    
    public void lados () {
        teclado= new Scanner(System.in);
        System.out.println("Ingrese el valor del 1er lado:");
        lado1=teclado.nextInt();
        System.out.println("Ingrese el valor del 2do lado:");
        lado2=teclado.nextInt();
        System.out.println("Ingrese el valor del 3er lado:");
        lado3=teclado.nextInt();
    }
    
    public void mayor () {
        System.out.println("Lado mayor: ");
        if (lado1>lado2 && lado1>lado3) {
            System.out.println(lado1);
        } else {
            if (lado2>lado3) {
                System.out.println(lado2);
            } else {
                System.out.println(lado3);
            }
        }
    }
    
    public void equilatero () {
        if (lado1 + lado2 + lado3 == 180) {
            System.out.println("El triangulo es equilatero");
        } else {
            System.out.println("El triangulo no es equilatero");
        }
    }
}