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
public class Lista<T> {

    private No<T> ptr_primeiro;
    private No<T> ptr_ultimo;
    private int index;

    public int getIndex() {
        return index;
    }

    public Lista() {
        ptr_primeiro = null;
        ptr_ultimo = null;
        index = 0;
    }

    public void addFinal(T qualquercoisa) {
        if (ptr_primeiro == null) {
            ptr_primeiro = new No<>();
            No<T> novoNo = new No<>();
            novoNo.setChave(qualquercoisa);
            novoNo.setProx(novoNo);
            novoNo.setAnt(novoNo);
            ptr_ultimo = ptr_primeiro = novoNo;
            index++;
        } else {
            No<T> novoNo = new No<>();
            novoNo.setChave(qualquercoisa);
            novoNo.setProx(ptr_primeiro);
            novoNo.setAnt(ptr_ultimo);
            ptr_ultimo.setProx(novoNo);
            ptr_ultimo = novoNo;
            index++;
        }

    }

    public void addPrimeira(T qualquercoisa) {
        if (ptr_primeiro == null) {
            ptr_primeiro = new No<>();
            No<T> novoNo = new No<>();
            novoNo.setChave(qualquercoisa);
            novoNo.setProx(novoNo);
            novoNo.setAnt(novoNo);
            ptr_ultimo = ptr_primeiro = novoNo;
            index++;
        } else {
            No<T> novoNo = new No<>();
            novoNo.setChave(qualquercoisa);
            novoNo.setProx(ptr_primeiro);
            novoNo.setAnt(ptr_ultimo);
            ptr_ultimo.setProx(novoNo);
            ptr_primeiro = novoNo;
            index++;
        }

    }

    public void imprimir() {
        if (index > 0) {
            System.out.println(ptr_primeiro.getChave());
            No<T> aux = ptr_primeiro.getProx();
            while (!aux.equals(ptr_primeiro)) {
                System.out.println(aux.getChave());
                aux = aux.getProx();
            }
        } else {
            System.out.println("Lista Vazia");
        }
    }

    public T buscar(int i) {
        No<T> percorre = ptr_primeiro;
        if (index > 0) {
            int j = 1;
            while (j <= i) {
                if (i == j) {

                    return percorre.getChave();
                } else {
                    percorre = percorre.getProx();
                }
                j++;
            }
        }
        return null;
    }

    public No<T> buscarAnt(int i) {
        if (i == 1) {
            return ptr_ultimo;
        } else if (index == i) {
            return ptr_ultimo.getAnt();
        } else {
            No<T> percorre = ptr_primeiro;
            if (index > 0) {
                int j = 1;
                while (j <= i) {
                    if (i == j) {
                        return percorre.getAnt();
                    } else {
                        percorre = percorre.getProx();
                    }
                    j++;
                }
            }
            return null;
        }
    }

    public boolean removeFim() {
        if (index == 1) {
            removeInicio();
        } else if (index > 0) {
            ptr_ultimo.getAnt().setProx(ptr_primeiro);
            ptr_primeiro.setAnt(ptr_ultimo.getAnt());
            ptr_ultimo = ptr_ultimo.getAnt();
            index--;
            return true;
        }
        return false;
    }

    public boolean removeInicio() {
        if (index > 0) {
            ptr_primeiro.getProx().setAnt(ptr_ultimo);
            ptr_ultimo.setProx(ptr_primeiro.getProx());
            ptr_primeiro = ptr_primeiro.getProx();
            index--;
            return true;
        }
        return false;
    }

    public boolean remove(int i) {
        if (i == 0) {
            removeInicio();
        } else if (i >= index) {
            removeFim();
        } else {

        }
        return false;
    }

    public void add(int i, T qualquercoisa) {
        if (ptr_primeiro != null) {
            if (i >= index) {
                addFinal(qualquercoisa);
            } else if (i == (index - (index - 1))) {
                addPrimeira(qualquercoisa);
            } else if (i < index) {
                int j = 1;
                while (j < i) {
                    if (i == j) {
                        No<T> novoNo = new No<>();

                    } else {

                    }
                    j++;
                }
            }

        } else {
            System.out.println("Nao foi possivel alocar");
        }

    }
}
