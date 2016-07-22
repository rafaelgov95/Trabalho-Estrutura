/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Sort.MergeSort;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author rafael
 */
public class Teste {

    public int[] vet;
    long tempInicial;

    /**
     * Método que roda Algum metodo T que recebe um Vetor T assim utilizando o metodo para fazer a ordenação e returna um tempo de gasto. 
     *
     * @param <T>    Valor Generico 
     * @param valor  Vetor
     * @param metodo  Qualquer Metodo Que use um vetor acima
     * @return Double
     * 
     */
    public <T> double getRuntime(T valor, InterfaceTeste<T> metodo) {
        this.tempInicial = System.nanoTime();
        this.vet = metodo.sort(valor);
        double tempo = System.nanoTime() - tempInicial;
//        TimeUnit.SECONDS.convert(, TimeUnit.NANOSECONDS)
        return (double)(tempo/ 1000000000.0);
        
    }

}
