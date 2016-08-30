/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.controlle;

import br.nasa.viagemAmarte2020.estruturasDeDados.Pilha.PilhaDeTesteDaNasa;
import br.nasa.viagemAmarte2020.modal.Astronauta;
import br.nasa.viagemAmarte2020.modal.Cientista;
import br.nasa.viagemAmarte2020.modal.Experimento;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rafael
 */
public class MissaoMarte {

    List<Experimento> listaExperimento;

    public Astronauta astronauta;

    //futuramente aqui sera uma fila de cientistas
    public Cientista cientistas[];

    public MissaoMarte(int n) {
        listaExperimento = new ArrayList<>();
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
          for (Experimento exp : astronauta.pilha.pilhaDeExperimentoDaNasa ) {
            System.out.println("Experimento Em Pilha : "+exp.numero);
        }
    }

    public void ProcessaDadosEmSoloMarciano() {
        Random gerador = new Random();
        while (astronauta.pilha.getindex() > 0) {
            Experimento exp = (Experimento) astronauta.pilha.desempilha();
            exp.resultado = gerador.nextBoolean();
            listaExperimento.add(exp);
        }
        System.out.println("Lista de Experimentos");
        for (Experimento exp : listaExperimento) {
            System.out.println("Experimento : "+exp.numero);
        }
    }

    public void RetornoDeMarteComOsTestes() {
        for (Cientista cientista : cientistas) {
            int j = 0;
            boolean achou = false;
            while (j < (listaExperimento.size() - 1) || achou == false) {
                if (cientista.numeroDoExperimento == listaExperimento.get(j).numero) {
                    cientista.recebeExperimento((Experimento) listaExperimento.get(j));
                    achou = true;
//                    System.out.println("deucerto" + listaExperimento.get(j).numero);
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
