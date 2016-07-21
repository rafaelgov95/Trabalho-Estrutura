/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

public class MetodoTrocar {    
    /**
     * Método usado para trocar dois elementos em um vetor
     * @param vet Vetor que será realizada a troca
     * @param a Posição de um valor a ser trocado
     * @param b Posição de um valor a ser trocado
     * @return int[] Retorna o vetor com os valores trocados
     */
    public int[] MetodoTrocar(int vet[], int a, int b) {        
        int aux = vet[a];
        vet[a] = vet[b];
        vet[b] = aux;      
        return vet;
    }
}
