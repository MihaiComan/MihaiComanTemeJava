/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingDetails;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihai
 */
public class InheritedThread extends Thread{
    @Override
    public void run(){
        this.checkAccess();
        
      //  this.countStackFrames();
        System.out.println("Equals Method returns: "+this.equals(this));
        System.out.println("Get Class method returns: "+this.getClass());
        System.out.println("The ClassLoader is :"+this.getContextClassLoader());
        System.out.println("The thread ID is:"+this.getId());
        System.out.println("The thread name is: "+this.getName());
        System.out.println("The thread priority is: "+this.getPriority());
        System.out.println(Arrays.toString(this.getStackTrace()));
        System.out.println("THe state is: "+this.getState());
        System.out.println("The thread belongs to: "+this.getThreadGroup());
        System.out.println("The hashcode is: " +this.hashCode());
        this.interrupt();
        System.out.println("Is The Thread alive? "+this.isAlive());
        System.out.println("Is The Thread a Demon? "+this.isDaemon());
        System.out.println("Is the Thread interrupted? "+this.isInterrupted());
        
        this.notify();
        this.notifyAll();
        this.suspend();
        this.resume();
       // this.run();
        this.setDaemon(false);
        this.setName("newName");
        this.setContextClassLoader(null);
        this.setPriority(10);
        this.start();
        this.stop();
        System.out.println("Method toString returns: "+this.toString());
        try {
            this.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(InheritedThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(InheritedThread.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
            this.join(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(InheritedThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
