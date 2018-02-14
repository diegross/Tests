package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoreTest {

	@Test
	public void testHipotenusaBasico() {
		Calculadora calcTest = new Calculadora();
		assertEquals(5.0,calcTest.hipotenusa(4, 3),0.0);
	}
	
	@Test
	public void testHipotenusaBasico2() {
		Calculadora calcTest = new Calculadora();
		assertEquals(10.0,calcTest.hipotenusa(6, 8),0.0);
	}


}
