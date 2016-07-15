/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor;

import java.util.Random;

/**
 *
 * @author Higor - PC
 */
public class Vetor {

  public int permutacao ;
    public int troca ;

    public int[] criarNovoVetor(int tamanho) {
//
//        int n = 0;
//
//        switch (tamanho) {
//            case 1:
//                n = 4;
//                break;
//            case 2:
//                n = 8;
//                break;
//            case 3:
//                n = 20;
//                break;
//            case 0:
//                return null;
//            default:
//                System.out.println("Opção Inválida");
//                break;
//        }

        int vetor[] = new int[tamanho];

        Random gerador = new Random();
        for (int i = 0; i < vetor.length-1; i++) {
            vetor[i] = gerador.nextInt(1001);
        }
        return vetor;
    }

}
