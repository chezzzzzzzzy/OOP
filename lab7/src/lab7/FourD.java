package lab7;

import java.util.*;

public class FourD {

	public static void main(String[] args) {
	}
	public static String next4D() {
		
		int randomNumber = 0;
		Random rn = new Random();
		
		randomNumber = rn.nextInt(9999);
		String str = Integer.toString(randomNumber);
		System.out.println(str);
		return str;
	}

	
}
