/*
 * Main Class
 */
package multith;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Mihai
 */
public class MultiTH {

   static BlockingQueue queue = new ArrayBlockingQueue<>(1);
   static BlockingQueue queue1 = new ArrayBlockingQueue<>(1);
   
   
   public static void main(String[] args) throws InterruptedException {
        
        ExecutorService executor = Executors.newFixedThreadPool(3);
        // Creating threads
        Thread t1 = new Thread(new TV(queue));
        Thread t2 = new Thread(new Lady(queue1));
        Thread t3 = new Thread(new Gentleman(queue, queue1));
                
            
            executor.execute(t1);
            executor.execute(t3);
            executor.execute(t2);
        
            executor.shutdown();
        
        while (executor.isTerminated()) {
            System.out.println("Finished all threads");
        }
    }
}
