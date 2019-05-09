package lab7;

import java.util.*;

//The Employee class is a base class. It is intended to be
//extended and each of its subclasses need to override the
//calcWeeklySalary() method based of the type of employee.

public class Employee{
	String name, serial;
	float weeklySalary;
	
	public Employee(){
		name = "";
		serial = "";
	}
	
	public Employee(String name, String serial){
		this.name = name;
		this.serial = serial;
	}
	
	public String getName(){
		return name; 
	}
	
	public float getWeeklySalary() { return weeklySalary; }

	//The salary calculation is different for each type of employee 
	//Here is a basic weeklySalary. 
	
	public void calcWeeklySalary(){
    	weeklySalary = 15 * 5;//take ITP student as an example
    }
}
