package day5_unary_assignment_relational_Operators;

public class task18_PrePostDecrementIncrement {

	public static void main(String[] args) {
	
		
		//ex-1
		int x=2;
		int y= x++;
		
		System.out.println(x);//3
		System.out.println(y);//2
	
		
		//ex-2
		int x1=2;
		System.out.println(x1++);//2
		
		//ex-3
		int x2=2;
		System.out.println(--x2);
		
		//ex-4
		
		int x3=8;
		y=x3--;
		System.out.println(y);//8 so it prints old value(8) but memory decreases by 1

	}

}
