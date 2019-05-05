package lab6;

import java.util.*;

public class Fan {
	
	Scanner getInput = new Scanner(System.in);
	
	private double radius = 5;
	private String color = "White";
	
	public Fan(double r, String c) {
		
		radius = r;
		color = c;
		
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double dbRadius) {
		radius = dbRadius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String strColor) {
		color = strColor;
	}
	
	public String toString() {
		String radToStr = Double.toString(getRadius());
		return radToStr;
	}
	
	
	public static void main(String[] args) {
		
	}
	
	
	
}
