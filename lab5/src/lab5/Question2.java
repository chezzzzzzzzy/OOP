package lab5;

import java.util.*;


public class Question2 {
	
	public static void main(String[] args) {
		
		double [] numbers = {1.5, 20.3, 4.5, 5.5, 10.3, 450, 20.4, -22.3};
		double [] numbers2 = {99, 50, 70.5};

		
		avgArray(numbers);
		

		
	}
	
	public static double avgArray(double[] numbers) {
		
		double sum = 0.0, average;

		
		for (int i = 0; i < numbers.length; i++) {
				
			sum += numbers[i];
				
		}
		
		average = sum / numbers.length;
		System.out.println(average);

		
		return average;
		
	}

}
