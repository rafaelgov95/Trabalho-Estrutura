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
// mudado Experimento para public para testes;
   public Experimento pilhaDeExperimentoDaNasa[];
    private int index;
    public int tamanho;

    public int getindex() {
        return this.index;
    }

    public PilhaDeTesteDaNasa(int n) {
        pilhaDeExperimentoDaNasa = new Experimento[n];
        index = 0;
    }

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

    public Experimento desempilha() {

        if (pilhaDeExperimentoDaNasa != null) {
            if (index>0) {

                Experimento exp;
                exp = (Experimento)pilhaDeExperimentoDaNasa[(index-1)];
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
