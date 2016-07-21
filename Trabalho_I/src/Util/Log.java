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
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rafael
 */
public class Log extends Menu {
     
    static int cont;
    static String dir;

    public void ZerarArquivos() {

        File arq = new File(System.getProperty("user.home") + "/log.txt");
        if (arq.exists()) {
            arq.delete();
            logApagado();
        } else {
            logErro();
        }

    }

    public void escreverNoLog(String log) throws IOException {
        cont++;
        dir = System.getProperty("user.home");
        dir += "/log.txt";
        File arq = new File(dir);
        logSalvoInforma(dir);
        if (arq.exists()) {
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(dir, true))) {
                escritor.append(String.valueOf("\"------------------------------------------------------\nLog de Numero: " + (cont++) + "\n" + "Criado Em: " + (new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date())) + "\n\n" + log) + "-----------------------------------------------------\n");
                escritor.newLine();
            }
        } else {

            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(dir))) {
                escritor.append(String.valueOf("\"------------------------------------------------------\nLog de Numero: " + (cont++) + "\n" + "Criado Em: " + (new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date())) + "\n\n" + log) + "-----------------------------------------------------\n");
                escritor.newLine();
            }
        }
    }

    public void lerLog() throws FileNotFoundException, IOException {
        {
            File arq = new File(System.getProperty("user.home") + "/log.txt");
            if (arq.exists()) {
                try (BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home") + "/log.txt"))) {
                    while (br.ready()) {
                        String linha = br.readLine();
                        System.out.println(linha);
                    }

                }
            } else {
                logErro();
            }

        }
    }
}
