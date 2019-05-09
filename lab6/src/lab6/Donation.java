package lab6;

import java.util.*;

public class Donation {
	
	String donorName;
	double donorAmount;
	static double totalAmount;
	
	
	
	public Donation(String dName, double dAmount) {
		donorAmount = dAmount;
		donorName = dName;
		totalAmount += dAmount;
	}
	
	public void donate(double amt) {
		donorAmount += amt;
		totalAmount += amt;
		
	}

	public static void main(String[] args) {
		
	}

}
