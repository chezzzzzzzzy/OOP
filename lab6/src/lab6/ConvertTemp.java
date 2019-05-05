package lab6;

import java.util.*;


public class ConvertTemp {
	
	static double dc;
	static double f;
	
	
	
	public static void main(String[] args) {
		
		Converter cToF = new Converter();
		Converter fToC = new Converter();


		f = cToF.cToF(100);
		System.out.println(f);
		
		dc = fToC.fToC(212);
		System.out.println(dc);
		
		
		
	}
	

}
