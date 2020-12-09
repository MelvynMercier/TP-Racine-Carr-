package src;

import java.util.ArrayList;

/** Class NumberNumberClass */
public class NumberClass {
    
	/** List of square root between 2 numbers
     * @param numberA (int)
     * @param numberB (int)
     * @return list (Array<float>)
     */
    public static ArrayList<Float> ListOfSquareRoot(int numberA, int numberB){
        ArrayList<Float> list = new ArrayList<Float>();
        
        for (int i = numberA; i <= numberB; i++) {
        	 list.add(FindSquareRoot(i));
        }
        
        return list;
    }
    
    
	/** Calcul square root od number
     * @param number (int)
     * @return square root (float)
     */
    private static float FindSquareRoot(int number) {
    	return (float) Math.sqrt(number);
    }
}
