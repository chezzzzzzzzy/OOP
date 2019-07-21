package labTest;

import java.util.Scanner;

public class sampleB {
	
	
	
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		
		int days;
		double allowance;



		
		do {
			
			System.out.println("Please enter the number of working days: ");
			days = getInput.nextInt();
			
			if (days == 0) {
				System.exit(days);
			}

			
		} while (days < 0 || days > 42);
		
		do {
			
			System.out.println("Please enter the daily allowance: ");
			allowance = getInput.nextDouble();
			
		} while (allowance < 0);
		

		
		
		
		double money = totalAllowance(days,allowance);
		System.out.println(money);
		
		
		
		
		
	}
	
	public static double totalAllowance(int days, double dailyAllowance) {
		
		double totalAllowance = 0;
		
		totalAllowance = days * dailyAllowance;
		
		return totalAllowance;
	}

}
