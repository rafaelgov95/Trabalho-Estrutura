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
import Util.TesteSort;
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
    private long tempInicial;
    TesteSort t = new TesteSort();
    double tempoDeExecucaoQuick;
    double tempoDeExecucaoHeap;
    double tempoDeExecucaoMerge;
    double tempoDeExecucaoBubble;

    /**
     * Método que roda 30 vezes todos os sorts, e calcúla a média de permutações
     * e comparações realizadas
     *
     * @param vetor_pronto
     */
    public void mediaGeral(int vetor_pronto[]) throws IOException {
        int[] vetorParaOrdenar;
        for (int i = 0; i < 30; i++) {
            vetorParaOrdenar = clonarVetor(vetor_pronto);
            this.tempoDeExecucaoBubble = t.getRuntime(vetorParaOrdenar, bubble);
//            bubble.sort(vetorParaOrdenar);
            vetorParaOrdenar = clonarVetor(vetor_pronto);
            this.tempoDeExecucaoMerge = t.getRuntime(vetorParaOrdenar, merge);

//            merge.sort(vetorParaOrdenar);
            vetorParaOrdenar = clonarVetor(vetor_pronto);
            this.tempoDeExecucaoHeap = t.getRuntime(vetorParaOrdenar, heap);

//            heap.sort(vetorParaOrdenar);
            this.tempoDeExecucaoQuick = t.getRuntime(vetor_pronto, quick);
//            quick.sort(vetor_pronto);
        }

        System.out.println(menu.gravarMedia(bubble.comparacao, bubble.permutacao,tempoDeExecucaoBubble, merge.comparacao, merge.permutacao,tempoDeExecucaoMerge, heap.comparacao, heap.permutacao,tempoDeExecucaoHeap,quick.comparacao, quick.permutacao,tempoDeExecucaoQuick));
        gLog.escreverNoLog(menu.gravarMedia(bubble.comparacao, bubble.permutacao,tempoDeExecucaoBubble, merge.comparacao, merge.permutacao,tempoDeExecucaoMerge, heap.comparacao, heap.permutacao,tempoDeExecucaoHeap,quick.comparacao, quick.permutacao,tempoDeExecucaoQuick));
    }

}

