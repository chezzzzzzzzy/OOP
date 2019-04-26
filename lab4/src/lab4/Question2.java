package lab4;

import java.util.*;

public class Question2 {
	
	public static void main(String[] args) {
		
		int times;
		
		
		Scanner getInput = new Scanner(System.in);
	
		System.out.println("Please enter a message: ");
		String messageEntered = getInput.next();
		
		System.out.println("Please enter number of times: ");
		times = getInput.nextInt();
		
		displayMessage(messageEntered, times);
	}
	
    public static void displayMessage(String message, int nTimes) {
    
    
  
    	for (int i = 0; i < nTimes; i++) {
    		
    		
    		
        	System.out.println(message);
        	
    		
    	}
    }

}
