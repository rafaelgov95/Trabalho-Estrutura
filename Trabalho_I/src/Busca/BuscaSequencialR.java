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
public class BuscaSequencialR extends Vetor {

    public int BuscaSeqRecursiva(int vetor[], int n, int procurado) {
        comparacao++;
        if (n >= 0) {
            comparacao++;
            if (vetor[n] == procurado) {
                return n;
            } else {
                return BuscaSeqRecursiva(vetor, n - 1, procurado);
            }
        }
        return -1;
    }
}
