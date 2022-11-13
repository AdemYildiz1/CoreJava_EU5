package day7_controlFlowStatements;

public class Task28_RevenueCalculation {

	public static void main(String[] args) {
		
		double price=100;
		int quantity=200;
		double revenue;
		double discount=0;
	
		revenue=price*quantity;
		
		if (revenue>5000) {
			
		discount=revenue*0.1;
		revenue=revenue-discount;
		
		}
		   System.out.println("revenue= "+ revenue);


	}

}
