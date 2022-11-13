package day13_methods_Part1;

public class CreditCardMethod {

	public static void main(String[] args) {
		
		double salary= 50000;
		int creditRating=5;
		
		if(salary>=2000&&creditRating>=7) {
			qualify();
		}else {
			noQualify();
			
		}
		

	}

	public static void noQualify() {
		System.out.println("I am sorry, you are not qualified for the cc");
		
	}

	public static void qualify() {
		System.out.println("congrat, you are the qualified for the cc");
		
	}
	
	

}
