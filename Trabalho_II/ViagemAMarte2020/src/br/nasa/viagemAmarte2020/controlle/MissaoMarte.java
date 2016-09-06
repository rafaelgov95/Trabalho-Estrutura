/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.controlle;

import br.nasa.viagemAmarte2020.estruturasDeDados.Lista.Lista;
import br.nasa.viagemAmarte2020.estruturasDeDados.Pilha.PilhaDeTesteDaNasa;
import br.nasa.viagemAmarte2020.modal.Astronauta;
import br.nasa.viagemAmarte2020.modal.Cientista;
import br.nasa.viagemAmarte2020.modal.Experimento;

import java.util.Random;

/**
 *
 * @author rafael
 */
public class MissaoMarte {

    Lista<Experimento> listaExperimento;

    public Astronauta astronauta;

    //futuramente aqui sera uma fila de cientistas
    public Cientista cientistas[];

    public MissaoMarte(int n) {
        listaExperimento = new Lista();
        astronauta = new Astronauta();
        contrataCientistas(n);
        criarPilhaDeTeste(n);
    }

    private void contrataCientistas(int n) {
        cientistas = new Cientista[n];
        for (int i = 0; i < n; i++) {
            Cientista cient = new Cientista(i);
            cientistas[i] = cient;
        }
    }

    private void criarPilhaDeTeste(int n) {
        astronauta.pilha = new PilhaDeTesteDaNasa(n);
        for (int i = 0; i < n; i++) {
            Experimento exp = new Experimento();
            exp.numero = i;
            astronauta.pilha.adicionarExperimento(exp);
        }
        for (Experimento exp : astronauta.pilha.pilhaDeExperimentoDaNasa) {
            System.out.println("Experimento no Array da  Pilha : " + exp.numero);
        }
    }

    public void ProcessaDadosEmSoloMarciano() {
        Random gerador = new Random();
        while (astronauta.pilha.getindex() > 0) {
            Experimento exp = (Experimento) astronauta.pilha.desempilha();
            exp.resultado = gerador.nextBoolean();
            listaExperimento.addFinal(exp);
        }
        System.out.println("Lista de Experimentos");
        for (int i = 1; i < listaExperimento.getIndex(); i++) {
            System.out.println("Experimento : " + listaExperimento.buscar(i).numero);
        }
    }

    public void RetornoDeMarteComOsTestes() {
        for (Cientista cientista : cientistas) {
            int j = 1;
            boolean achou = false;
            while (j < (listaExperimento.getIndex()) || achou == false) {
                if (cientista.numeroDoExperimento == listaExperimento.buscar(j).numero) {
                    cientista.recebeExperimento((Experimento) listaExperimento.buscar(j));
                    achou = true;
                    listaExperimento.remove(j);
                }
                j++;
            }
        }
//        System.out.println("Cientista com numero " + cientistas[0].numeroDoExperimento + " Com o experimento" + cientistas[0].exp.numero);
//        System.out.println("Cientista com numero " + cientistas[1].numeroDoExperimento + " Com o experimento" + cientistas[1].exp.numero);
//        
        for (Cientista cientista : cientistas) {

            System.out.println("Cientista com numero " + cientista.numeroDoExperimento + " Com o experimento" + cientista.exp.numero);
        }
    }

}
