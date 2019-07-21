package labTest;

import java.util.Scanner;

public class sampleA {
	

	
	public static void main(String[] args) {
		
		int choice;

		
		Scanner getInput = new Scanner(System.in);
		
		double height = 0, weight = 0, cal;
		int age;
		
		System.out.println("Please enter your height in cm");
		height = getInput.nextDouble();
		

		
		
		for (height = -1; height < 0;) {
			
			System.out.println("Please enter your height in cm");
			height = getInput.nextDouble();
			
			if (height == 0) {
				// exit
				System.exit(0);

			} 
		}
		
		
		System.out.println("Please enter your weight in kg");
		weight = getInput.nextDouble();
		
		
		System.out.println("Please enter your age in years");
		age = getInput.nextInt();
		
		System.out.println("Please enter 1 for male and 2 for female");
		choice = getInput.nextInt();
		
		cal = calculateCalories(choice, height, weight, age);
		System.out.print(cal);
		
	}
	
	public static double calculateCalories(int choice, double height, double weight, int age) {
		
		double calories = 0.0;

		switch(choice) {
			case 1:
				System.out.println("Male selected");
				calories = Double.valueOf(66.5 + (13.75 * weight) + (5.003 * height) - (6.775 * age));
				break;
				
			case 2:
				System.out.println("Female selected");
				calories = Double.valueOf(665.1 + (9.563 * weight) + 1.850 * (height) - (4.676 * age));
				break;

			
			default:
				System.out.println("Try again");
				break;

			
		}
		return calories;
		
	}
	
}
