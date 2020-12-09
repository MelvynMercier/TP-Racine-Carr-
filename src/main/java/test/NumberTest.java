package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import src.NumberClass;

/** Class test of NUMBER class */
public class NumberTest {
	
	int numberA = 30;
	int numberB = 66;
	int checkNumber = 30;
	ArrayList<Float> list = new ArrayList<Float>();
	
	
	/** Before test we check if each value is an integer
	 * @throws Exception 
     */
	@Test
	@Before
	public void CheckInteger() throws Exception {
        try {
            Integer.parseInt(String.valueOf(this.numberA));
            Integer.parseInt(String.valueOf(this.numberB));
        }
        catch(Exception e) {
            throw new Exception("Une des 2 valeur entrée n'est pas un entier");
        }
	}
	
	/** Before test we check if the A value is less than the B value
	 * @throws Exception 
     */
	@Test
	@Before
	public void CheckSuperior() throws Exception {
        if(numberA > numberB) {
        	throw new Exception("La valeur A est supérieur à la valeur B");
        }
	}
	
	@Test
	public void FirstTest() throws Exception {
		this.list = NumberClass.ListOfSquareRoot(this.numberA, this.numberB);
		assertEquals((float) Math.sqrt(this.checkNumber), list.get(this.checkNumber - this.numberA));
	}
	
	@Test
	@After
	public void CheckEqual() {
		System.out.println(this.list.size());
		System.out.println(this.numberA - this.numberB);
		assertEquals(this.list.size(), this.numberB - this.numberA);
	}
}
