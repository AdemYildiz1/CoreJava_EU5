package day38_inheritance_part2;

public class Contractor extends Employee{

	//we can add OVERRIDE method with short cut (right click then choose source then override/implement) 
	@Override
	public void calculatePay(int hours, double rate) {
		double total=(hours*rate)+200;
		System.out.println("Contractor total pay: "+total);
		
		
	}

	
	
}
