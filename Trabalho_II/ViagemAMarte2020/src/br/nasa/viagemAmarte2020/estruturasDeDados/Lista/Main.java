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
//        megaList.add(8, "S2love");
        megaList.imprimir();
        System.out.println("TESTES\n");
          System.out.println(megaList.buscarAnt(7).getChave());
//      
          System.out.println(megaList.buscarAnt(1).getChave());
          
//        System.out.println(megaList.buscar(1));
//        System.out.println(megaList.buscar(2));
//        System.out.println(megaList.buscar(3));
//        System.out.println(megaList.buscar(4));
//        System.out.println(megaList.buscar(5));
//        System.out.println(megaList.buscar(6));

    }

}
