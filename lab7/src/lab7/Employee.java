package lab7;

import java.util.*;

//The Employee class is a base class. It is intended to be
//extended and each of its subclasses need to override the
//calcWeeklySalary() method based of the type of employee.

public class Employee{
	String name, sn;
	float weeklySalary;
	
	public Employee(){
		name = "";
		sn = "";
	}
	
	public Employee(String name, String sn){
		this.name = name;
		this.sn = sn;
	}
	
	public String getName(){
		return name; 
	}
	
	public float getWeeklySalary() { 
		return weeklySalary; 
	}

	
	public void calcWeeklySalary(){
    	weeklySalary = 15 * 5;
    }
}
