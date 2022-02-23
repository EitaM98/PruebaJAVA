//Confeccionar una clase que permita carga el nombre y la edad de una
//persona. Mostrar los datos cargados. Imprimir un mensaje si es mayor
//de edad (edad>=18)
package Clase4;

import java.util.Scanner;


public class Persona {
    private Scanner teclado;
    private String nombre;
    private int edad;
        
    public void inicializar () {
        teclado=new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        nombre=teclado.next();
        System.out.println("Ingrese edad:");
        edad=teclado.nextInt();
    }
    
    public void imprimir () {
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
    public void esMayor () {
        if (edad>=18) {
            System.out.println(nombre+" es mayor de edad");
        } else {
            System.out.println(nombre+" es menor de edad");
        }
    }
}