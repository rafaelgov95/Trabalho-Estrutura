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
        for (i = 0; i < vetor.length; i++) {
            permutacao++;
            for (int j = 0; j < vetor.length - 1; j++) {
                permutacao++;

                if (vetor[j] > vetor[j + 1]) {
                    vetor = MT.MetodoTrocar(vetor, j, j + 1);
                    troca++;
                }
            }
        }
        return vetor;
    }

}
