package day13_methods_Part1;

public class Task59_CalculatePay {

	public static void main(String[] args) {
		
		payCalculator(5,10);
		payCalculator(37, 9.3);

	}
	
	public static void payCalculator (double numberOfHours, double hourlypay) {
		
		double pay=numberOfHours*hourlypay;
		
		System.out.println(pay);
		
	}

}
