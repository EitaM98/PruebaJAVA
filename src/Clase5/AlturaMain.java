//Definir un vector de 5 componentes de tipo float que 
//representen las alturas de 5 personas. Obtener el 
//promedio de las mismas. Contar cuántas personas son 
//más altas que el promedio y cuántas más bajas.

package Clase5;

/**
 *
 * @author matic
 */
public class AlturaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Altura altura = new Altura();
        altura.cargaralturas();
        altura.promedio();
        altura.mayormenor();
    }
}