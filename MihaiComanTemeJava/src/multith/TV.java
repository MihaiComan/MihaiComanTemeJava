/*
 * Thread for TV
 */
package multith;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihai
 */
public class TV implements Runnable{

    private BlockingQueue queue;

    public TV(BlockingQueue queue) {
        this.queue = queue;
    }

    
    private void startWaitedShow() throws InterruptedException {
        while(true){
            Thread.sleep(3500);
            queue.put(1);
            System.out.println("The Waited Show has started");
        }
    }
        
      /*  
     private void stopWaitedShow() {
        System.out.println("The Waited Show has stopped");
        this.notifyAll();
    }*/
    
    
    @Override
    public void run(){
        
        System.out.println("TV: I am running.");    
        try {
            Thread.sleep(1000);
            startWaitedShow();
        } catch (InterruptedException ex) {
            Logger.getLogger(TV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }       
    
}
