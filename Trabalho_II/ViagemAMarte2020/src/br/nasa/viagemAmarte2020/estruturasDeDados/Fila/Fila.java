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
    private No<T> ptr_primeiro;

    private Integer index = null;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void enfileira(T qualquercoisa) {
        if (index == null) {
            index = 0;
            No<T> novoNo = new No<>();
            novoNo.setChave(qualquercoisa);
            novoNo.setProx(null);
            ptr_primeiro = ptr_ultimo = novoNo;
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

    public void imprimir() {
        if (index != null && index > 0) {
            System.out.println(ptr_primeiro.getChave());
            No<T> aux = ptr_primeiro.getProx();
            while (aux != null && !aux.equals(ptr_primeiro)) {
                System.out.println(aux.getChave());
                aux = aux.getProx();
            }
        } else {
            System.out.println("Fila Vazia");
        }
    }

    public T espia() {
        if (index > 0 && index != null) {
            return ptr_primeiro.getChave();
        } else {
           
            return null;
        }
    }

    public T desenfileira() {
        if (index > 0 && index != null) {
            No<T> novoNo = ptr_primeiro;
            ptr_primeiro = ptr_primeiro.getProx();
            index--;
            return novoNo.getChave();
        } else {
            System.out.println("Undeflow");
            return null;
        }
    }

}
