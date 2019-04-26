package lab3;

import java.util.*;

public class Question5 {
	
	public static void main(String[] args) {
		

		ArrayList numbers = new ArrayList();
		
		int total;
		float average;
		
		Scanner getInput = new Scanner(System.in);
	
		
		while(true) {
			System.out.println("Please enter a number");
			
			if (getInput.nextInt() == 0 ) {
				break;
			} else {
				numbers.add(getInput.nextInt());
				
			}
		}
		
		
		
		
	}

}
