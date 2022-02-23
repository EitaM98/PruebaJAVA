//Confeccionar una clase que permita ingresar valores enteros por 
//teclado y nos muestre la tabla de multiplicar de dicho valor. 
//Finalizar el programa al ingresar el -1
package Clase4;

import java.util.Scanner;

/**
 *
 * @author matic
 */
public class TablaMultiplicar {
    public void valor () {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un valor: ");
        int Valor = teclado.nextInt();
        while (Valor != -1) {
            calcular(Valor);
            
            System.out.println("Ingrese un valor: ");
            Valor = teclado.nextInt();
        }
    }
    
    public void calcular (int V) {
        System.out.println("Tabla de multiplicar del "+V);
        for (int i=V;i<=V*10;i=i+V) {
            System.out.println(i);
        }
    }
}