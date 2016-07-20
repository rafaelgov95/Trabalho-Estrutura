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
public class MergeSort extends Vetor implements InterfaceTeste<int[]>{
    
    public int[] sort(int[] input) {
        
        if (input.length == 1) {
            return input;
        }
        
        int middle = (int) Math.ceil((double) input.length / 2);
        int[] left = new int[middle];
        
        int rightLength = 0;
        if (input.length % 2 == 0) {
            comparacao++;
            rightLength = middle;
        } else {
            rightLength = middle - 1;
        }
        int[] right = new int[rightLength];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < input.length; i++) {
            if (i < middle) {
            comparacao++;
                left[leftIndex] = input[i];
                leftIndex++;
            } else {
                right[rightIndex] = input[i];
                rightIndex++;
            }
        }
        left = sort(left);
        right = sort(right);
        return merge(left, right);
    }

    /**
     * This method merge two integer arrays into a sorted integer array.
     * @param left first array.
     * @param right second array.
     * @return a sorted integer array.
     */
    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        
        while (leftIndex < left.length || rightIndex < right.length) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] < right[rightIndex]) {
                    result[resultIndex] = left[leftIndex];
                    leftIndex++;
                    resultIndex++;
                } else {
                    result[resultIndex] = right[rightIndex];
                    rightIndex++;
                    resultIndex++;
                }
            } else if (leftIndex < left.length) {
                for (int i = resultIndex; i < result.length; i++) {
                    result[i] = left[leftIndex];
                    leftIndex++;
                }
            } else if (rightIndex < right.length) {
                for (int i = resultIndex; i < result.length; i++) {
                    result[i] = right[rightIndex];
                    rightIndex++;
                }
            }
        }
        
        return result;
    }
}
