/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.estruturasDeDados.Fila;

/**
 * Classe que modela um nó, como atributos possui a referência tanto para o nó
 * anterior quanto para o próximo, e guarda algum conteúdo(Object).
 *
 * @author rafael
 * @param <T>
 */
public class No<T> {

    private T Chave = null;
    private No<T> Prox = null;
    private No<T> Ant = null;

    /**
     * Retorna o próximo nó, em relação ao atual.
     *
     * @return T
     */
    public No<T> getProx() {
        return Prox;
    }

    /**
     * Seta no nó atual, a referência para o próximo nó.
     *
     * @param Prox
     */
    public void setProx(No<T> Prox) {
        this.Prox = Prox;
    }

    /**
     * Retorna o conteúdo do objeto.
     *
     * @return int
     */
    public T getChave() {
        return Chave;
    }

    /**
     * Seta o conteúdo do objeto.
     *
     * @param Chave
     */
    public void setChave(T Chave) {
        this.Chave = Chave;
    }

    /**
     * Retorna o nó anterior, em relação ao atual.
     *
     * @return T
     */
    public No<T> getAnt() {
        return Ant;
    }

    /**
     * Seta no nó atual, a referência para o nó anterior.
     *
     * @param Ant
     */
    public void setAnt(No<T> Ant) {
        this.Ant = Ant;
    }

}
