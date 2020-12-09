package src;

import java.util.ArrayList;

/** Class NumberNumberClass */
public class NumberClass {
    
	/** List of square root between 2 numbers
     * @param numberA (int)
     * @param numberB (int)
     * @return list (Array<float>)
	 * @throws Exception 
     */
    public static ArrayList<Float> ListOfSquareRoot(int numberA, int numberB) throws Exception{
//        CheckSuperior(numberA, numberB);
        ArrayList<Float> list = new ArrayList<Float>();
        
        for (int i = numberA; i <= numberB; i++) {
        	 list.add(FindSquareRoot(i));
        }
        
        return list;
    }

    
//	/** Check if the A value is less than the B value
//     * @param numberA (int)
//     * @param numberB (int)
//	 * @throws Exception 
//     */
//    private static void CheckSuperior(int numberA, int numberB) throws Exception{
//        if(numberA > numberB) {
//        	throw new Exception("La valeur A est sup�rieur � la valeur B");
//        }
//    }
    
    
	/** Calcul square root od number
     * @param number (int)
     * @return square root (float)
     */
    private static float FindSquareRoot(int number) {
    	return (float) Math.sqrt(number);
    }
}
