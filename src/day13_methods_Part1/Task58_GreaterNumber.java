package day13_methods_Part1;

public class Task58_GreaterNumber {

	public static void main(String[] args) {
		
		GreaterNumber();

	}
	
	public static void GreaterNumber() {
		int a=60;
		int b=60;
		
		if(a==b) {
			System.out.println("They are equal");
			
		}else if (a>b) {
			System.out.println(a+ " is greater than "+ b);
			
		} else{
			System.out.println(b+ " is greater than "+ a);
			
		   }
		}	
	}


