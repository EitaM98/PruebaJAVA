//Confeccionar una clase que permita carga el nombre y la edad de una
//persona. Mostrar los datos cargados. Imprimir un mensaje si es mayor
//de edad (edad>=18)
package Clase4;

public class PersonaMain {


    public static void main(String[] args) {
        Persona persona1=new Persona();
        persona1.inicializar();
        persona1.imprimir();
        persona1.esMayor();
    }
}