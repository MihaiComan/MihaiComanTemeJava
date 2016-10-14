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
public class InterfaceImplemented implements Runnable {

    @Override
    public void run() {
        System.out.println("Equals Method returns: "+this.equals(this));
        System.out.println("Get Class method returns: "+this.getClass());
        System.out.println("The hashcode is: " +this.hashCode());
        System.out.println("Method toString returns: "+this.toString());
        try {
            this.wait(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(InterfaceImplemented.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(InterfaceImplemented.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.notifyAll();
        
    }
    
}
