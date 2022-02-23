//1 Confeccionar una clase Persona que tenga como atributos el nombre y la edad.
//1 Definir como responsabilidades un método que cargue los datos personales y otro que los imprima.
//2 Plantear una segunda clase Empleado que herede de la clase Persona. 
//2 Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
//3 Definir un objeto de la clase Persona y llamar a sus métodos. 
//3 También crear un objeto de la clase Empleado y llamar a sus métodos.

package EjercicioHerencia;

import java.util.Scanner;

public class Persona {
    protected String nombre;
    protected int edad;
    protected Scanner teclado;

    public Persona() {
        teclado=new Scanner(System.in);
    }
    
    public void cargar () {
        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = teclado.nextInt();
    }
            
    public void imprimir () {
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}
