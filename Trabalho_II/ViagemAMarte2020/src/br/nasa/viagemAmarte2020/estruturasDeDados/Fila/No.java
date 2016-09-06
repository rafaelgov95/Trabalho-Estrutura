/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.estruturasDeDados.Fila;

/**
 *
 * @author rafael
 */
public class No<T> {

    public No<T> getProx() {
        return Prox;
    }

    public void setProx(No<T> Prox) {
        this.Prox = Prox;
    }

    public T getChave() {
        return Chave;
    }

    public void setChave(T Chave) {
        this.Chave = Chave;
    }

    private No<T> Prox = null;
    private No<T> Ant = null;

    public No<T> getAnt() {
        return Ant;
    }

    public void setAnt(No<T> Ant) {
        this.Ant = Ant;
    }
    private T Chave = null;
}
