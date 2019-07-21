package lab8;

public class DT implements DreamTablet {
	

	@Override
	public void showTV(int intChannel) {
		// TODO Auto-generated method stub
		
		if (intChannel == 1) {
			System.out.println("1 is selected");
		} else if (intChannel == 2) {
			System.out.println("2 is selected");
		} else {
			System.out.println("Other number is selected");
		}
 		
				
	}

	@Override
	public String answerAnyQuery(String strQuery) {
		// TODO Auto-generated method stub
		
		if (strQuery.contentEquals("Hello")) {
			System.out.println("Hello is displayed");
			
		} else if (strQuery.contentEquals("World")) {
			System.out.println("World is displated");
		} else {
			System.out.println("Other string is selected");
		}
		
		
		
		
		return null;
		
	}

	
	
	
}
