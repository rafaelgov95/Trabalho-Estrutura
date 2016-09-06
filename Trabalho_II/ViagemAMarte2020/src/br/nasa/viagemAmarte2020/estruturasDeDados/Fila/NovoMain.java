/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.estruturasDeDados.Fila;

/**
 *
 * @author rafael
 */
public class NovoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila<String> fila = new Fila();
        fila.enfileira("RAFAEL");
        fila.enfileira("Rafael2");
        fila.enfileira("Rafael3");
        fila.desenfileira();
         fila.desenfileira();
          fila.desenfileira();
//        System.out.println(fila.desenfileira());
        fila.imprimir();
    }

}
