/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.controlle;

import br.nasa.viagemAmarte2020.estruturasDeDados.Fila.Fila;
import br.nasa.viagemAmarte2020.estruturasDeDados.Lista.Lista;
import br.nasa.viagemAmarte2020.estruturasDeDados.Pilha.PilhaDeTesteDaNasa;
import br.nasa.viagemAmarte2020.modal.Astronauta;
import br.nasa.viagemAmarte2020.modal.Cientista;
import br.nasa.viagemAmarte2020.modal.Experimento;

import java.util.Random;

/**
 * Classe que controlará todas as outras. Possui um astronauta, uma lista de
 * cientistas e uma lista de experimentos.
 *
 * @author rafael
 */
public class MissaoMarte {

    Lista<Experimento> listaExperimento;
    Fila<Cientista> filaCientistas;
    public Astronauta astronauta;

    /**
     * Construtor da classe: Recebe um inteiro n. Instacia a lista de
     * experimentos, e um astronauta, chama os métodos para criar n cientistas,
     * e n testes.
     *
     * @param n
     */
    public MissaoMarte(int n) {
        filaCientistas = new Fila();
        listaExperimento = new Lista();
        astronauta = new Astronauta();
        contrataCientistas(n);
        criarPilhaDeTeste(n);
    }

    /**
     * Método para criar cientistas: Recebe um inteiro n, cria n cientistas e
     * adiciona-os ao vetor cientistas.
     *
     * @param n
     */
    private void contrataCientistas(int n) {

        for (int i = 0; i < n; i++) {
            Cientista cientista = new Cientista(i);
            filaCientistas.enfileira(cientista);
        }
    }

    /**
     * Método para criar Experimentos: Recebe um inteiro n, cria n testes e
     * adiciona-os a lista de teste do astronauta. Ao final, exibe a
     * identificação de cada experimento criado.
     *
     * @param n
     */
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

    /**
     * Método para gerar o resultado dos testes: Seta no resultado de cada
     * teste, um boolean, que é criado aleatoriamente. Em seguida, exibe o
     * número identificador de cada experimento.
     */
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

    /**
     * Método que combina cada cientista com seu respectivo experimento:
     * Percorre a lista de cientistas e a lista de experimentos, a cada
     * combinação feita, o experimento é removido da lista de experimentos. Em
     * seguida, exibe para cada cientista seu o número de identificação dele em
     * relação ao experimento, e o número de identificação do próprio
     * experimento.
     */
    public void RetornoDeMarteComOsTestes() {
        while (filaCientistas.espia() != null) {
            int j = 1;
            boolean achou = false;
            while (j < (listaExperimento.getIndex()) || achou == false) {
                if (filaCientistas.espia().numeroDoExperimento == listaExperimento.buscar(j).numero) {
                    filaCientistas.espia().recebeExperimento((Experimento) listaExperimento.buscar(j));
                    achou = true;
                    System.out.println("Cientista com numero " + filaCientistas.espia().numeroDoExperimento + " com o experimento " + filaCientistas.espia().exp.numero + " Resultado foi: " + filaCientistas.espia().exp.resultado);

                    listaExperimento.remove(j);
                    filaCientistas.desenfileira();
                }

                j++;
            }

        }
//        System.out.println("Cientista com numero " + cientistas[0].numeroDoExperimento + " Com o experimento" + cientistas[0].exp.numero);
//        System.out.println("Cientista com numero " + cientistas[1].numeroDoExperimento + " Com o experimento" + cientistas[1].exp.numero);
//        
//        for (int i = 0; i < filaCientistas.getIndex(); i++) {
//
//            System.out.println("Cientista com numero " + filaCientistas.desenfileira().numeroDoExperimento + " Com o experimento" + filaCientistas.desenfileira().exp.numero);
//        }
    }

}
