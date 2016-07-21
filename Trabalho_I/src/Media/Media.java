package Media;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Sort.BubbleSort;
import Sort.HeapSort;
import Sort.MergeSort;
import Sort.QuickSort;
import Util.Log;
import Vetor.Vetor;
import View.Menu;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import java.io.IOException;

/**
 *
 * @author rafael
 */
public class Media extends Vetor {

    Log gLog = new Log();
    Menu menu = new Menu();
    BubbleSort bubble = new BubbleSort();
    MergeSort merge = new MergeSort();
    QuickSort quick = new QuickSort();
    HeapSort heap = new HeapSort();

    public void mediaGeral(int vetor_pronto[]) throws IOException {
        int[] vetorParaOrdenar;
        for (int i = 0; i < 30; i++) {
            vetorParaOrdenar = clonarVetor(vetor_pronto);
            bubble.sort(vetorParaOrdenar);
            vetorParaOrdenar = clonarVetor(vetor_pronto);
            merge.sort(vetorParaOrdenar);
            vetorParaOrdenar = clonarVetor(vetor_pronto);
            heap.sort(vetorParaOrdenar);
            quick.sort(vetor_pronto);
        }

        Menu.impresaoMedia(bubble.comparacao, bubble.permutacao, merge.comparacao, merge.permutacao, heap.comparacao, heap.permutacao, quick.comparacao, quick.permutacao);
        gLog.escreverNoLog(Menu.gravarMedia(bubble.comparacao, bubble.permutacao, merge.comparacao, merge.permutacao, heap.comparacao, heap.permutacao, quick.comparacao, quick.permutacao));
    }

}
