/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg20;

import javax.swing.JOptionPane;

/**
 *
 * @author ADOLFO
 */
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private float prezo;
    private int num_unidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, float prezo, int num_unidades) {
        this.titulo = JOptionPane.showInputDialog("Introduce el título:");
        this.autor = JOptionPane.showInputDialog("Introduce el autor:");
        this.ISBN = JOptionPane.showInputDialog("Introduce el ISBN:");
        this.prezo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio:"));
        this.num_unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de unidades:"));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getNum_unidades() {
        return num_unidades;
    }

    public void setNum_unidades(int num_unidades) {
        this.num_unidades = num_unidades;
    }
    
   
    
    
    
    
    
}
