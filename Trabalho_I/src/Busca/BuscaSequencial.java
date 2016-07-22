/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busca;

import Vetor.Vetor;

/**
 *
 * @author Higor - PC
 */
public class BuscaSequencial extends Vetor {

    private long tempInicial;

    public int BuscaSeq(int vetor[], int procurado) {

        for (int i = 0; i < vetor.length; i++) {
            comparacao++;
            if (procurado == vetor[i]) {
                return i;
            }
        }
        return -1;
    }

    public double getRuntime(int[] valor, int procurado) {
        this.tempInicial = System.nanoTime();
        BuscaSeq(valor, procurado);
        double tempo = System.nanoTime() - tempInicial;
        return (double) (tempo / 1000000000.0);

    }
}
