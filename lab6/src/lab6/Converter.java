package lab6;

import java.util.*;


public class Converter {

	
	double celsius;
	static double fahrenheit;
	
	public Converter() {
		
	}

	
	public static double cToF(double c) {
		fahrenheit = (9.0/5) * c + 32;
		return fahrenheit;
	}
	
	public double fToC(double f) {
		celsius = (f -32) * 5.0/9;
		return celsius;
	}
	
}
