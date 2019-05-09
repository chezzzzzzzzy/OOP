package lab7;

public class Salesman extends Employee {
	
	String region;
	private float baseWkPay, totalWkSales, commission;
	
	Salesman a = new Salesman();

	
	public Salesman(){//no arg constructor to initialize basic info 
		totalWkSales = 0.0f;
		commission = 0.10f;		//base rate is 10%
		baseWkPay = 250.0f;		//base pay is $250/week
	}
	
	public Salesman(String name, String serial, String reg, float basePay, float salesTotal, float comm){
		/*another constructor takes in parameters to initialize more variables*/
		super(name, serial);
		region = reg;
		totalWkSales = salesTotal;
		commission = comm;
		baseWkPay = basePay;
	}
	
	public void calcWeeklySalary(){
		/*Add your own codes here to override employee’s calcweeklySalary here*/
		// weeklySalary = baseWkPay + totalWkSales*commission
		weeklySalary = baseWkPay + totalWkSales * commission;
		
		
		
	}


}
