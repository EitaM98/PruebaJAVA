//Definir un vector de 5 componentes de tipo float que 
//representen las alturas de 5 personas. Obtener el 
//promedio de las mismas. Contar cuántas personas son 
//más altas que el promedio y cuántas más bajas.

package Clase5;

import java.util.Scanner;

/**
 *
 * @author matic
 */
public class Altura {
    private Scanner teclado;
    private float [] alturas;
    private float promedio;
    
    public void cargaralturas () {
        teclado = new Scanner(System.in);
        alturas = new float[5];
        for(int i=0; i<5 ; i = i+1) {
            System.out.println("Ingresa una altura");
            alturas[i] = teclado.nextFloat();
            
        }
    }
    
    public void promedio () {
        float suma;
        suma = 0;
        for (int i=0; i<5 ; i = i+1) {
            suma=suma+alturas[i];
        }
        promedio=suma/5;
        System.out.println("Promedio de alturas: "+promedio);
    }
    
    public void mayormenor () {
        int may, men;
        may=0;
        men=0;
        for (int i=0; i<5 ; i = i+1) {
            if(alturas[i]>promedio) {
                may=may+1;
            } else {
                men=men+1;
            }
        }
        System.out.println("La cantidad de personas arriba del promedio es de: "+may);
        System.out.println("La cantidad de personas abajo del promedio es de: "+men);
    }
}
