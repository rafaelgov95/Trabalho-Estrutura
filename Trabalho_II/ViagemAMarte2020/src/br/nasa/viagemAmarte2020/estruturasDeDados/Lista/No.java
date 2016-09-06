/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.estruturasDeDados.Lista;

/**
 * Classe que modela um nó, como atributos possui a referência tanto para o nó
 * anterior quanto para o próximo, e guarda algum conteúdo(Object).
 *
 * @author rafael
 * @param <T>
 */
public class No<T> {

    private T chave;
    private No<T> prox;
    private No<T> ant;

    /**
     * Retorna o conteúdo do objeto.
     *
     * @return int
     */
    public T getChave() {
        return chave;
    }

    /**
     * Seta o conteúdo do objeto.
     *
     * @param chave
     */
    public void setChave(T chave) {
        this.chave = chave;
    }

    /**
     * Retorna o próximo nó, em relação ao atual.
     *
     * @return T
     */
    public No getProx() {
        return prox;
    }

    /**
     * Seta no nó atual, a referência para o próximo nó.
     *
     * @param prox
     */
    public void setProx(No prox) {
        this.prox = prox;
    }

    /**
     * Retorna o nó anterior, em relação ao atual.
     *
     * @return T
     */
    public No getAnt() {
        return ant;
    }

    /**
     * Seta no nó atual, a referência para o nó anterior.
     *
     * @param ant
     */
    public void setAnt(No ant) {
        this.ant = ant;
    }

}
