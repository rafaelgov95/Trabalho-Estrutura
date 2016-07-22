/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import View.Menu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rafael
 */
public class Log extends Menu {

    Data data = new Data();
    static int cont;
    static String dir;

    /**
     * Método Limpa Arquivo de Log
     *
     */
    public void ZerarArquivos() {

        File arq = new File(System.getProperty("user.home") + "/log.txt");
        if (arq.exists()) {
            arq.delete();
            logApagado();
        } else {
            logErro();
        }

    }

    /**
     * Método Escreve no log
     *
     * @param log String para ser Salva
     */
    public void escreverNoLog(String log) throws IOException {
        cont++;
        dir = System.getProperty("user.home");
        dir += "/log.txt";
        File arq = new File(dir);
        logSalvoInforma(dir);
        if (arq.exists()) {
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(dir, true))) {
                escritor.append("Log de Numero: " + (cont++) + "\n-------------------------------------------------------------------------------------------------------\n" + "Criado Em: " + data.dataagora()+ "\n" + log + "\n-------------------------------------------------------------------------------------------------------\n");
                escritor.newLine();
            }
        } else {

            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(dir))) {
                escritor.append("Log de Numero: " + (cont++) + "\n-------------------------------------------------------------------------------------------------------\n" + "Criado Em: " + data.dataagora()+ "\n" + log + "\n-------------------------------------------------------------------------------------------------------\n");
                escritor.newLine();
            }
        }
    }

    /**
     * Método Ler no Arquivo de Log.
     */
    public void lerLog() throws FileNotFoundException, IOException {
        {
            File arq = new File(System.getProperty("user.home") + "/log.txt");
            if (arq.exists()) {
                try (BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home") + "/log.txt"))) {
                    logInicia();

                    while (br.ready()) {
                        String linha = br.readLine();
                        System.out.println(linha);

                    }
                    logFim();

                }
            } else {
                logErro();
            }

        }
    }
}
