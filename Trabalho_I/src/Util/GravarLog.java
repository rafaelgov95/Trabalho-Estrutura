/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.BufferedWriter;
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
public class GravarLog {

    static int cont;

    public void ZerarArquivos() {
    }

    public void escreverNoLog(String log) throws IOException {
        cont++;
        String dir = System.getProperty("user.home");
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(dir+"/log.txt",true))) {
            escritor.append(String.valueOf("\"------------------------------------------------------\nLog de Numero: "+(cont++)+"\n"+"Criado Em: "+(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date()))+"\n\n"+ log)+"-----------------------------------------------------\n");
            escritor.newLine();
        }
    }
}
