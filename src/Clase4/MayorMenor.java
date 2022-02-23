//Confeccionar una clase que permita ingresar tres valores por teclado.
//Luego mostrar el mayor y el menor.

package Clase4;

import java.util.Scanner;

/**
 *
 * @author matic
 */
public class MayorMenor {
    public void cargarvalores() {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2, valor3;
        System.out.println("Ingrese el primer valor: ");
        valor1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        valor2 = teclado.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        valor3 = teclado.nextInt();
        int mayor, menor;
        mayor = calcularmayor(valor1,valor2,valor3);
        menor = calcularmenor(valor1,valor2,valor3);
        System.out.println("El mayor numero ingresado es: "+mayor);
        System.out.println("El menor numero ingresado es: "+menor);
    }
    
    public int calcularmayor (int v1, int v2, int v3) {
        int m;
        if(v1 > v2 && v1 > v3) {
            m = v1;
        } else {
            if (v2 > v3) {
                m = v2;
            } else {
                m = v3;
            }
        }
        return m;
    }
    
    public int calcularmenor (int v1, int v2, int v3) {
        int men;
        if (v1<v2 && v1<v3) {
            men = v1;
        } else {
            if (v2<v3) {
                men = v2;
            } else {
                men = v3;
            }
        }
        return men;
    }
}