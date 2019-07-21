package labTest2;

class Car extends Vehicle {
	
	
	private double age;
	
	public Car() {
		super(4);
		this.age = 1;
			
	}
	
	public Car(double age, int wheelNo) {
		super(wheelNo);
		this.age = age;
		
	}
	
	public void setAge(double setAge) {
		age = setAge;
	}
	
	public double getAge() {
		return age;
	}
	
	
	public void describe() {
		super.describe();
        String d = " and has been used for "+ age + " years. ";
		System.out.println(d);
		
		if (age < 3) {
			System.out.println("It is relativrly new");
		} else if (age > 9) {
			System.out.println("It is relatively old");
		} else if (age >= 7) {
			System.out.println("You may consider scrapping the car.");
		}
	}
		

}


