/*
 * Main Class
 */
package familyPicture;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Andrei
 */
public class FamilyPicture {

    static BlockingQueue queue = new ArrayBlockingQueue<>(1);
    static BlockingQueue queue1 = new ArrayBlockingQueue<>(1);

    public static void main(String[] args) throws InterruptedException {
       
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Creating threads
        Runnable t1 = new TV(queue);
        Runnable t2 = new Lady(queue,queue1);
        Runnable t3 = new Gentleman(queue,queue1);
        
        // starting threads
        executor.execute(t1);
        executor.execute(t3);
        executor.execute(t2);
        
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
        
        // end
        
    }
    
}
