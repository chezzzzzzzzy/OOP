package labTest2Sample;

class Robot {
	
	private int ageInMonth;
	String text;
	
	public Robot() {
		ageInMonth = 50;
	}
	
	
	public Robot(int monthAge) {
		ageInMonth = monthAge;
	}
	
	public void setAge(int setAge) {
		ageInMonth = setAge;
		
	}
	
	public int getAge() {
		return ageInMonth;
	}
	


	public String selfIntro(){ 
		text = "Hello, my age in month is: " + Integer.toString(ageInMonth);
		return text;
		
	}
	
	

}

