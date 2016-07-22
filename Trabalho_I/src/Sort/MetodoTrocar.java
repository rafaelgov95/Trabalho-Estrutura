/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

public class MetodoTrocar {
    
   /**
     * Método de para Troca de Valores.
     * @param vet Vetor onde Sera feita a troca de valores.
     * @param a valor a
     * @param b valor b
     * @return return Vetor
     */
    public int[] MetodoTrocar(int vet[], int a, int b) {
        
        int aux = vet[a];
        vet[a] = vet[b];
        vet[b] = aux;
        
        return vet;
    }
}
