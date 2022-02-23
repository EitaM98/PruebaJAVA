//Se desea guardar los sueldos de 5 operarios.

package Clase5;

/**
 *
 * @author matic
 */
public class SueldoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sueldo sueldo = new Sueldo ();
        sueldo.cargarsueldo();
        sueldo.imprimir();
    }
}