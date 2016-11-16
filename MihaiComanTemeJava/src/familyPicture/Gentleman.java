/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyPicture;

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

    public void notifyLady() throws InterruptedException {
        
        while (true) {
            //Thread.sleep(2500);
            queue.take();
            queue1.put(1);
            System.out.println("GENTLEMAN: Wake up Lady, show has started.");
        }
}
    
    
    @Override
    public void run() {
        
        VacuumCleaner vc = new VacuumCleaner(); 
        Thread tvc = new Thread(vc);
        System.out.println("Gentleman starts the vaccum cleaner!");
        tvc.start();
        
        try {
            notifyLady();
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gentleman.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
