/*
 * Thread for Gentleman
 */
package multith;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihai
 */
public class Gentleman implements Runnable { 
    private BlockingQueue queue;
    private BlockingQueue queue1;

    public Gentleman(BlockingQueue queue, BlockingQueue queue1) {
        this.queue = queue;
        this.queue1 = queue1;
}
    
    
    
    public void tellsLady() throws InterruptedException{
        
        while(true){
            Thread.sleep(1500);
            queue.take();
            queue1.put(1);
            System.out.println("Your Show has started!");
        }
    }
    
    @Override
    public void run() {
        
        VacuumCleaner vc = new VacuumCleaner();
        Thread tvc = new Thread(vc);
        System.out.println("Gentleman starts the vaccum cleaner!");
        tvc.start();
        while(true){
        try {
            tellsLady();
            Thread.sleep(1000);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Gentleman.class.getName()).log(Level.SEVERE, null, ex);
        }
        tvc.interrupt();
        
        }
        
        
        
    }
}
