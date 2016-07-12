/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 *
 * @author Higor - PC
 */
public class BubbleSort {
    
    MetodoTrocar MT = new MetodoTrocar();
    
    public int[] bubbleSort(int vetor[]) {
        int i;

        for (i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    vetor = MT.MetodoTrocar(vetor, j, j + 1);
                }
            }
        }
        return vetor;
    }
    
}
