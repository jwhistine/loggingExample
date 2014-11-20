package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

/**
 *
 * @author sburton
 */
public class FileHandler {
    
    static final Logger logger = Logger.getLogger(FileHandler.class.getName());
    
    public String loadFirstLine(String file) {
        // TODO: Log a "fine" message here saying: "Starting loadFirstLine"
        logger.fine("Starting loadFirstLine");
        
        String line = null;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            line = reader.readLine();
            
            reader.close();
        } catch (IOException ex) {
            // TODO: Log a "severe" message here saying: "Could not load file."
            // and include the exception with it.
            logger.severe("Could not load file");
        }
        
        return line;
    }
    
}
