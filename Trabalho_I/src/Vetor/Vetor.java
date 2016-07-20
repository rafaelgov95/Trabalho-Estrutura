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

    public int comparacao = 0;
    public int permutacao = 0;

    public int[] criarNovoVetor(int tamanho) {

        int vetor[] = new int[tamanho];
        Random gerador = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(1001);
        }
        return vetor;
    }

}
