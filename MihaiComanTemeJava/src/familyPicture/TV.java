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
public class TV implements Runnable{

    private BlockingQueue queue;

    public TV(BlockingQueue queue) {
        this.queue = queue;
}
    
    private void startWaitedShow() throws InterruptedException {
        while(true){
            Thread.sleep(1500);
            queue.put(1);
            System.out.println("TV: The Waited Show has started");
        }
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            startWaitedShow();
        } catch (InterruptedException ex) {
            Logger.getLogger(TV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}  
        
    

