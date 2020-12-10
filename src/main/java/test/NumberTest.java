package test;

import static org.junit.jupiter.api.Assertions.assertThrows;
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

	String numberA = "60";
	String numberB = "66";
	int checkNumber = 64;
	ArrayList<Float> list = new ArrayList<Float>();

	/**
	 * Before test we check if the A value is less than the B value
	 * 
	 * @throws Exception
	 */
	@Before
	public void CheckSuperior() {
		Exception e = assertThrows(IllegalArgumentException.class,
				() -> NumberClass.ListOfSquareRoot(this.numberB, this.numberA),
				"La première valeur est supérieur à la deuxième valeur");

		String testMessage = e.getMessage();
		String expectedMessage = "La première valeur est supérieur à la deuxième valeur";
		assertEquals(expectedMessage, testMessage);
	}

	/**
	 * Check if numberA square root equal of the (checkNumber - numberA)th of the
	 * recover list
	 */
	@Test
	public void FirstTest() throws Exception {
		this.list = NumberClass.ListOfSquareRoot(this.numberA, this.numberB);
		assertEquals((float) Math.sqrt(this.checkNumber), list.get(this.checkNumber - Integer.parseInt(this.numberA)));
	}
}
