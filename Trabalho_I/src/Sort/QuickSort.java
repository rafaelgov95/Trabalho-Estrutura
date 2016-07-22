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
public class QuickSort extends Vetor implements InterfaceTeste<int[]> {

    public int[] sort(int[] arr) {
        int p = 0;
        int r = arr.length - 1;
        Quicksort(arr, p, r);
        return arr;
    }

    public void Quicksort(int[] arr, int p, int r) {
        if (p < r) {

            int q = partition(arr, p, r);
            Quicksort(arr, p, q - 1);
            Quicksort(arr, q + 1, r);
        }

    }

    public int partition(int arr[], int p, int r) {
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            comparacao++;
            if (arr[j] <= x) {
                permutacao++;
                i++;
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        permutacao++;
        int swap = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = swap;
        return i + 1;
    }

}
