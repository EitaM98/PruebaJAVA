//Desarrollar un programa que cargue los lados de un
//triángulo e implemente los siguientes métodos:
//inicializar los atributos, imprimir el valor del lado
//mayor y otro método que muestre si es equilátero o no.
package Clase4;

/**
 *
 * @author matic
 */
public class TrianguloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo triangulo=new Triangulo();
        triangulo.lados();
        triangulo.mayor();
        triangulo.equilatero();
    }
}