/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.modal;

import br.nasa.viagemAmarte2020.estruturasDeDados.Pilha.PilhaDeTesteDaNasa;
import java.util.Random;

/**
 *
 * @author rafael
 */
public class Astronauta {
  protected PilhaDeTesteDaNasa pilha;
    public void criarPilhaDeTeste(int n) {
        pilha = new PilhaDeTesteDaNasa(n);
        Random gerador = new Random();
        while(pilha.getTopo()<=0){
            Experimento exp = new  Experimento();
            exp.numero=gerador.nextInt();
            pilha.adicionarExperimento(exp);
        }
    }
    
    
}
