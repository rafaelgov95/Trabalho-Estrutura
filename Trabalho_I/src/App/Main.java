/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.util.Scanner;

/**
 *
 * @author Higor - PC
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        while (true) {
            
            System.out.println("-------------------------------------");
            System.out.println("-  Trabalho - Estrutura de Dados I  -");
            System.out.println("-------------------------------------");
            System.out.println("Escolha o tamanho do vetor desejado:");
            System.out.println("1 - 4 Posições");
            System.out.println("2 - 8 Posições");
            System.out.println("3 - 20 Posições");
            System.out.println("0 - Sair");
            
            int opcao = Integer.parseInt(ler.nextLine());
            
            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0: 
                    break;
                default:
                    break;                
            }

        }

    }
    
    public int[] criarVetor(int n){      
        int[] vetor = new int[n];
        return vetor;       
    }
}
