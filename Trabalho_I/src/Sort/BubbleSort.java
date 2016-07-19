/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import Vetor.Vetor;

/**
 *
 * @author Higor - PC
 */
public class BubbleSort extends Vetor {

    MetodoTrocar MT = new MetodoTrocar();

    public int[] bubbleSort(int vetor[]) {
        int i;
        for (i = 0; i < vetor.length-1; i++) {
            for (int j = i+1; j < vetor.length; j++) {
                comparacao++;
                if (vetor[i] > vetor[j]) {
                    vetor = MT.MetodoTrocar(vetor, i, j);
                    permutacao++;
                }
            }
        }
        return vetor;
    }

}
