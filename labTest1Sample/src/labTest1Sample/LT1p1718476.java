package labTest1Sample;

import java.util.Scanner;

// DCPE/FT/3A/01
// CHESTER YEE
// 1718476

public class LT1p1718476 {
	
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		
		int sgt = 0;
		int cityCode = 0;
		
		do {
			
			System.out.println("Please enter Singapore Time in 24 hours format: ");
			sgt = getInput.nextInt();
			
		} while (sgt <= -1 || sgt >= 24);
		
		
		
		System.out.println("Please enter Target Code (1 for JP, 2 for HK, 3 for NY): ");
		cityCode = getInput.nextInt();
		
		
		
		System.out.println(calTime(sgt, cityCode));
		
	
	}
	
	public static int calTime(int sgt, int cityCode) {
		
		int targetTime = 0;
		
		if (cityCode == 1) {
			
			System.out.print("Present time in JP is: ");
			targetTime = sgt + 1;
			
			
			if (targetTime < 0) {
				targetTime = Math.abs(targetTime);
				System.out.println("Previous day time in JP " + targetTime );
				
			} else if (targetTime > 23) {
				targetTime = 0;
				System.out.println("Next day time in JP " + targetTime);
			} 

			
			
		} else if (cityCode == 2) {
			
			System.out.print("Present time in HK is: ");
			targetTime = sgt + 0;
			
			if (targetTime < 0) {
				targetTime = Math.abs(targetTime);
				System.out.println("Previous day time in HK " + targetTime );
				
			} else if (targetTime > 23) {
				targetTime = 0;
				System.out.println("Next day time in HK  " + targetTime);
			} else {
				
			}


			
		} else if (cityCode == 3) {
			
			System.out.print("Present time in NY is: ");
			targetTime = sgt - 12;

			
			if (targetTime < 0) {
				targetTime = Math.abs(targetTime);
				System.out.println("Previous day time in NY " + targetTime );
				
			} else if (targetTime > 23) {
				targetTime = 0;
				System.out.println("Next day time in NY " + targetTime);
			} 
			


			
		}
	

		return targetTime;
		
		
	}

}
