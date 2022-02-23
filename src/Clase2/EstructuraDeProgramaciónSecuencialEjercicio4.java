/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

import java.util.Scanner;

/**
 *
 * @author matic
 */
public class EstructuraDeProgramaciónSecuencialEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se debe desarrollar un programa que pida el ingreso del precio de un artículo 
        // y la cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese precio del articulo");
        float Precioarticulo;
        Precioarticulo = teclado.nextFloat();
        System.out.println("Ingrese cantidad");
        int Cantidad;
        Cantidad = teclado.nextInt();
        float Total;
        Total = Precioarticulo * Cantidad;
        System.out.println("El total a abonar es " +Total);
    }
}
