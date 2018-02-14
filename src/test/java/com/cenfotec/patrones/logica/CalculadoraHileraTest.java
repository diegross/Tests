package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraHileraTest {

	@Test
	public void pruebaStringVacio() throws Exception {
		CalculadorString miCalc = new CalculadorString();
		assertEquals(0, miCalc.Add(""));
	}

	@Test
	public void pruebaCantidadNumeros() {
		boolean pass = false;
		try {

			CalculadorString miCalc = new CalculadorString();
			assertEquals(0, miCalc.Add("1,2,3,4"));

		} catch (Exception e) {
			pass = true;
		}
		assertEquals(true, pass);

	}

	@Test
	public void pruebaSumaPrimera() throws Exception {

		CalculadorString miCalc = new CalculadorString();
		assertEquals(6, miCalc.Add("1,2,3"));

	}

}
