package lab6;

import java.util.*;

public class CoreValues {
	

	
	public static void main(String[] args) {
		
		String[] cv = {"Self-Discipline", "Personal Integrity", "Care & Concern", "Openness", "Responsibility","Excellence"};

		
		int i;
		
		String userInput = "hello";
		Scanner getInput = new Scanner(System.in);
		
		System.out.println("Enter SP CV: ");
		userInput = getInput.nextLine();
		
		for (i = 0; i < cv.length-1; i++) {

			
		}

		if(userInput != cv[i]) {
			System.out.println("Done");

		}
		
		
	}

}
