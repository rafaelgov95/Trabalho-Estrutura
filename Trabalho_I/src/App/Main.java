/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Controlle.Controlle;
import java.io.IOException;


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
