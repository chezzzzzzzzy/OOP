package lab8;

import java.util.Scanner;

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
 