/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busca;

import Vetor.Vetor;

/**
 *
 * @author Higor - PC
 */
public class BuscaBinaria extends Vetor {

    /**
     * Método de busca binária recursivo, onde é passado
     * um vetor, o numero a ser buscado, e o as posições
     * inicio e fim do vetor, como resultado, é retornado 
     * um inteiro, que indica a posição do número buscado
     * no vetor. Caso o retorno seja -1, o número buscado, 
     * não está no vetor.
     * @param vetor  O vetor que será usado na busca
     * @param procurado  Número a ser procurado
     * @param inicio  A posição inicial do vetor
     * @param fim  A posição final do vetor
     * @return int  Posição do número procurado
     */
    public int buscaBinariaRecursiva(int vetor[], int procurado, int inicio, int fim) {

        int meio = (inicio + fim) / 2;
        int valorMeio = vetor[meio];

        if (inicio > fim) {
            comparacao++;
            return -1;
        } else if (valorMeio == procurado) {// se o valor do meio for igual ao valor informado pelo usuário..
            comparacao = comparacao + 2;
            return meio;//retorna a média do vetor, senão...
        } else if (valorMeio > procurado) {//se o valor do meio for menor que o valor informado pelo usuário..
            comparacao = comparacao + 3;
            return buscaBinariaRecursiva(vetor, procurado, inicio, meio - 1);//retorna o valor das variavéis somando 1 na media e o maior, senão..
        } else {
            comparacao = comparacao + 3;
            return buscaBinariaRecursiva(vetor, procurado, meio + 1, fim);//retorna os valores das variáveis tirando 1 da média e o menor.
        }

    }

}
