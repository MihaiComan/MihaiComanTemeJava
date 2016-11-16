/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyPicture;

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
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(VacuumCleaner.class.getName()).log(Level.SEVERE, null, ex);
        }
        cleans();
        
    }
    public void cleans() {
        System.out.println("Vaccum Cleaner has the state >>cleans<<");
    }
   
    
   
    
}
