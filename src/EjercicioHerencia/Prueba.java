/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioHerencia;

/**
 *
 * @author matic
 */
public class Prueba {

    public static void main(String[] args) {
        Persona persona1=new Persona();
        persona1.cargar();
        Empleado empleado1=new Empleado();
        empleado1.cargar();
        empleado1.cargarSueldo();
        persona1.imprimir();
        empleado1.imprimir();
        empleado1.imprimirSueldo();
    }
}