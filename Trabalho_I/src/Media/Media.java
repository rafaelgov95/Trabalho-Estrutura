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

    /**
     * Método que roda 30 vezes todos os sorts,
     * e calcúla a média de permutações e comparações
     * realizadas
     * @param vetor_pronto 
     */
    public void mediaGeral(int vetor_pronto[]) {
        int[] vetorParaOrdenar;

        for (int i = 0; i < 30; i++) {
            vetorParaOrdenar = vetor_pronto;
            bubble.sort(vetorParaOrdenar);
            vetorParaOrdenar = vetor_pronto;
            merge.sort(vetorParaOrdenar);
            vetorParaOrdenar = vetor_pronto;
        }

        System.out.println("A média de permutação com bubble sort : " + (bubble.permutacao/30) + " vezes!!");
        System.out.println("A média de comparação com bubble sort foi : " + bubble.comparacao / 30);
        System.out.println("A média de comparação com merge sort foi : " + merge.comparacao / 30);
    }

}
