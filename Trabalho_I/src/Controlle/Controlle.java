package Controlle;

import Busca.BuscaBinaria;
import Busca.BuscaSequencial;
import Media.Media;
import Sort.BubbleSort;
import Sort.HeapSort;
import Sort.MergeSort;
import Sort.QuickSort;
import Util.Log;
import Util.TesteSort;
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
//            = {2, 3, 4, 5, 6};
    static int vetor_desordenado[];
    static Scanner ler = new Scanner(System.in);

    /**
     * Método de controle de todo o algoritmo, aqui são lidas as entradas do
     * usuário, e chamadas todas as outras funções
     *
     * @throws IOException
     */
    public void App() throws IOException {
        Vetor CV = new Vetor();
        Log log = new Log();
        Media media = new Media();

        Menu menu = new Menu();
        TesteSort teste = new TesteSort();
       
   
        menu.menuPrincipal();
        String opcao = ler.nextLine();

        switch (opcao) {
            case "1":
                if (vetor != null) {
                    menu.VetorExistent();
                    int s_n = Integer.parseInt(ler.nextLine());
                    if (s_n != 1) {
                        break;
                    }
                }
                menu.tamanhoVetor();
                String Op_tamanho = ler.nextLine();
                int tamanho = 0;
                switch (Op_tamanho) {
                    case "1":
                        tamanho = 512;
                        break;
                    case "2":
                        tamanho = 1024;
                        break;
                    case "3":
                        tamanho = 4096;
                        break;
                    case "4":
                        tamanho = Integer.parseInt(ler.nextLine());
                        break;
                    case "0":
                        menu.opcaoMenuPrincipalInvalida();
                        break;
                }
                vetor = CV.criarNovoVetor(tamanho);
                break;
            case "2":
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
            case "3":
                if (vetor == null) {
                    menu.vetorNExistente();
                } else if (CV.vetorOrdenado(vetor)) {
                    Busca.BuscaBinaria buscaBinaria = new BuscaBinaria();
                    menu.BuscaBinariaSelect();
                    menu.numeroProcurado();
                    int procurado = Integer.parseInt(ler.nextLine());
                    double tempoB=buscaBinaria.getRuntime(vetor, procurado);
                    int resulBB = buscaBinaria.busca(vetor, procurado, 0, vetor.length - 1);
                    
                    if (resulBB == -1) {
                        menu.numeroProcuradoNEncontrado();
                    } else {
                        System.out.println(menu.gravarBuscaBinaria(resulBB, procurado, buscaBinaria.comparacao,tempoB));
                        log.escreverNoLog(menu.gravarBuscaBinaria(resulBB, procurado, buscaBinaria.comparacao,tempoB));
                        buscaBinaria.comparacao = 0;
                    }

                } else {
                    Busca.BuscaSequencial buscaSequencial = new BuscaSequencial();
                    menu.BuscaSequencialSelect();
                    menu.numeroProcurado();
                    int procurado = Integer.parseInt(ler.nextLine());
                    double tempoS=buscaSequencial.getRuntime(vetor, procurado);
                    int resulBS = buscaSequencial.BuscaSeq(vetor, procurado);
                    if (resulBS == -1) {
                        menu.numeroProcuradoNEncontrado();
                    } else {
                        System.out.println(menu.gravarBuscaSequencialD(resulBS, procurado, buscaSequencial.comparacao,tempoS));
                        log.escreverNoLog(menu.gravarBuscaBinaria(resulBS, procurado, buscaSequencial.comparacao,tempoS));
                        buscaSequencial.comparacao = 0;
                    }

                }
                break;
            case "4":
                if (vetor == null) {
                    menu.vetorNExistente();
                } else {
                    menu.MenuOrdena();
                    String ord = ler.nextLine();
                    switch (ord) {
                        case "1":
                            BubbleSort bubbleSort = new BubbleSort();
                            double tempoDeExecucaoBubble = teste.getRuntime(vetor, bubbleSort);
                            vetor = CV.clonarVetor(teste.vet);
                            System.out.println(menu.gravarBubble(tempoDeExecucaoBubble, bubbleSort.comparacao, bubbleSort.permutacao));
                            
                            log.escreverNoLog(menu.gravarBubble(tempoDeExecucaoBubble, bubbleSort.comparacao, bubbleSort.permutacao));
                            break;
                        case "2":
                            MergeSort mergeSort = new MergeSort();
                            double tempoDeExecucaoMerge = teste.getRuntime(vetor, mergeSort);
                            vetor = CV.clonarVetor(teste.vet);

                            System.out.println(menu.gravarMerge(tempoDeExecucaoMerge, mergeSort.comparacao, mergeSort.permutacao));
                            log.escreverNoLog(menu.gravarMerge(tempoDeExecucaoMerge, mergeSort.comparacao, mergeSort.comparacao));
                            break;
                        case "3":
                            QuickSort quickSort = new QuickSort();
                            double tempoDeExecucaoQuick = teste.getRuntime(vetor, quickSort);
                            vetor = CV.clonarVetor(teste.vet);
                            System.out.println(menu.gravarQuick(tempoDeExecucaoQuick, quickSort.comparacao, quickSort.permutacao));
                            log.escreverNoLog(menu.gravarQuick(tempoDeExecucaoQuick, quickSort.comparacao, quickSort.comparacao));
                            break;
                        case "4":
                            HeapSort heapSort = new HeapSort();
                            double tempoDeExecucaoHeap = teste.getRuntime(vetor, heapSort);
                            vetor = teste.vet;
                            System.out.println(menu.gravarHeap(tempoDeExecucaoHeap, heapSort.comparacao, heapSort.permutacao));
                            log.escreverNoLog(menu.gravarHeap(tempoDeExecucaoHeap, heapSort.comparacao, heapSort.permutacao));
                            break;
                        case "0":
                            break;
                        default:
                            menu.opcaoMenuPrincipalInvalida();
                            break;
                    }
                }
                break;
            case "5":
                if (vetor == null) {
                    menu.vetorNExistente();
                } else {
                    int vetor_aux[] = (vetor);
                    media.mediaGeral(vetor_aux);
                }
                break;
            case "6":
                log.lerLog();
                break;
            case "7":
                log.ZerarArquivos();
                break;
            case "8":
                menu.creditos();
                break;
            case "0":
                System.exit(0);
                break;
            default:
                menu.opcaoMenuPrincipalInvalida();
                App();
                break;
        }
    }
}
