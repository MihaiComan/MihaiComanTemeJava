/*
 * thread for Lady.
 */
package multith;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihai
 */
public class Lady implements Runnable{
    
    
    
   private BlockingQueue queue;

    public Lady(BlockingQueue queue) {
        this.queue = queue;
    }

    public void wakeSleepLady() throws InterruptedException {
        while (true) {
            Thread.sleep(2500);
            queue.take();
            System.out.println("LADY: Thankyou Gentleman for waking me up for my favourite show.");
        }
    }

    @Override
    public void run() {
        
        Cigarette c = new Cigarette();
        Thread tc = new Thread(c);
        tc.start();
        
        //System.out.println("LADY: I am running.");
        while (true) {
            try {
                
                Thread.sleep(1000);
                wakeSleepLady();
            } catch (InterruptedException ex) {
                Logger.getLogger(Gentleman.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         
         //tc.interrupt();
        }
    }
}

   
