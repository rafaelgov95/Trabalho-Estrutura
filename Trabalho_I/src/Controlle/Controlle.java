package Controlle;

import Busca.BuscaBinaria;
import Busca.BuscaSequencial;
import Media.Media;
import Sort.BubbleSort;
import Sort.HeapSort;
import Sort.MergeSort;
import Sort.QuickSort;
import Util.Log;
import Util.Teste;
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
    static int vetor_desordenado[];
    static Scanner ler = new Scanner(System.in);

    public void App() throws IOException {
        Vetor CV = new Vetor();
        Log log = new Log();
        Media media = new Media();

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
                    Busca.BuscaSequencial buscaSequencial = new BuscaSequencial();
                    menu.numeroProcurado();
                    int procurado = Integer.parseInt(ler.nextLine());
                    menu.menuEscolhaBusca();
                    int escolhaBusca = Integer.parseInt(ler.nextLine());
                    switch (escolhaBusca) {
                        case 1:
                            menu.avisoBusca();
                            int resulBB = buscaBinaria.buscaBinariaRecursiva(vetor, procurado, 0, vetor.length - 1);

                            if (resulBB == -1) {
                                menu.numeroProcuradoNEncontrado();
                            } else {
                                menu.imprimirBuscaBinaria(resulBB, procurado, buscaBinaria.comparacao);
                                log.escreverNoLog(menu.gravarBuscaBinaria(resulBB, procurado, opcao));
                                buscaBinaria.comparacao = 0;
                            }
                            break;
                        case 2:
                            int resulBSO = buscaSequencial.BuscaSeq(vetor, procurado);

                            if (resulBSO == -1) {
                                menu.numeroProcuradoNEncontrado();
                            } else {
                                menu.imprimirBuscaSequencialO(resulBSO, procurado, buscaSequencial.comparacao);
                                log.escreverNoLog(menu.gravarBuscaSequencialO(resulBSO, procurado, opcao));
                                buscaSequencial.comparacao = 0;
                            }
                            break;
                        case 3:
                            int resulBSD = buscaSequencial.BuscaSeq(vetor_desordenado, procurado);
                            if (resulBSD == -1) {
                                menu.numeroProcuradoNEncontrado();
                            } else {
                                menu.imprimirBuscaSequencialO(resulBSD, procurado, buscaSequencial.comparacao);
                                log.escreverNoLog(menu.gravarBuscaSequencialD(resulBSD, procurado, opcao));
                                buscaSequencial.comparacao = 0;
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
                            Menu.impresaoBubble(tempoDeExecucaoBubble, bubbleSort.comparacao, bubbleSort.permutacao);
                            log.escreverNoLog(Menu.gravarBubble(tempoDeExecucaoBubble, bubbleSort.comparacao, bubbleSort.permutacao));
                            break;
                        case 2:
                            MergeSort mergeSort = new MergeSort();
                            double tempoDeExecucaoMerge = teste.getRuntime(vetor, mergeSort);
                            vetor = teste.vet;
                            Menu.impresaoMerge(tempoDeExecucaoMerge, mergeSort.comparacao, mergeSort.permutacao);
                            log.escreverNoLog(Menu.gravarMerge(tempoDeExecucaoMerge, mergeSort.comparacao, mergeSort.comparacao));
                            break;
                        case 3:
                            QuickSort quickSort = new QuickSort();
                            double tempoDeExecucaoQuick = teste.getRuntime(vetor, quickSort);
                            vetor = teste.vet;
                            Menu.impresaoMerge(tempoDeExecucaoQuick, quickSort.comparacao, quickSort.permutacao);
                            log.escreverNoLog(Menu.gravarMerge(tempoDeExecucaoQuick, quickSort.comparacao, quickSort.comparacao));
                            break;
                        case 4:
                            HeapSort heapSort = new HeapSort();
                            double tempoDeExecucaoHeap = teste.getRuntime(vetor, heapSort);
                            vetor = teste.vet;
                            Menu.impresaoHeap(tempoDeExecucaoHeap, heapSort.comparacao, heapSort.permutacao);
                            log.escreverNoLog(Menu.gravarHeap(tempoDeExecucaoHeap, heapSort.comparacao, heapSort.permutacao));
                            break;
                        case 0:
                            break;
                        default:
                            break;
                    }
                }
                break;
            case 5:
                if (vetor == null) {
                    menu.vetorNExistente();
                } else {
                    int vetor_aux[] = CV.clonarVetor(vetor);
                    media.mediaGeral(vetor_aux);
                }
                break;
            case 6:
                log.lerLog();
                break;
            case 7:
                log.ZerarArquivos();
                break;
            case 8:
                menu.creditos();
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
