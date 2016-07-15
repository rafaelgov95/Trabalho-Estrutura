/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Sort.BubbleSort;
import Vetor.Vetor;

/**
 *
 * @author rafael
 */
public class Media {

    public void mediaGeral(int tamanho) {
        int[] vetorParaOrdenar;
        BubbleSort bubble = new BubbleSort();
        Vetor vetorC = new Vetor();

        for (int j = 0; j < 30; j++) {
            int[] vetor = vetorC.criarNovoVetor(tamanho);
            for (int i = 0; i < (vetor.length - 1); i++) {
                vetorParaOrdenar = vetor;
                bubble.bubbleSort(vetorParaOrdenar);
//              vetorParaOrdenar = vetor;
//              merger.mergerSort(vetorParaOrdenar);
            }

        }
        System.out.println("Ele permuto com bubble sort : "+bubble.permutacao / 30+" vezes!!");

    }

}
