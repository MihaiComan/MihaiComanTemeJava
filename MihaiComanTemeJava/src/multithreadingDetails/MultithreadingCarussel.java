/*
 * 
 */
package multithreadingDetails;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihai
 */
public class MultithreadingCarussel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new InheritedThread();
        t1.start();
        InterfaceImplemented ii = new InterfaceImplemented();
        Thread t2 = new Thread(ii);
        t2.start();
        System.out.println("The Thread count is: "+Thread.activeCount());
        Thread.currentThread();
        Thread.getAllStackTraces();
        Thread.getDefaultUncaughtExceptionHandler();
        Thread.holdsLock(t2);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MultithreadingCarussel.class.getName()).log(Level.SEVERE, null, ex);
        }
        Thread.yield();
    }
    
}
