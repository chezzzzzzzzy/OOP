package labTest2Sample;

class Vehicle {
	
	protected int wheelNo;

	public Vehicle() {
		wheelNo = 4;
	}

	public Vehicle(int wheels) {
		wheelNo = wheels;
	}

	public void setWheelNo(int noOfWheels) {
		wheelNo = noOfWheels;
	}

	public int getWheelNo() {
		return wheelNo;				
	}


	public void describe() {

		System.out.print("The total number of wheels for this vehicle is " + wheelNo);
	}
		
	
		
}
	
	
	
