/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busca;

/**
 *
 * @author Higor - PC
 */
public class BuscaBinaria {
    
    public int buscaBinariaRecursiva(int vetor[], int buscar, int esq, int dir) {

        int meio = (esq + dir) / 2;
        int valorMeio = vetor[meio];

        if (esq > dir) {
            return -1;
        } else if (valorMeio == buscar) {// se o valor do meio for igual ao valor informado pelo usuário..
            return meio;//retorna a média do vetor, senão...
        } else if (valorMeio > buscar) {//se o valor do meio for menor que o valor informado pelo usuário..
            return buscaBinariaRecursiva(vetor, buscar, esq, meio - 1);//retorna o valor das variavéis somando 1 na media e o maior, senão..
        } else {
            return buscaBinariaRecursiva(vetor, buscar, meio + 1, dir);//retorna os valores das variáveis tirando 1 da média e o menor.
        }

    }
    
}