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
 * @author Nicu
 */
public class Cigarette implements Runnable {

    private BlockingQueue queue;

    public Cigarette(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(1500);
            queue.take();
            burning();
        } catch (InterruptedException ex) {
            Logger.getLogger(Cigarette.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void burning(){
        System.out.println("The lady is smoking!");

   }
    
}
