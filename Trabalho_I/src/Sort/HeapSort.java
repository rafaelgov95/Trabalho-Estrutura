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
 * @author rafael
 */
public class HeapSort extends Vetor implements InterfaceTesteSort<int[]> {
/**
     * Método de ordenação Heap Sort, recebe um vetor como parâmetro
     * e o retorna totalmente ordenado.
     * @param a Vetor a ser ordenado
     * @return Vetor ordenado no pior caso em (Theta (nlog n))
     */
    public int[] sort(int a[]) {

        buildheap(a);

        for (int i = a.length - 1; i >= 1; i--) {
            comparacao++;
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
        return a;
    }

    public void heapify(int a[], int n, int i) {
        int max, child;
        child = 2 * i + 1;
        max = i;

        if (child < n) {
            permutacao++;
            if (a[child] > a[max]) {
                max = child;
            }
        }

        if (child + 1 < n) {
            if (a[child + 1] > a[max]) {
                max = child + 1;
            }
        }

        if (max != i) {
            comparacao++;
            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
            heapify(a, n, max);
        }
    }

    public void buildheap(int a[]) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            heapify(a, a.length, i);
        }
    }

}
