/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import util.FileHandler;

/**
 *
 * @author sburton
 */
public class MyApp {
    
    static final Logger logger = Logger.getLogger(MyApp.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MyApp().run();
    }
    
    public void run() {
        try{ 
            LogManager manager = LogManager.getLogManager();
            manager.readConfiguration(manager.getClass().getResourceAsStream("/resources/logging.properties"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        try {
            Handler fileHandler = new java.util.logging.FileHandler("log.txt");
            fileHandler.setLevel(Level.FINE);
            fileHandler.setFormatter(new SimpleFormatter());
            
            logger.addHandler(fileHandler);
            logger.setLevel(Level.FINE);
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
        // TODO: Log a "fine" message here, saying: "starting program"
        
        logger.fine("Starting program");
        
        FileHandler handler = new FileHandler();
        
        String firstLine = handler.loadFirstLine("something.txt");
        
        if (firstLine == null) {
            // TODO: Log a "severe" message here, saying "Could not read first line"
            logger.severe("Could not read first line");
        }
    }
    
}
