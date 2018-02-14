package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class FactoresPrimosTest {

	@Test
	public void factoresTest() throws NumberFormatException, IOException {
		FactoresPrimos misFactores = new FactoresPrimos();
		assertEquals(3, misFactores.generate(3));
	}
	


}
