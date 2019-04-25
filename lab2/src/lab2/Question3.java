package lab2;

import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		
		double voltage, resistance, current;
		
		System.out.println("Please enter a value of resistance: ");
		resistance = user_input.nextDouble();
		
		System.out.println("Please enter a value of voltage: ");
		voltage = user_input.nextDouble();
		
		current = voltage / resistance;
		System.out.println(current);
		
		
	}

}
