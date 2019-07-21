package lab7;

import java.util.*;

public class BoxFanModel {
	
	public static void main(String[] args) {
		
		BoxFan newFan = new BoxFan();
		
		newFan.setRadius(1000);
		newFan.setColor("Blue");	
		newFan.setTiming(3021);
		
		System.out.println("The radius of newFan is: " + newFan.getRadius() + "\n" + "The color of newFan is: " + newFan.getColor() + "\n" + "The timing of newFan is: " + newFan.getTiming());
		
	}
	
	

}
