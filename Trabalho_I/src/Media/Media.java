package Media;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Sort.BubbleSort;
import Sort.MergeSort;

/**
 *
 * @author rafael
 */
public class Media {

    BubbleSort bubble = new BubbleSort();
    MergeSort merge = new MergeSort();

    public void mediaGeral(int vetor_pronto[]) {
        int[] vetorParaOrdenar;

        for (int i = 0; i < 30; i++) {
            vetorParaOrdenar = vetor_pronto;
            bubble.bubbleSort(vetorParaOrdenar);
            vetorParaOrdenar = vetor_pronto;
            merge.mergesort(vetorParaOrdenar);
            vetorParaOrdenar = vetor_pronto;
        }

        System.out.println("A média de permutação com bubble sort : " + (bubble.permutacao/30) + " vezes!!");
        System.out.println("A média de comparação com bubble sort foi : " + bubble.comparacao / 30);
        System.out.println("A média de comparação com merge sort foi : " + merge.comparacao / 30);
    }

}
