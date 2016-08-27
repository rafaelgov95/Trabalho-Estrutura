/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.estruturasDeDados.Pilha;

import br.nasa.viagemAmarte2020.modal.Experimento;

/**
 *
 * @author rafael
 */
public class PilhaDeTesteDaNasa {

    private Experimento pilhaDeExperimentoDaNasa[];
    private int topo;
    public int tamanho;

    public int getTopo() {
        return topo;
    }

    public PilhaDeTesteDaNasa(int n) {
        pilhaDeExperimentoDaNasa = new Experimento[n];
        topo = 0;
        tamanho = n;
    }

    public void adicionarExperimento(Experimento exp) {
        if (pilhaDeExperimentoDaNasa != null) {
            if (topo < pilhaDeExperimentoDaNasa.length) {
                topo++;
                pilhaDeExperimentoDaNasa[topo] = exp;
            } else {
                System.out.println("OverFlow!!");
            }
        } else {

            System.out.println("Por favor Inicialize sua Pilha SOLDADO");

        }
    }

    public Experimento desempilha() {

        if (pilhaDeExperimentoDaNasa != null) {
            if (topo > 0) {
                Experimento exp= new Experimento();
                exp = pilhaDeExperimentoDaNasa[topo];
                this.topo--;
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
