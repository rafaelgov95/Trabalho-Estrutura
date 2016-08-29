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

    List<Experimento> listaExperimento = new ArrayList<>();

    public Astronauta astronauta;
    public Cientista cientistas[];

    public MissaoMarte(int n) {
        astronauta = new Astronauta();
        cientistas = new Cientista[n];
        criarPilhaDeTeste(n);
    }

    private void criarPilhaDeTeste(int n) {
        astronauta.pilha = new PilhaDeTesteDaNasa(n);
        int i = 0;
        while (astronauta.pilha.getTopo() <= 0) {
            Experimento exp = new Experimento();
            exp.numero = i;
            astronauta.pilha.adicionarExperimento(exp);
            i++;
        }
    }

    public void ProcessaDados() {
        Random gerador = new Random();
        while (astronauta.pilha.getTopo() <= 0) {
            Experimento exp = (Experimento) astronauta.pilha.desempilha();
            exp.resultado = gerador.nextBoolean();
            listaExperimento.add(exp);
        }

    }

    public void RetornoDeMarteComOsTestes() {
        for (int i = 0; i < (cientistas.length - 1); i++) {
            int j = 0;
            boolean achou = false;
            while ((j < (listaExperimento.size() - 1) && achou == false)) {
                if (cientistas[i].numeroDoExperimento == listaExperimento.get(j).numero) {
                    cientistas[i].exp = listaExperimento.get(j);
                    listaExperimento.remove(j);
                    j++;
                    achou = true;
                }

            }
        }

    }
}
