//Realizar la carga de un número entero por teclado e imprimir su cubo.

package Clase12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CuboNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        boolean continua;
        do{
            try{
                continua = false;
                System.out.println("Ingrese un valor entero: ");
                num = teclado.nextInt();
                int cubo = num*num*num;
                System.out.println("El cubo de " +num +" es " +cubo);
            }catch (InputMismatchException ex) {
                System.out.println("Debe ingresar un valor entero obligatoriamente");
                teclado.next();
                continua = true;               
            }
        } while (continua);
    }  
}