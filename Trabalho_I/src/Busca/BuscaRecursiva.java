/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busca;

/**
 *
 * @author Higor - PC
 */
public class BuscaRecursiva {

    public int BuscaSeqRecursiva(int vetor[], int n, int procurado) {
        if (n >= 0) {
            if (vetor[n] == procurado) {
                return n;
            } else {
                return BuscaSeqRecursiva(vetor, n - 1, procurado);
            }
        }
        return -1;
    }
}
