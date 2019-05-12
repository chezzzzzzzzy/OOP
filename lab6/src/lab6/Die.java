package lab6;


import java.util.*;

public class Die {
	
//	Scanner getInput = new Scanner(System.in);
	Random randomSelector = new Random();
	
	int numFaces = 6;
	
	public int roll() {
		int random = randomSelector.nextInt(numFaces);
		return random + 1;
		
	}
	

	

}
