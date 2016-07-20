/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Media.Media;
import Busca.BuscaBinaria;
import Busca.BuscaSequencialR;
import Controlle.Controlle;
import Sort.BubbleSort;
import Sort.MergeSort;
import Util.GravarLog;
import Util.Teste;
import Vetor.ClonarVetor;
import Vetor.Vetor;
import View.Menu;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Higor - PC
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Controlle AppController = new Controlle();
        while (true) {
            AppController.App();
        }
    }
}
