package lab7;

public class Salesman extends Employee {
	
	String region;
	private float baseWkPay, totalWkSales, commission;
	

	
	public Salesman(){//no arg constructor to initialize basic info 
		totalWkSales = 0.0f;
		commission = 0.10f;		//base rate is 10%
		baseWkPay = 250.0f;		//base pay is $250/week
	}
	
	public Salesman(String name, String sn, String reg, float basePay, float salesTotal, float comm){
		super(name, sn);
		region = reg;
		totalWkSales = salesTotal;
		commission = comm;
		baseWkPay = basePay;
	}
	
	
	@Override
	public void calcWeeklySalary(){
		
		weeklySalary = baseWkPay + totalWkSales * commission;	
		System.out.println(weeklySalary);
	}


}
