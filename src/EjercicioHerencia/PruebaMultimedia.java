/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioHerencia;

import java.util.Scanner;


public class PruebaMultimedia {

    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        System.out.println("Ingrese genero: ");
        String genero = teclado.nextLine();
        System.out.println("Ingrese autor: ");
        String autor = teclado.nextLine(); 
        System.out.println("Ingrese titulo: ");
        String titulo = teclado.nextLine();
        System.out.println("Ingrese formato: ");
        String formato = teclado.nextLine();
        System.out.println("Ingrese duracion: ");
        Float duracion = teclado.nextFloat();
        
        Disco disk = new Disco(genero,autor,titulo,formato,duracion);
        disk.imprimir();
    }
}