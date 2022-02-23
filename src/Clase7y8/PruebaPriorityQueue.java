/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase7y8;

import java.util.PriorityQueue;

public class PruebaPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<String> cola1 = new PriorityQueue<String>();
        cola1.add("Tobias");
        cola1.add("Juliana");
        cola1.add("Matias");
        System.out.println("Imprimimos la cola con prioridades de enteros");
        while (!cola1.isEmpty())
            System.out.print(cola1.poll() + "-");
    }

}