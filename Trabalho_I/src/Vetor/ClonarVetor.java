/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor;

/**
 *
 * @author Higor - PC
 */
public class ClonarVetor {

    public int[] clonarVetor(int vetor_original[]) {
        int novo_vetor[] = new int[vetor_original.length ];
        for (int i = 0; i < vetor_original.length; i++) {
            novo_vetor[i] = vetor_original[i];
        }
        return novo_vetor;
    }

}
