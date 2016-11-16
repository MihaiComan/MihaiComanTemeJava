/*
 * Thread for cigarette
 */
package multith;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihai
 */
public class Cigarette implements Runnable {

    @Override
    public void run(){
        try {
            burning();
            Thread.sleep(1500);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Cigarette.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void burning(){
        
        System.out.println("The lady is smoking");

   }
    
}
