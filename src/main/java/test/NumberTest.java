package test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import src.NumberClass;

/** Class test of NUMBER class */
public class NumberTest {

	/**
	 * We check if the A value is less than the B value
	 * 
	 * @throws Exception
	 */
	@Test
	public void CheckSuperior(){
		String numberA = "10";
		String numberB = "60";
		Exception e = assertThrows(Exception.class, 
				() -> NumberClass.ListOfSquareRoot(numberA, numberB),
				"La première valeur est supérieur à la deuxième valeur");

		String testMessage = e.getMessage();
		String expectedMessage = "La première valeur est supérieur à la deuxième valeur";
		assertEquals(expectedMessage, testMessage);
	}

	@Test
	public void CheckNumber() {
		String numberA = "?";
		String numberB = "test";
		Exception e = assertThrows(Exception.class, 
				() -> NumberClass.ListOfSquareRoot(numberA, numberB),
				"Une des 2 valeur entrée n'est pas un entier");

		String testMessage = e.getMessage();
		String expectedMessage = "Une des 2 valeur entrée n'est pas un entier";
		assertEquals(expectedMessage, testMessage);
	}
	
	@Test
	public void CheckNullOrEmptyFirstData() {
		String numberA = "";
		String numberB = "19";
		Exception e = assertThrows(Exception.class, 
				() -> NumberClass.ListOfSquareRoot(numberA, numberB),
				"La première valeur est vide");

		String testMessage = e.getMessage();
		String expectedMessage = "La première valeur est vide";
		assertEquals(expectedMessage, testMessage);
	}
	
	@Test
	public void CheckNullOrEmptySecondData() {
		String numberA = "20";
		String numberB = "";
		Exception e = assertThrows(Exception.class, 
				() -> NumberClass.ListOfSquareRoot(numberA, numberB),
				"La secondes valeur est vide");

		String testMessage = e.getMessage();
		String expectedMessage = "La secondes valeur est vide";
		assertEquals(expectedMessage, testMessage);
	}

	/**
	 * Check if numberA square root equal of the (checkNumber - numberA)th of the
	 * recover list
	 */
	@Test
	public void FirstTest() throws Exception {
		String numberA = "100";
		String numberB = "116";
		int checkNumber = 108;
		ArrayList<Float> list = new ArrayList<Float>();
		
		list = NumberClass.ListOfSquareRoot(numberA, numberB);
		assertEquals((float) Math.sqrt(checkNumber), list.get(checkNumber - Integer.parseInt(numberA)));
	}
}
