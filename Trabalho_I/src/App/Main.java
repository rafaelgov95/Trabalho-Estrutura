/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Media.Media;
import Busca.BuscaBinaria;
import Busca.BuscaSequencialR;
import Sort.BubbleSort;
import Sort.MergeSort;
import Util.GravarLog;
import Util.Teste;
import Vetor.ClonarVetor;
import Vetor.Vetor;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Higor - PC
 */
public class Main {

    static int vetor[];
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Vetor CV = new Vetor();
        GravarLog log = new GravarLog();
        while (true) {

            Media media = new Media();
            ClonarVetor cVetor = new ClonarVetor();

            System.out.println("-------------------------------------");
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println(">  Trabalho - Estrutura de Dados I  <");
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println("-------------------------------------");
            System.out.println("Digite a opção Desejada");
            System.out.println("1 - Criar novo vetor");
            System.out.println("2 - Imprimir meu vetor");
            System.out.println("3 - Buscar um número em meu vetor");
            System.out.println("4 - Ordenar meu vetor");
            System.out.println("9 - Créditos");
            System.out.println("10 - Imprimir Media de Permutas");
            System.out.println("0 - Sair");

            int opcao = Integer.parseInt(ler.nextLine());

            switch (opcao) {
                case 1:
                    if (vetor != null) {
                        System.out.println("Você já possui um vetor, tem certeza que deseja substituí-lo?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");
                        int s_n = Integer.parseInt(ler.nextLine());
                        if (s_n == 2) {
                            break;
                        }
                    }
                    System.out.println("Escolha o tamanho do vetor desejado:");
                    System.out.println("1 - 512 Posições");
                    System.out.println("2 - 1024 Posições");
                    System.out.println("3 - 4096 Posições");
                    System.out.println("0 - Voltar");
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
                        case 0:
                            break;
                    }
//                    System.out.println("Informe o tamanho do vetor");
//                    int tamanho = Integer.parseInt(ler.nextLine());
                    vetor = CV.criarNovoVetor(tamanho);
                    break;
                case 2:
                    if (vetor == null) {
                        System.out.println("***************************************");
                        System.out.println("Você não possui um vetor para imprimir!");
                        System.out.println("***************************************");
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
                        System.out.println("*************************************");
                        System.out.println("Você não possui um vetor para buscar!");
                        System.out.println("*************************************");
                    } else {
                        Busca.BuscaBinaria buscaBinaria = new BuscaBinaria();
                        Busca.BuscaSequencialR buscaSequencial = new BuscaSequencialR();

                        System.out.print("Digite o número a ser buscado: ");
                        int procurado = Integer.parseInt(ler.nextLine());
                        int resulBB = buscaBinaria.buscaBinariaRecursiva(vetor, procurado, 0, vetor.length - 1);
                        int resulBS = buscaSequencial.BuscaSeqRecursiva(vetor, vetor.length - 1, procurado);
                        if (resulBB == -1) {
                            System.out.println("*******************************************");
                            System.out.println("O número procurado não se encontra no vetor");
                            System.out.println("*******************************************");
                        } else {
                            System.out.println("---------------------------------------");
                            System.out.println("Utilizando a Busca Binária:");
                            System.out.println("  > O número " + procurado + " está na posição: " + resulBB);
                            System.out.println("  > Foram feitas " + buscaBinaria.comparacao + " comparações");

                            System.out.println("---------------------------------------");
                            System.out.println("Utilizando a Busca Sequencial:");
                            System.out.println("  > O número " + procurado + " está na posição: " + resulBS);
                            System.out.println("  > Foram feitas " + buscaSequencial.comparacao + " comparações");

                        }
                    }
                    break;
                case 4:
                    if (vetor == null) {
                        System.out.println("**************************************");
                        System.out.println("Você não possui um vetor para ordenar!");
                        System.out.println("**************************************");
                    } else {
                        System.out.println("Qual tipo de ordenação deseja realizar?");
                        System.out.println("1 - Bubble Sort \n2 - Merge Sort");
                        int ord = Integer.parseInt(ler.nextLine());
                        switch (ord) {
                            case 1:

                                Teste testeBubble = new Teste();
                                BubbleSort bubbleSort = new BubbleSort();

                                double tempoDeExecucaoBubble = testeBubble.getRuntime(vetor, bubbleSort);
                                vetor = testeBubble.vet;
                                impresao(tempoDeExecucaoBubble);
                                log.escreverNoLog(gravar(tempoDeExecucaoBubble));
                                break;
                            case 2:
                                Teste testeMerge = new Teste();
                                MergeSort mergeSort = new MergeSort();
                                double tempoDeExecucaoMerge = testeMerge.getRuntime(vetor, mergeSort);
                                vetor = testeMerge.vet;
                                impresao(tempoDeExecucaoMerge);
                                break;
                            case 0:
                                break;
                            default:
                                break;
                        }
                        System.out.println("--------------------------");
                        System.out.println("Vetor ordenado com sucesso");
                        System.out.println("--------------------------");
                    }
                    break;
                case 9:
                    System.out.println("#####################################################");
                    System.out.println("Trabalho I, realizado na matéria Estrutura de Dados");
                    System.out.println("Implementado por Higor Chaves e Rafael Viana");
                    System.out.println("Com o auxilio do professor Marcel Kay");
                    System.out.println("Durante o 3º Semestre do curso Sistemas de Informações");
                    System.out.println("Julho/2016 - UFMS");
                    System.out.println("######################################################");
                    break;
                case 10:
                    if (vetor == null) {
                        System.out.println("**************************************");
                        System.out.println("Você não possui um vetor para o teste!");
                        System.out.println("**************************************");
                    } else {
                        int vetor_aux[] = cVetor.clonarVetor(vetor);
                        media.mediaGeral(vetor_aux);
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("*******************************");
                    System.out.println("Opção Inválida, Tente Novamente");
                    System.out.println("*******************************");
                    break;
            }
        }
    }

    public static void impresao(double temp) {
        System.out.println("-----------------------");
        System.out.printf("Seu vetor foi ordenado em: %.2f Segundos!\n", temp);
        System.out.println("-----------------------");
    }

    public static String gravar(double temp) {
        return "Seu vetor foi ordenado em:" + String.valueOf(temp) + "Segundos!\n";
    }
}
