package com.cenfotec.patrones.logica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class FactoresPrimos {
	
	   static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   static PrintStream out = System.out;

	public int generate(int number) {
		
		int nfactor = 2;
		
	        //for(int i=2; i<=number; i++){
		//while(number%i==0){
	            	
		//number = number/i;
	                
		//}
		//}
		
		do {
			if(number%nfactor == 0) { 
	        number = number/nfactor;
			
	        }else {
	        nfactor++;
	        }
	        }
	        while (nfactor<=number);
		
		return nfactor;

	}

}
