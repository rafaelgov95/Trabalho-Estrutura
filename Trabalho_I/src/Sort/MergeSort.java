/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 *
 * @author rafael
 */
public class MergeSort {

    MetodoTrocar MT = new MetodoTrocar();

    public int[] MergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int mid = (int) (inicio + fim / 2);
            MergeSort(vetor, inicio, mid);
            MergeSort(vetor, mid + 1, fim);
            Merge(vetor, inicio, mid, fim);
        }
        return vetor;
    }

    
    
    public void Merge(int[] vetor, int inicio, int mid, int fim) {
        int[] L = new int[vetor.length];
        int[] R = new int[vetor.length];
        int j, i;
        int n1 = (mid - inicio + 1);
        int n2 = fim - mid;
        for (i = 0; i < n1 - 1; i++) {
            L[i] = vetor[inicio + i - 1];

        }
        for (j = 0; j < n1 - 1; j++) {
            R[j] = vetor[mid + j];
        }
        i = j = 1;
        L[n1 + 1] = R[n2 + 1] = Integer.MAX_VALUE;
        for (int k = 0; k < fim; k++) {
            if (L[k] <= R[k]) {
                vetor[k] = L[i];
                i++;
            } else {
                vetor[k] = R[j];
                j++;
            }
        }
    }
}
