/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioHerencia;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Multimedia {
    protected String titulo;
    protected String autor;
    protected String formato;
    protected float duracion;
    private Scanner teclado;

    public Multimedia(String titulo, String autor, String formato, float duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }
}
