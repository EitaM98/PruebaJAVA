/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioHerencia;

/**
 *
 * @author Nicolas
 */
public class Disco extends Multimedia{
    private String genero;

    public Disco(String genero, String autor, String titulo, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }
    
    public void imprimir(){
        System.out.println("Genero del disco: "+genero); 
        System.out.println("Autor del disco: "+autor); 
        System.out.println("Titulo del disco: "+titulo);
        System.out.println("Formato del disco: "+formato);
        System.out.println("Duracion del disco: "+duracion);
    }  
}
