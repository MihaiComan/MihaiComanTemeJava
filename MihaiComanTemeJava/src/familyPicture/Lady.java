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
 * @author Ada
 */
public class Lady implements Runnable{
   
    private BlockingQueue queue;
    private BlockingQueue queue1;
    
    public Lady(BlockingQueue queue, BlockingQueue queue1 ) {
        this.queue = queue;
        this.queue1 = queue1;
        
    }

    public void awakeSleepingLady() throws InterruptedException {
        while (true) {
            Thread.sleep(2500);
            queue.take();
            queue1.put(1);
            System.out.println("LADY: Thank you Gentleman for waking me up for my favourite show.");
        }
}
  
    @Override
    public void run() {

        Cigarette c = new Cigarette(queue); 
        Thread cigarette = new Thread(c);
        cigarette.start();
         while (true) {
            try {
                Thread.sleep(1000);
                awakeSleepingLady();
            } catch (InterruptedException ex) {
                Logger.getLogger(Gentleman.class.getName()).log(Level.SEVERE, null, ex);
            }
}
        
        
        
        
        
    }
}

