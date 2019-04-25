package lab2;

import java.util.Scanner;

public class Question5 {
	
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		
		double gratuityRate, subtotal, total, gratuity;
		
		System.out.println("Please enter the gratuity rate: ");
		gratuityRate = user_input.nextDouble();
		
		System.out.println("Please enter the subtotal: ");
		subtotal = user_input.nextDouble();
		
		gratuity = subtotal * gratuityRate / 100;
		total = subtotal + gratuity;
		
		System.out.println(gratuity);
		System.out.println(total);
		
	}

}
