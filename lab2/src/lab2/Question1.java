package lab2;

import java.util.Scanner;

public class Question1 {

	
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner (System.in);
		
		System.out.println("Please enter the the input number");
		int num = user_input.nextInt();
		
		int ans = num * num;
		System.out.println(ans);
		
		
		
	}

}
