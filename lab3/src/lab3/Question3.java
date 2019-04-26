package lab3;

public class Question3 {
	
	public static void main(String[] args) {
		
		
		// part a
		
//		int oddNumbers, i;
//		
//		for (i = 1; i < 10; i++) {
//			if (i%2 == 1) {
//				System.out.println(i);
//			}
//		}
		
		int oddNumbers, i;
		
		for (i=0; i<=9; i++) // 10 columns
	    {
	        for (oddNumbers=1; oddNumbers<=10; oddNumbers++)
	        {
	            int number = oddNumbers+i*10;
	            if (number%2 !=0)
	            System.out.print(number + " " );
	        }
	        System.out.println();
	    }
		
		// optimised 
		
//		 for (int i=1; i<=99; i++)
//		 {
//		      if (number%2 !=0)
//		          System.out.print(number + " " );
//
//		      if (number%10 ==0)
//		          System.out.println();
//		 }
//
//		
		
		
		
		
	}

}
