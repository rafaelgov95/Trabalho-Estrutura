/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.estruturasDeDados.Lista;

/**
 *
 * @author rafael
 */
public class No<T> {

    private T chave;
    private No<T> prox;
    private No<T> ant;

    public T getChave() {
        return chave;
    }

    public void setChave(T chave) {
        this.chave = chave;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

}
