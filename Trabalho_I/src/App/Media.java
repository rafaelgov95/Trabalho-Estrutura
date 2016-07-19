/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Sort.BubbleSort;

/**
 *
 * @author rafael
 */
public class Media {

    

    public void mediaGeral(int vetor_pronto[]) {
        int[] vetorParaOrdenar;
        BubbleSort bubble = new BubbleSort();
        vetorParaOrdenar = vetor_pronto;
        bubble.bubbleSort(vetorParaOrdenar);
//              vetorParaOrdenar = vetor;
//              merger.mergerSort(vetorParaOrdenar);

        System.out.println("Ele permuto com bubble sort : " + (bubble.permutacao) + " vezes!!");
        System.out.println("Comparacao bubble: " + bubble.comparacao);

    }

}
