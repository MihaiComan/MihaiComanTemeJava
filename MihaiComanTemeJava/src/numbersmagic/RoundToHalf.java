/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersmagic;

/**
 *
 * @author Mihai
 */
public class RoundToHalf {

    public static float roundToHalf(float d) {
    return (float) (Math.round(d * 2) / 2.0);
}
    
    public static void main(String[] args) {
       
    float d1 = roundToHalf((float) 1.1);
    float d2 = roundToHalf((float) 1.3);
    float d3 = roundToHalf((float) 2.5);
    float d4 = roundToHalf((float) 3.223920);
    float d5 = roundToHalf(3);

    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    System.out.println(d4);
    System.out.println(d5);
        
    }
    
}
