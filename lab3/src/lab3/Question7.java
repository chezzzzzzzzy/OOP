package lab3;

import java.util.*;

public class Question7 {
	
	public static void main(String[] args) {
		
		Scanner getInput = new Scanner(System.in);
		
		int serviceNum;
		int depositQueue = 0;
		int withdrawalQueue = 0;
		int newAccQueue = 0;
		int othersQueue = 0;
	
		while(true) {
			
			System.out.print("Please enter your choice of service: ");
			serviceNum = getInput.nextInt();
			
			
			switch (serviceNum) {

			case 1: System.out.println("Deposit");
					depositQueue++;
					System.out.println("Queue number: " + depositQueue);
					break;
					
					
			case 2:	System.out.println("Withdraw"); 
					withdrawalQueue++;
					System.out.println("Queue number: " + withdrawalQueue);
					break;
	
			
			case 3: System.out.println("Open new account");
					newAccQueue++;
					System.out.println("Queue number: " + newAccQueue);
					break;
					
					
			case 4: System.out.println("Other services"); 
					othersQueue++;
					System.out.println("Queue number: " + othersQueue);
					break;
					
					
			default: System.out.println("Contact customer service for help"); 
					break;
					
					
			}
		
			
		}
		
		
		
	
	}

}
