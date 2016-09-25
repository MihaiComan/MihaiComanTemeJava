/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FixTheProgram;

import java.awt.Rectangle;

/**
 *
 * @author Mihai
 */
public class SomethingIsWrong {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
            
            Rectangle myRect = new Rectangle();
            
            myRect.width = 40;
            myRect.height = 50;
            
            int area = myRect.width*myRect.height;
            
            System.out.println("myRect's area is " + area);

    }
    
}
