package lab5;

import java.util.*;


public class Question3 {
	
	public static void main(String[] args) {
		
		Scanner getInput = new Scanner(System.in);
		int array1Size, array2size;
		
		
		try {
			System.out.println("Please enter a size for array 1");
			array1Size = getInput.nextInt();
			System.out.println("Please enter a size for array 2");
			array2size = getInput.nextInt();

			
			double[] array1 = new double[array1Size];
			double[] array2 = new double[array2size];
			
			for (int i = 0; i < array1.length; i++) {
				System.out.println("Enter values for array1 here: ");
				array1[i] = getInput.nextInt();
				
			}
			
			
			for (int j = 0; j < array2.length; j++) {
				System.out.println("Enter values for array2 here: ");
				array2[j] = getInput.nextInt();
				
			}
			
			System.out.println(avgArray(array1));
			System.out.println(avgArray(array2));
	
			
			
		} catch (InputMismatchException error) {
			
			
			System.out.println(error);

			
		}
			
			
		
		
	}
	
	public static double avgArray(double[] numbers) {
		
		double sum = 0.0, average;

		
		for (int i = 0; i < numbers.length; i++) {
				
			sum += numbers[i];
				
		}
		
		average = sum / numbers.length;
		
		return average;
		
	}

	
	
	

}
