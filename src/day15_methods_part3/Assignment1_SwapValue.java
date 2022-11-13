package day15_methods_part3;

public class Assignment1_SwapValue {

	public static void main(String[] args) {
		
		//solution-1 by using 3rd variable
		
		int a=10;
		int b=20;
		int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("----------------------------");
		
		//solution-2 without using 3rd variable
		
		a=a+b; //a becomes 30 
		b=a-b; //b becomes 10
		a=a-b; //a becomes 20
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
