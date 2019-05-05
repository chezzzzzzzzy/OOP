package lab6;

import java.util.*;

public class DonationDrive {
	

	public static void main(String[] args) {
		
		// LKC
		
		Donation leeKC = new Donation("LEE KC", 100000);
		
//		System.out.println(leeKC.donorAmount);
		
		leeKC.donate(8000);
		leeKC.donate(5000);
		
		System.out.println("The total amount of money donated by LKC is " + leeKC.totalAmount);
		
		System.out.println("The total amount of money donated is " + Donation.totalAmount);

		
		// F2

		Donation foundationTwo = new Donation("F2", 10000);
		
//		System.out.println(foundationTwo.donorAmount);
		
		foundationTwo.donate(5000);
		foundationTwo.donate(3000);
		foundationTwo.donate(9000);
		
		System.out.println("The total amount of money donated by F2 is " + foundationTwo.totalAmount);

		System.out.println("The total amount of money donated is " + Donation.totalAmount);





		
		
		
	}

}
