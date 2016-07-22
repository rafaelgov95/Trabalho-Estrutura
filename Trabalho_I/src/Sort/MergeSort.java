/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import Util.InterfaceTeste;
import Vetor.Vetor;

/**
 *
 * @author rafael
 */
public class MergeSort extends Vetor implements InterfaceTeste<int[]> {

    @Override
    public int[] sort(int[] arr) {
        int p = 0;
        int r = arr.length - 1;
        mergeSort(arr, p, r);
        return arr;
    }

    public void mergeSort(int[] array, int inicio, int fim) {
        if (fim <= inicio) {
            return;
        }
        int meio = (inicio + fim) / 2;

        mergeSort(array, inicio, meio);
        mergeSort(array, meio + 1, fim);

        int[] A = new int[meio - inicio + 1];
        int[] B = new int[fim - meio];
        for (int i = 0; i <= meio - inicio; i++) {
            A[i] = array[inicio + i];
        }
        for (int i = 0; i <= fim - meio - 1; i++) {
            B[i] = array[meio + 1 + i];
        }
        int i = 0;
        int j = 0;
        for (int k = inicio; k <= fim; k++) {
            permutacao++;

            if (i < A.length && j < B.length) {
                comparacao++;

                if (A[i] < B[j]) {
                    array[k] = A[i++];
                } else {
                    array[k] = B[j++];
                }
            } else if (i < A.length) {
                array[k] = A[i++];
            } else if (j < B.length) {
                array[k] = B[j++];
            }
        }
    }

}
