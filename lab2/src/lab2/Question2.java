package lab2;

import java.util.Scanner;

// converting farenheit to degree celsius

public class Question2 {
	
	public static void main(String[] args) {
		
		double dc;
		double farenheit;
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter farenheit temperature: ");
		farenheit = user_input.nextFloat();
		
		dc = (5.0/9.0) * (farenheit - 32);
		System.out.println(dc);
		
				
		
	}

}
