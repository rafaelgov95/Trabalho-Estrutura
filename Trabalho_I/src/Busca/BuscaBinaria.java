/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busca;

import Util.InterfaceTesteSort;
import Vetor.Vetor;

/**
 *
 * @author Higor - PC
 */
public class BuscaBinaria extends Vetor {

    private long tempInicial;

    public void b(int[] arr, int buscado) {
        int p = 0;
        int r = arr.length - 1;
        int lixo = busca(arr, buscado, p, r);

    }

    public int busca(int vetor[], int buscar, int esq, int dir) {

        int meio = (esq + dir) / 2;
        int valorMeio = vetor[meio];

        if (esq > dir) {
            comparacao++;
            return -1;
        } else if (valorMeio == buscar) {// se o valor do meio for igual ao valor informado pelo usuário..
            comparacao = comparacao + 2;
            return meio;//retorna a média do vetor, senão...
        } else if (valorMeio > buscar) {//se o valor do meio for menor que o valor informado pelo usuário..
            comparacao = comparacao + 3;
            return busca(vetor, buscar, esq, meio - 1);//retorna o valor das variavéis somando 1 na media e o maior, senão..
        } else {
            comparacao = comparacao + 3;
            return busca(vetor, buscar, meio + 1, dir);//retorna os valores das variáveis tirando 1 da média e o menor.
        }

    }

    public double getRuntime(int[] valor, int procurado) {
        this.tempInicial = System.nanoTime();
        b(valor, procurado);
        double tempo = System.nanoTime() - tempInicial;
        return (double) (tempo / 1000000000.0);

    }

}
