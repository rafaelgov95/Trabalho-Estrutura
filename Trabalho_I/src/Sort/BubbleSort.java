/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import Vetor.Vetor;
import Util.InterfaceTesteSort;

/**
 *
 * @author Higor - PC
 */
public class BubbleSort extends Vetor implements InterfaceTesteSort<int[]> {

//    public void sort(int[] valor) {
//        BubbleSort.this(valor);
//    }
    public int[] sort(int vetor[]) {
        
        int i;
        for (i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                comparacao++;
                if (vetor[i] > vetor[j]) {
                    vetor = MetodoTrocar(vetor, i, j);
                    permutacao++;
                }
            }
        }
        return vetor;
    }

}
