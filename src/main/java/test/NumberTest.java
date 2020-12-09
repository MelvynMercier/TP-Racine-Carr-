package test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import src.NumberClass;

/** Class test of NUMBER class */
public class NumberTest {
	
	int numberA = 60;
	int numberB = 66;
	int checkNumber = 63;
	ArrayList<Float> list = new ArrayList<Float>();
	
	
	/** Before test we check if each value is an integer
	 * @throws Exception 
     */
	@Before
	public void CheckInteger() throws Exception {
        try {
            Integer.parseInt(String.valueOf(this.numberA));
            Integer.parseInt(String.valueOf(this.numberB));
        }
        catch(Exception e) {
            fail("Une des 2 valeur entrée n'est pas un entier");
        }
	}
	
	/** Before test we check if the A value is less than the B value
	 * @throws Exception 
     */
	@Before
	public void CheckSuperior(){
        if(this.numberA > this.numberB) 
        	fail("La valeur A est supérieur à la valeur B");
	}
	
	/** Before test we check if checkValue entered numberA and numberB
	 * @throws Exception 
     */
	@Before
	public void CheckEntred(){
        if(!(this.numberA < this.checkNumber && this.checkNumber < this.numberB))
        	fail("La valeur voulant être vérifié ne se situe pas entre la valeur A et la valeur B");
	}
	
	/** Check if numberA square root equal of the (checkNumber - numberA)th of the recover list */
	@Test
	public void FirstTest() throws Exception {
		this.list = NumberClass.ListOfSquareRoot(this.numberA, this.numberB);
		assertEquals((float) Math.sqrt(this.checkNumber), list.get(this.checkNumber - this.numberA));
	}
	
	/** After test we check if size of list equal (numberB - numberA) */
	@After
	public void CheckEquals() {
		System.out.println(this.list.size());
		System.out.println(this.numberA - this.numberB);
		assertEquals(this.list.size(), this.numberB - this.numberA);
	}
}
