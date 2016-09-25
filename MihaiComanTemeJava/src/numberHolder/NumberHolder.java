package numberHolder;



/**
 *
 * @author Mihai
 */
public class NumberHolder {
    
    public int anInt;

    public float aFloat;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NumberHolder n = new NumberHolder();
        
        n.aFloat = (float) 123;
        n.anInt = 123;
        
        System.out.println("The integer value of n is :" + n.anInt);
        System.out.println("The float value of n is :" + n.aFloat);
  
        }
    
}
