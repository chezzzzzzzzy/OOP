package lab4;

import java.util.*;
import java.math.*;

public class Question3 {
	
	public static void main(String[] args) {
		
		int enteredNumber;
		
		Scanner getInput = new Scanner(System.in);
		System.out.println("Please enter a number to be square rooted: ");
		enteredNumber = getInput.nextInt();
		
		sqRoot(enteredNumber);
		
	}
	
	public static double sqRoot(double num) {
		
		Math.sqrt(num);
		System.out.println(num);
		
		return num;
		
	}

}
