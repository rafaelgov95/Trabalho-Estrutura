/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.estruturasDeDados.Fila;

/**
 *
 * @author rafael
 * @param <T>
 */
public class Fila<T> {

    private No<T> ptr_ultimo;
    private Integer index = null;

    public void enfileira(T qualquercoisa) {
        if (index == null) {
            index = 0;
            No<T> novoNo = new No<>();
            novoNo.setChave(qualquercoisa);
            novoNo.setProx(null);
            ptr_ultimo = novoNo;
            index++;
        } else {
            No<T> novoNo = new No<>();
            novoNo.setChave(qualquercoisa);
            novoNo.setProx(null);
            novoNo.setAnt(ptr_ultimo);
            ptr_ultimo.setProx(novoNo);
            ptr_ultimo = novoNo;
            index++;
        }

    }

    public T desenfileira() {
        if (index > 0) {
            No<T> novoNo = ptr_ultimo;
            ptr_ultimo = ptr_ultimo.getAnt();
            return novoNo.getChave();
        } else {
            System.out.println("Undeflow");
            return null;
        }
    }

}
