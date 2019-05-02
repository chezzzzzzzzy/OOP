package lab6;

import java.util.*;



public class Question1 {
	
	static Random randomNumber = new Random();
	static int numFaces;
	
	
	public static void main(String[] args) {
		roll();
		
	}
	
	public static int roll() {
		
		numFaces = randomNumber.nextInt(7);
		System.out.println(numFaces);
		return numFaces;
	}
	
	
	
}


