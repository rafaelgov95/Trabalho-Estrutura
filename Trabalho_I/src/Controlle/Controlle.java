package Controlle;

import Busca.BuscaBinaria;
import Busca.BuscaSequencialR;
import Media.Media;
import Sort.BubbleSort;
import Sort.HeapSort;
import Sort.MergeSort;
import Sort.QuickSort;
import Util.GravarLog;
import Util.Teste;
import Vetor.ClonarVetor;
import Vetor.Vetor;
import View.Menu;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rafael
 */
public class Controlle {

    static int vetor[];
    static Scanner ler = new Scanner(System.in);

    public void App() throws IOException {
        Vetor CV = new Vetor();
        GravarLog log = new GravarLog();
        Media media = new Media();
        ClonarVetor cVetor = new ClonarVetor();
        Menu menu = new Menu();
        Teste teste = new Teste();
        menu.menuPrincipal();
        int opcao = Integer.parseInt(ler.nextLine());

        switch (opcao) {
            case 1:
                if (vetor != null) {
                    menu.VetorExistent();
                    int s_n = Integer.parseInt(ler.nextLine());
                    if (s_n != 1) {
                        break;
                    }
                }
                menu.tamanhoVetor();
                int tamanho = Integer.parseInt(ler.nextLine());
                switch (tamanho) {
                    case 1:
                        tamanho = 512;
                        break;
                    case 2:
                        tamanho = 1024;
                        break;
                    case 3:
                        tamanho = 4096;
                        break;
                    case 4:
                        tamanho = Integer.parseInt(ler.nextLine());
                        break;
                    case 0:
                        break;
                }
                vetor = CV.criarNovoVetor(tamanho);
                break;
            case 2:
                if (vetor == null) {
                    menu.vetorNExistente();
                } else {
                    int quebra_linha = 1;
                    for (int i = 0; i < vetor.length; i++, quebra_linha++) {
                        System.out.print("| " + vetor[i] + " ");
                        if (quebra_linha == 15) {
                            System.out.print(" |\n");
                            quebra_linha = 0;
                        }
                    }
                    System.out.print("|\n");
                }
                break;
            case 3:
                if (vetor == null) {
                    menu.vetorNExistente();
                } else {

                    Busca.BuscaBinaria buscaBinaria = new BuscaBinaria();
                    Busca.BuscaSequencialR buscaSequencial = new BuscaSequencialR();
                    menu.numeroProcurado();
                    int procurado = Integer.parseInt(ler.nextLine());
                    menu.menuEscolhaBusca();
                    int escolhaBusca = Integer.parseInt(ler.nextLine());
                    switch (escolhaBusca) {
                        case 1:
                            int resulBB = buscaBinaria.buscaBinariaRecursiva(vetor, procurado, 0, vetor.length - 1);
                            System.out.println(resulBB);
                            if (resulBB == -1) {
                                menu.numeroProcuradoNEncontrado();
                            } else {
                                menu.ResultadoBuscaBinaria(resulBB, procurado);
                            }

                            break;
                        case 2:
                            int resulBS = buscaBinaria.buscaBinariaRecursiva(vetor, procurado, 0, vetor.length - 1);
                            System.out.println(resulBS);
                            if (resulBS == -1) {
                                menu.numeroProcuradoNEncontrado();
                            } else {
                                menu.ResultadoBuscaBinaria(resulBS, procurado);
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                break;
            case 4:
                if (vetor == null) {
                    menu.vetorNExistente();
                } else {
                    menu.MenuOrdena();
                    int ord = Integer.parseInt(ler.nextLine());
                    switch (ord) {
                        case 1:
                            Teste testeBubble = new Teste();
                            BubbleSort bubbleSort = new BubbleSort();
                            double tempoDeExecucaoBubble = testeBubble.getRuntime(vetor, bubbleSort);
                            vetor = testeBubble.vet;
                            Menu.impresaoBubble(tempoDeExecucaoBubble);
                            log.escreverNoLog(Menu.gravarBubble(tempoDeExecucaoBubble));
                            break;
                        case 2:
                            MergeSort mergeSort = new MergeSort();
                            double tempoDeExecucaoMerge = teste.getRuntime(vetor, mergeSort);
                            vetor = teste.vet;
                            Menu.impresaoMerge(tempoDeExecucaoMerge);
                            log.escreverNoLog(Menu.gravarMerge(tempoDeExecucaoMerge));
                            break;
                        case 3:
                            QuickSort quickSort = new QuickSort();
                            double tempoDeExecucaoQuick = teste.getRuntime(vetor, quickSort);
                            vetor = teste.vet;
                            Menu.impresaoQuick(tempoDeExecucaoQuick);
                            log.escreverNoLog(Menu.gravarQuick(tempoDeExecucaoQuick));
                            break;
                        case 4:
                            HeapSort heapSort = new HeapSort();
                            double tempoDeExecucaoHeap = teste.getRuntime(vetor, heapSort);
                            vetor = teste.vet;
                            Menu.impresaoHeap(tempoDeExecucaoHeap);
                            log.escreverNoLog(Menu.gravarHeap(tempoDeExecucaoHeap));
                            break;
                        case 0:
                            break;
                        default:
                            break;
                    }
                }
                break;
            case 9:
                menu.creditos();
                break;
            case 10:
                if (vetor == null) {
                    menu.vetorNExistente();
                } else {
                    int vetor_aux[] = cVetor.clonarVetor(vetor);
                    media.mediaGeral(vetor_aux);
                }
                break;
            case 0:
                System.exit(0);
                break;

            default:
                menu.opcaoMenuPrincipalInvalida();
                break;
        }
    }
}
