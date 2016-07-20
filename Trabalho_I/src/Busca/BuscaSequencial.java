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

    public int BuscaSeq(int vetor[],int procurado) {
        for (int i = 0; i < vetor.length; i++) {
            comparacao++;
            if (procurado == vetor[i]) {
                return i;
            }
        }
        return -1;
    }
}
