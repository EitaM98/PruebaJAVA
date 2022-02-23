/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioHerencia;

import java.util.Scanner;
public class Empleado extends Persona {
        protected float sueldo;

        
    public void cargarSueldo() {
        System.out.println("Ingrese el sueldo: ");
        sueldo = teclado.nextFloat();
    }
    
    public void imprimirSueldo() {
        System.out.println("El sueldo es: "+sueldo);
    }
}