/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import static Sort.QuickSort.Quicksort;
import Util.InterfaceTeste;
import Vetor.Vetor;

/**
 *
 * @author rafael
 */
public class HeapSort extends Vetor implements InterfaceTeste<int[]> {

//    public int[] sort(int[] arr) {
//        int p = 0;
//        int r = arr.length - 1;
//        heapify(arr, p, r);
//        return arr;
//    }
    static void heapify(int a[], int n, int i) {
        int max, child;
        child = 2 * i + 1;
        max = i;
        if (child < n) {
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
            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
            heapify(a, n, max);
        }
    }

    static void buildheap(int a[]) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            heapify(a, a.length, i);
        }
    }


    public int[] sort(int a[]) {
        buildheap(a);
        for (int i = a.length - 1; i >= 1; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
        return a;
    }

}
