/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.controlle;

import br.nasa.viagemAmarte2020.estruturasDeDados.Lista.Lista;
import br.nasa.viagemAmarte2020.modal.Astronauta;
import br.nasa.viagemAmarte2020.modal.Experimento;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rafael
 */
public class RetornoATerra extends Astronauta {

    public List<Experimento> retornoLista() {
        List<Experimento> listaExperimento = new ArrayList<>();
        while (pilha.getTopo() <= 0) {
            listaExperimento.add(pilha.passaExperimentoParaLista());
        }
        return listaExperimento;
    }
}
