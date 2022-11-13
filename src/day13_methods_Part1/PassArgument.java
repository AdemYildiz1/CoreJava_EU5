package day13_methods_Part1;

public class PassArgument {

	public static void main(String[] args) {
		
		int x = 5; // it can not be double or bigger it must be same data type or small
		
		displayValue(10);
		
		displayValue(x);
		
		displayValue(x*4);

	}
	
	public static void displayValue (int num) {
		System.out.println("The value is "+ num);
		
		
		
	}

}
