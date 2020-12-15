package src;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Before;

/** Class NumberNumberClass */
public class NumberClass {
    
	/** List of square root between 2 numbers
     * @param numberA (int)
     * @param numberB (int)
     * @return list (Array<float>)
	 * @throws Exception 
     */
    public static ArrayList<Float> ListOfSquareRoot(String numberA, String numberB) throws Exception{
        CheckNullOrEmptyData(numberA, numberB);
    	int intNumberA = CheckInteger(numberA, numberB)[0];
        int intNumberB = CheckInteger(numberA, numberB)[1];
        CheckSuperior(intNumberA, intNumberB);
        
    	ArrayList<Float> list = new ArrayList<Float>();
        
        for (int i = intNumberA; i <= intNumberB; i++) {
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
    
	/** We check if each value is an integer
	 * @param numberA (int)
	 * @param numberB (int)
	 * @throws Exception 
     */
	private static int[] CheckInteger(String numberA, String numberB) throws Exception {
        try {
            Integer.parseInt(numberB);
            
            int[] transform = new int[2];
            transform[0] = Integer.parseInt(numberA);
            transform[1] = Integer.parseInt(numberB);

            return transform;
        }
        catch(Exception e) {
        	throw new Exception("Une des 2 valeur entrée n'est pas un entier");
        }
	}
	
	/** We check if the A value is less than the B value
	 * @param numberA (int)
	 * @param numberB (int)
	 * @throws Exception 
     */
	private static void CheckSuperior(int numberA, int numberB) throws Exception{
		if(numberA > numberB) 
        	throw new Exception("La première valeur est supérieur à la deuxième valeur");
	}
	
	/** We check if values are null or empty
	 * @param numberA (int)
	 * @param numberB (int)
	 * @throws Exception 
     */
	private static void CheckNullOrEmptyData(String numberA, String numberB) throws Exception{
		if(numberA == null || numberA == "")
			throw new Exception("La première valeur est vide");
		
		if(numberB == null || numberB == "")
			throw new Exception("La secondes valeur est vide");
	}
}
