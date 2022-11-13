package day10_controlFlowStatement_part4;

public class Turnary_LargestNumber {

	public static void main(String[] args) {
		int a,b,c;
		a=50;
		b=70;
		c=80;
		String maxNumber=" ";
		if(a!=b&&a!=c&&b!=c) {
			maxNumber=(a>b&&a>c)?"a":(b>c)? "b":"c";
		}
		System.out.println(maxNumber);
        
		// TURNARY KALIBI
		// (condition)? statement--- If demek.
		// (condition): statement---else demek
		// :(condition)? statement---else if demek
		//NOT! : ve ? simgeleri esit sayida olmali yoksa code yanlis demek
	}

}
