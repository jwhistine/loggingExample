/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import util.FileHandler;

/**
 *
 * @author sburton
 */
public class MyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MyApp().run();
    }
    
    public void run() {
        // TODO: Log a "fine" message here, saying: "starting program"
        
        FileHandler handler = new FileHandler();
        
        String firstLine = handler.loadFirstLine("something.txt");
        
        if (firstLine == null) {
            // TODO: Log a "severe" message here, saying "Could not read first line"
        }
    }
    
}
