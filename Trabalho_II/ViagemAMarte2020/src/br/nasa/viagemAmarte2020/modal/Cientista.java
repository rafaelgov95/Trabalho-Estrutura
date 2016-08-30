/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.modal;

/**
 *
 * @author rafael
 */
public class Cientista {

    public int numeroDoExperimento;
    public Experimento exp;

    public Cientista(int numeroDoExperimento) {
        this.numeroDoExperimento = numeroDoExperimento;
    }

    public void recebeExperimento(Experimento exp) {
     
        this.exp = (Experimento)exp;
    }

    public void MostraResultado() {
        if (exp.resultado) {
            System.out.println("EXPERIMENTO FOI APROVADO");
        } else {
            System.out.println("EXPERIMENTO FALHO");
        }
    }
}