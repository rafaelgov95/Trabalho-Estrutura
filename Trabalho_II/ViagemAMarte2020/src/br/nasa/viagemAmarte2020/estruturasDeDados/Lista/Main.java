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
public class Main {

    public static void main(String[] args) {
        Lista<String> megaList = new Lista<>();
        megaList.addFinal("Rafael");
        megaList.addFinal("Leonardo");
        megaList.addFinal("Marcel");
        megaList.addFinal("Kleber");
        megaList.addFinal("Lucas");
        megaList.addFinal("Jessica");
        megaList.add(7, "S2love");
        megaList.remove(3);
        megaList.imprimir();
        System.out.println("TESTES\n");

    }

}
