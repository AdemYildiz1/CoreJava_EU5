package day4_arithmeticOperators;

public class Contribution {

	public static void main(String[] args) {
		
		
		/* calculate the amount of pay that will be contributed to 
		   a retirement plan if 5%, 8%, or 10% of monthly pay is withheld. 
		  */ 
		
		int MonthlyPay= 6000;
		
		double FirstContribution;
		double SecondContribution;
		double ThirdContribution;
		
		FirstContribution=MonthlyPay*0.05;
		SecondContribution=MonthlyPay*0.08;
		ThirdContribution=MonthlyPay*0.1;
		
		System.out.println("First Contributed is $"+ FirstContribution +" Per Month.");
		System.out.println("Second Contributed is $"+SecondContribution+ " Per Month.");
		System.out.println("Third Contributed is $"+ ThirdContribution+ " Per Month.");
		
		

	}

}
