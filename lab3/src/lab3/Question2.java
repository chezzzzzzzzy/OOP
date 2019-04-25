package lab3;

import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		
		// using if else
		Scanner checkGrade = new Scanner(System.in);
		
		int score = 0;
		
		
		while (true) {
			System.out.println("Please enter your score: ");
			score = checkGrade.nextInt();
			
			if (score >=0 && score <=100) {
				if (score < 50) {
					System.out.println("Your grade is F");
				} else if (score >= 50 && score <= 59) {
					System.out.println("Your grade is D");
				} else if (score >= 60 && score <= 69) {
					System.out.println("Your grade is C");
				} else if (score >= 70 && score <= 79) {
					System.out.println("Your grade is B");
				} else {
					System.out.println("Your grade is A");
				}
			} 
			
			
		}

		
			
		
	}

}
