package day4_arithmeticOperators;

 // This program calculates hourly wages plus overtime
public class Wages {

	public static void main(String[] args) {
		
		
		double RegularWage; 
		double BasePay=25.75;
		double RegularHours=40;
		double OverTimeWages;
		double OverTimePay=37.5;
		double OverTimeHours=10;
		double TotalWage; 
		
		RegularWage=BasePay*RegularHours;
		OverTimeWages=OverTimePay*OverTimeHours;
		
		TotalWage=RegularWage+OverTimeWages;
		
		System.out.println("Wages for this week are $ "+ TotalWage);
		
		
		
		

	}

}
