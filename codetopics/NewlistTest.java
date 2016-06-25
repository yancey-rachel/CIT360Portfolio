package javaCollection;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewlistTest {

	@Test
	public void testarray() {
		Junit test = new Junit();
		String result = test.array("Gamora", "Groot", "Drax the Destroyer", "Rocket Raccoon");
assertEquals("Gamore, Groot, Drax the Destroyer, Rocket Raccoon", result);
		
	}

}
