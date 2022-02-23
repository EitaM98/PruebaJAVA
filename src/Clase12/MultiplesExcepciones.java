//Declarar un vector de 10 elementos enteros. Permitir que el usuario ingrese un
//subíndice del vector y nos muestre el contenido de dicha componente. Atrapar 
//las excepciones de fuera de rango del vector y si ingresa un valor no entero.
package Clase12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplesExcepciones {
    
    public static void main(String[] args) {
        int[] vec = { 20, 45, 76, 81, 34, 567, 423, 6, 3, 5 };
        Scanner teclado = new Scanner(System.in);
        int indice;
        boolean continua = false;
        do{
            try{
                System.out.println("Ingrese un valor entre 0 y 9: ");
                indice = teclado.nextInt();
                System.out.println("En el vector se almacena en la posicion " +indice +" el valor " +vec[indice]);
            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente numero entero");
                teclado.next();
                continua = true;
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("El valor debe estar entre 0 y 9");
                teclado.next();
                continua = true;
            }
        }while(continua);
    }
}