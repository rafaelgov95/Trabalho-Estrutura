/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Sort.MergeSort;

/**
 *
 * @author rafael
 */
public class Teste {
    public int[] vet;
    long tempInicial;

    public <T> double getRuntime(T valor, InterfaceTeste<T> metodo) {
        this.tempInicial = System.nanoTime();
        this.vet=metodo.sort(valor);
        double tempo = System.nanoTime() - tempInicial;
        return tempo;
    }
   
    

    

}
