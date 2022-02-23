/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3;

import java.util.Scanner;

/**
 *
 * @author matic
 */
public class DoWhileEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce: número de cuenta y saldo actual. El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.
        //Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
        //a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
        //Estado de la cuenta	'Acreedor' si el saldo es >0.
			      //'Deudor' si el saldo es <0.
			      //'Nulo' si el saldo es =0.
        //b) La suma total de los saldos acreedores.
        Scanner teclado=new Scanner(System.in);
        int num, saldo, acreedor;
        acreedor=0;
        do {
            System.out.println("Ingrese numero de cuenta");
            num=teclado.nextInt();
            if (num >=0) {
                    System.out.println("Ingrese saldo de la cuenta");
                    saldo=teclado.nextInt();
                if (saldo > 0) {
                    System.out.println("Acreedor");
                    acreedor = acreedor + 1;
                } else {
                     if (saldo < 0) {
                        System.out.println("Deudor");
                    } else {
                        System.out.println("Nulo");
                    }
                }
            }
        } while(num >=0);
        System.out.println("El total de las cuentas con saldo acreedor es: " +acreedor);
    }
}