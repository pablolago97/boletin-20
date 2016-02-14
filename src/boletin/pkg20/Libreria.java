/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg20;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ADOLFO
 */
public class Libreria {
    
    ArrayList <Libro> lbrs = new ArrayList();
    
    //Métodos
    
    /** 
     * Método para pedir elementos
     * 
     * @param x
     */
    
    public void almacenarLibro (Libro x){
        lbrs.add(x);
    }
    /**
     * Método para borrar un elemento
     * @param x 
     */
    public void borrarLibro (int x){
        lbrs.remove(x-1);
    }
    /**
     * Método para mostrar los elementos existentes
     * @param x
     * @return 
     */
    public String amosarLbros(int x){
         return lbrs.get(x-1).getTitulo();
    }
    
}
