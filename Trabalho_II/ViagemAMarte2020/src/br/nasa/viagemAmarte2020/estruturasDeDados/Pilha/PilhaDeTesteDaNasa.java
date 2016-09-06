/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.estruturasDeDados.Pilha;

import br.nasa.viagemAmarte2020.modal.Experimento;

/**
 * Classe que modela uma pilha. Possui um vetor de experimentos e um tamanho.
 *
 * @author rafael
 */
public class PilhaDeTesteDaNasa {

    public Experimento pilhaDeExperimentoDaNasa[];
    private int index;

    /**
     * Retorna o tamanho da pilha.
     *
     * @return int
     */
    public int getindex() {
        return this.index;
    }

    /**
     * Construtor da classe, recebe um inteiro n, e inicializa o vetor
     * pilhaDeExperimentosDaNasa com n posições.
     *
     * @param n
     */
    public PilhaDeTesteDaNasa(int n) {
        pilhaDeExperimentoDaNasa = new Experimento[n];
        index = 0;
    }

    /**
     * Método empilhar: Testa se a pilha está nula, se sim, adiciona o
     * experimento na ultima posição do vetor, se não, exibe uma mensagem para
     * inicialização do vetor.
     *
     * @param exp
     */
    public void adicionarExperimento(Experimento exp) {
        if (pilhaDeExperimentoDaNasa != null) {
            if (index < pilhaDeExperimentoDaNasa.length) {
                pilhaDeExperimentoDaNasa[index] = exp;
                index++;
            } else {
                System.out.println("OverFlow!!");
            }
        } else {

            System.out.println("Por favor Inicialize sua Pilha SOLDADO");

        }
    }

    /**
     * Método para desempilhar: Testa se o vetor é nulo, se sim, exibe uma
     * mensagem para inicialização do mesmo, se não, guarda a útlimo elemento da
     * pilha, para após removê-lo, poder retorná-lo.
     *
     * @return
     */
    public Experimento desempilha() {

        if (pilhaDeExperimentoDaNasa != null) {
            if (index > 0) {
                Experimento exp;
                exp = (Experimento) pilhaDeExperimentoDaNasa[(index - 1)];
                this.index--;
                return exp;
            } else {
                System.out.println("UnderFlow!!");
            }
        } else {
            System.out.println("Por favor Inicialize sua Pilha SOLDADO");
        }
        return null;
    }

}
