package lab3;

import java.util.*;

public class Question1 {
	
	public static void main(String[] args) {
		
		Scanner guessNumber = new Scanner(System.in);
		
		int luckyNumber = 8;
		
		System.out.println("Please enter your guess: ");
		
		int guess = guessNumber.nextInt();
		
		
		
		// using if else 
		if (guess == luckyNumber) {
			System.out.println("Congrats");
		} else {
			System.out.println("Thank you");
			
		}
		

		
		
		
		// using switch
		switch(guess) {
			case 1: System.out.println("Thank you"); break;
			case 8: System.out.println("Congrats"); break;
		}
				
		
	}

}
