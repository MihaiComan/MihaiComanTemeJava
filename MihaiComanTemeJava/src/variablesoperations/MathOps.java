/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesoperations;

/**
 *
 * @author Mihai
 */

import java.util.Scanner;

/**
 * This program demonstrates a <code>while</code> loop.
 * 
 * @version 1.20 2004-02-10
 * @author Cay Horstmann
 */
public class MathOps {
  public static void main(String[] args) {
    // read inputs
    Scanner in = new Scanner(System.in);

    System.out.print("Introduceti numarul : ");
    double x = in.nextDouble();
    
    x = Math.toRadians(x);
    
    double a = Math.sin(x) * Math.sin(x);
    double b = Math.cos(x) * Math.cos(x);
    double sum = a + b ;
    
    System.out.println("Suma Patratelor este " + " = " + sum);
  }
}