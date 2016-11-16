/*
 * Thread for Vacuum cleaner
 */
package multith;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihai
 */
public class VacuumCleaner implements Runnable {
    
    @Override
    public void run() {
        
        try {
            cleans();
            Thread.sleep(1000);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(VacuumCleaner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public void cleans() {
        System.out.println("Vaccum Cleaner has the state >>cleans<<");
    }
    
    
   
    
   
    
}
