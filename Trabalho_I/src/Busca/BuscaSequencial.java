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

    /**
     * Método de busca sequencial, onde é passado
     * um vetor e o número a ser buscado, como 
     * resultado, é retornado um inteiro, que
     * indica a posição do número buscado
     * no vetor. Caso o retorno seja -1, o número
     * buscado, não está no vetor.
     * @param vetor Vetor que será usado na busca
     * @param procurado Número a ser buscado
     * @return 
     */
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
