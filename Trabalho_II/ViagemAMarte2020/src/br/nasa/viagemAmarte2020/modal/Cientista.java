/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.modal;

/**
 * Classe que modela um Cientista. Possui como atributos um número para
 * identificar seu experimento, e o próprio experimento.
 *
 * @author rafael
 */
public class Cientista {

    public int numeroDoExperimento;
    public Experimento exp;

    /**
     * Construtor da classe: Recebe um inteiro, e seta-o como o número de
     * identificação do seu experimento.
     *
     * @param numeroDoExperimento
     */
    public Cientista(int numeroDoExperimento) {
        this.numeroDoExperimento = numeroDoExperimento;
    }

    /**
     * Setar experimento: Recebe e seta o experimento.
     *
     * @param exp
     */
    public void recebeExperimento(Experimento exp) {

        this.exp = (Experimento) exp;
    }

    /**
     * Exibir resultado: Exibe uma mensagem de aprovação ou reprovação,
     * dependendo do valor que estiver na variável resultado de seu experimento.
     */
    public void MostraResultado() {
        if (exp.resultado) {
            System.out.println("EXPERIMENTO FOI APROVADO");
        } else {
            System.out.println("EXPERIMENTO FALHO");
        }
    }
}
