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
public class DoubleOperations {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        a = Math.toRadians(a);
        System.out.println("Math.sin(" + a + ") = " + Math.sin(a));
    }
}
