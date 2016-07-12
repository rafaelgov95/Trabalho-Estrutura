/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Vetor.CriarVetor;
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

        CriarVetor CV = new CriarVetor();

        while (true) {

            System.out.println("-------------------------------------");
            System.out.println("-  Trabalho - Estrutura de Dados I  -");
            System.out.println("-------------------------------------");
            System.out.println("Digite a opção Desejada");
            System.out.println("1 - Criar novo vetor");
            System.out.println("2 - Imprimir meu vetor");
            System.out.println("0 - Sair");

            int opcao = Integer.parseInt(ler.nextLine());

            switch (opcao) {
                case 1:
                    if (vetor != null) {
                        System.out.println("Você já possui um vetor, tem certeza que deseja substituí-lo?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");
                        int s_n = Integer.parseInt(ler.nextLine());
                        if (s_n == 1) {
                            System.out.println("Escolha o tamanho do vetor desejado:");
                            System.out.println("1 - 4 Posições");
                            System.out.println("2 - 8 Posições");
                            System.out.println("3 - 20 Posições");
                            System.out.println("0 - Sair");
                            int tamanho = Integer.parseInt(ler.nextLine());
                            vetor = CV.criarNovoVetor(tamanho);
                        } else if (s_n == 2) {
                            break;
                        }
                    } else {
                        System.out.println("Escolha o tamanho do vetor desejado:");
                        System.out.println("1 - 4 Posições");
                        System.out.println("2 - 8 Posições");
                        System.out.println("3 - 20 Posições");
                        System.out.println("0 - Sair");
                        int tamanho = Integer.parseInt(ler.nextLine());
                        vetor = CV.criarNovoVetor(tamanho);
                    }
                    break;
                case 2:
                    try {
                        for (int i = 0; i < vetor.length; i++) {
                            System.out.print("| " + vetor[i] + " ");
                        }
                        System.out.print("|\n");
                    } catch (NullPointerException ex) {
                        System.out.println("Você não possui um vetor para imprimir!");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida, Tente Novamente");
                    break;
            }
        }
    }
}
