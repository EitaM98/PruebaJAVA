//Se desea guardar los sueldos de 5 operarios.

package Clase5;

import java.util.Scanner;

/**
 *
 * @author matic
 */
public class Sueldo {
    private Scanner teclado;
    private int [] sueldos;
    
    public void cargarsueldo () {
        teclado = new Scanner (System.in);
        sueldos = new int [5];
        for (int i = 0; i<5 ;i = i+1) {
            System.out.println("Ingrese el valor del sueldo");
            sueldos[i]=teclado.nextInt();    
        }
    }
    
    public void imprimir () {
        for(int i = 0; i<5; i = i+1) {
            System.out.println("Los sueldos ingresados fueron  $"+sueldos[i]);
        }
    }
}