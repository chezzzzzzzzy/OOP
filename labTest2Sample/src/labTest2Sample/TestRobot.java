package labTest2Sample;


public class TestRobot {
	
	public static void main(String[] args) {
		
		
		DemoRobot r2 = new DemoRobot(true, 1000);
		
		r2.getLegsBroken();
		
		r2.setAge(200);
		r2.getAge();
		
		r2.setLegsBroken(false);
		
		System.out.println(r2.getAge());
		System.out.println(r2.selfIntro());


		
		
		


	}
	
}
