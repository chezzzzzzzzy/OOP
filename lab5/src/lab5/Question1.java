package lab5;

import java.util.*;


public class Question1 {
	
	public static void main(String[] args) {
		
		
		char [] msg = {'s', 't', 'r', 'e', 's', 's', 'e', 'd'};		
		
		Scanner getInput = new Scanner(System.in);
		
		
		System.out.println("Please select your choice of order: ");
		int input = getInput.nextInt();
		
		switch(input) {
			case 1:
				// normal order
				for (int i = 0; i < msg.length; i++) {
					System.out.print(msg[i]);
				}
				
			break;
			
			case 0:
				// reversed order
				for (int x = msg.length-1; x >= 0; x--) {
					System.out.print(msg[x]);
				}
			break;
			
		}
		
			
		
	}

}
