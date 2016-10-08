/*
 * a-sti.ro
 */
package multiprocess;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mihai
 */
public class Multiprocess {
    public static void main(String[] args){
        try {
            ProcessBuilder pb;
            // Use process builder to start 3 processes notepad
            pb= new ProcessBuilder("notepad.exe");
            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
        } catch (IOException ex) {
            Logger.getLogger(Multiprocess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
    }
}
