package lab6;

import java.util.*;

public class FanModel {
	
	
	public static void main(String[] args) {

		Fan fanA = new Fan(0, null);
		Fan fanB = new Fan(100, "brown");
		
		
		fanA.setColor("Yellow");
		fanA.setRadius(10);
		
		System.out.println("The radius of the fan is " + fanA.toString());
		System.out.println("The color of the fan is " + fanA.getColor());

		System.out.println("The radius of the fan is " + fanB.toString());
		System.out.println("The color of the fan is " + fanB.getColor());
		

		
	}

}
