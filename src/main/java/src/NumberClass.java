package src;

/** Class NumberNumberClass */
public class NumberClass {
    
	/** List of square root between 2 numbers
     * @param numberA (int)
     * @param numberB (int)
     * @return list (Array<float>)
	 * @throws Exception 
     */
    public static float[] ListOfSquareRoot(int numberA, int numberB) throws Exception{
        CheckInteger(numberA, numberB);
        CheckSuperior(numberA, numberB);
        
        float[] list = new float[CalculGap(numberA, numberB)];
        
        //TODO
        //Le reste
        
        
        return list;
    }
    
    
    
	/** Check if the 2 values are integers
     * @param numberA (int)
     * @param numberB (int)
	 * @throws Exception 
     */
    private static void CheckInteger(int numberA, int numberB) throws Exception{
        try {
            Integer.parseInt(String.valueOf(numberA));
            Integer.parseInt(String.valueOf(numberB));
        }
        catch(Exception e) {
            throw new Exception("Une des 2 entr�e n'est pas un entier");
        }
    }
    
	/** Check if the A value is less than the B value
     * @param numberA (int)
     * @param numberB (int)
	 * @throws Exception 
     */
    private static void CheckSuperior(int numberA, int numberB) throws Exception{
        if(numberA > numberB) {
        	throw new Exception("La valeur A est sup�rieur � la valeur B");
        }
    }
    
	/** Calculation of the difference between 2 integers
     * @param numberA (int)
     * @param numberB (int)
     * @return gap (int)
     */
    private static int CalculGap(int numberA, int numberB){
        return numberB - numberA;
    }
}
