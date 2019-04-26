package lab4;

import java.util.*;



public class Question1 {
	
	
	
	public static void main(String[] args) {
		
		double fahrenheit = 0.0, celsius = 0.0;
		int choice;
		
		
		Scanner getInput = new Scanner(System.in);
		
		
		System.out.println("Press 1 for F/C conversion, Press 2 for C/F conversion: ");
		choice = getInput.nextInt();
		
		switch (choice) {
		
		case 1: 
			fahrenheitToCelsius(fahrenheit);
			break;
			
		case 2:
			celsiusToFahrenheit(celsius);
			break;
		
		}
	

		
		
	}
	
	public static double fahrenheitToCelsius (double farenheit) {
		
		double dc;
		
		Scanner getInput = new Scanner(System.in);

		System.out.println("Enter farenheit temperature: ");
		farenheit = getInput.nextDouble();
		
		
		dc = (5.0/9.0) * (farenheit - 32);
		System.out.println(dc);
		
		return dc;
	}
	
	public static double celsiusToFahrenheit (double celsius) {
		
		double f;
		
		Scanner getInput = new Scanner(System.in);

		
		System.out.println("Enter celsius temperature: ");
		celsius = getInput.nextDouble();
		
		
		f = (9.0/5.0) * celsius + 32;
		System.out.println(f);
		
		return f;
	}

}
