package com.cenfotec.patrones.logica;

public class CalculadorString {
	
	private static final int EMPTY_STRING = 0;
	private static final  String DELIMITADOR  = ",";

	public int Add(String string) throws Exception {
		String [] numeros =string.split(",");
		if(numeros.length > 3) {
			throw new Exception("muchos numeros");
		}
		return EMPTY_STRING;
	}
	
	

}
