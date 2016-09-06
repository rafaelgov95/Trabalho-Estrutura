/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.app;

import br.nasa.viagemAmarte2020.controlle.MissaoMarte;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe Main do trabalho.
 * Responsável apenas por criar o controlador do programa,
 * e chamar os métodos de exibição dos resultados.
 * Irá ler um inteiro n, que indica a quantidade de testes a serem realizados,
 * e passa-o como parâmetro na criação do controlador MissaoMarte.
 * @author rafael
 */
public class ViagemAMarte2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Informe a Quantidade de Testes Realizados");
        int n = Integer.parseInt(leia.readLine());
        //MISSAO MARTE 
        // Prepara Testes para ver se existe agua em marte e possivel colinizacao.

        MissaoMarte missaoMarte = new MissaoMarte(n);

        //Cientistas Sao Contratados para criar uma Civilização em marte Denominada Deaudst na lingua
        //perdida de Arquimeos, onde foi contestado a existencia de outras civilizacoes OVN.
        // Partiu MissaoMarte       
        // Em Marte
        missaoMarte.ProcessaDadosEmSoloMarciano();
        //Precesamento dos Testes. 
        missaoMarte.RetornoDeMarteComOsTestes();

    }

}
