package labTest2Sample;

class DemoRobot extends Robot{
	
	private boolean rLegsBroken;

	public DemoRobot() {
		super(300);
		this.rLegsBroken = true;
		
	}
	
	public DemoRobot(boolean legsBroken, int setAge) {
		super(setAge);
		this.rLegsBroken = legsBroken;

	}
	
	public void setLegsBroken(boolean newLegsBroken) {
		this.rLegsBroken = newLegsBroken;	

	}
	
	public boolean getLegsBroken() {
		return rLegsBroken;
	}
	
	@Override
	public String selfIntro() {
		super.selfIntro();
		
		String text1, text2, finalText;
		
		if (rLegsBroken == true) {
			text1 = "Cant walk";
		} else {
			text1 = "Can walk";
		}
		
		if (getAge() >= 120) {
			text2 = "Retire";

		} else {
			text2 = "Cant move";
		}
		
		
		finalText = text + "\n" + "I " + text1 + " and i should " + text2;
		return finalText;

	}
	
		

	
	
	
	
	
	
}
