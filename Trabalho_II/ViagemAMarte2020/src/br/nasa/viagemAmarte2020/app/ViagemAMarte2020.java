/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nasa.viagemAmarte2020.app;

import br.nasa.viagemAmarte2020.controlle.MissaoMarte;
import br.nasa.viagemAmarte2020.modal.Astronauta;
import br.nasa.viagemAmarte2020.modal.Cientista;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rafael
 */
public class ViagemAMarte2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(leia.readLine());
        //MISSAO MARTE 
        // Prepara Testes para ver se existe agua em marte e possivel colinizacao.
        
        MissaoMarte missaoMarte = new MissaoMarte(n);
        //Cientistas Sao Contratados para criar uma Civilização em marte Denominada Deaudst na lingua
        //perdida de Arquimeos, onde foi contestado a existencia de outras civilizacoes OVN.
        
        System.out.println("Informe a Quantidade de Testes Realizados");
           
        // Partiu MissaoMarte       
        // Em Marte
        missaoMarte.ProcessaDadosEmSoloMarciano();
        //Precesamento dos Testes. 
        missaoMarte.RetornoDeMarteComOsTestes();
        
       //Imprimi os testes
        for (int i = 0; i < n-1; i++) {
            System.out.println(missaoMarte.cientistas[i]);   
        }
        

    }

}
