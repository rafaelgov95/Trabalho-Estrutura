/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Busca.BuscaBinaria;
import Busca.BuscaSequencialR;
import Sort.BubbleSort;
import Sort.MergeSort;
import Vetor.Vetor;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Higor - PC
 */
public class Main {

    static int vetor[];
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        Vetor CV = new Vetor();
        Media media = new Media();
        Sort.BubbleSort bSort = new BubbleSort();
        Sort.MergeSort mSort = new MergeSort();
        Busca.BuscaBinaria buscaB = new BuscaBinaria();
        Busca.BuscaSequencialR buscaS = new BuscaSequencialR();
     
        while (true) {

            System.out.println("-------------------------------------");
            System.out.println("-  Trabalho - Estrutura de Dados I  -");
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
//                    System.out.println("Escolha o tamanho do vetor desejado:");
//                    System.out.println("1 - 4 Posições");
//                    System.out.println("2 - 8 Posições");
//                    System.out.println("3 - 20 Posições");
//                    System.out.println("0 - Sair");
                    int tamanho = Integer.parseInt(ler.nextLine());
                    vetor = CV.criarNovoVetor(tamanho);
                    break;
                case 2:
                    if (vetor == null) {
                        System.out.println("***************************************");
                        System.out.println("Você não possui um vetor para imprimir!");
                        System.out.println("***************************************");
                    } else {
                        for (int i = 0; i < vetor.length; i++) {
                            System.out.print("| " + vetor[i] + " ");
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
                        System.out.print("Digite o número a ser buscado: ");
                        int procurado = Integer.parseInt(ler.nextLine());
                        int resulBB = buscaB.buscaBinariaRecursiva(vetor, procurado, 0, vetor.length - 1);
                        int resulBS = buscaS.BuscaSeqRecursiva(vetor, vetor.length - 1, procurado);
                        if (resulBB == -1) {
                            System.out.println("*******************************************");
                            System.out.println("O número procurado não se encontra no vetor");
                            System.out.println("*******************************************");
                        } else {
                            System.out.println("O número " + procurado + " está...");
                            System.out.println("Na posição " + resulBB + " usando a Busca Binária");
                            System.out.println("Na posição " + resulBS + " usando a Busca Sequencial");
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
                        System.out.println("1 - Bubble Sort \n2- Merge Sort");
                        int ord = Integer.parseInt(ler.nextLine());
                        switch (ord) {
                            case 1:
                                vetor = bSort.bubbleSort(vetor);
                                break;
                            case 2:
                                vetor = mSort.MergeSort(vetor,0,vetor.length);
                                break;

                            case 0:
                                break;
                            default:
                                break;
                        }
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
                case 0:
                    System.exit(0);
                    break;
                case 10:
                    System.out.println("Informe o tamanho do vetor");
                    int tam = Integer.parseInt(ler.nextLine());
                    media.mediaGeral(tam);
                    break;

                default:
                    System.out.println("*******************************");
                    System.out.println("Opção Inválida, Tente Novamente");
                    System.out.println("*******************************");
                    break;
            }
        }
    }
}
