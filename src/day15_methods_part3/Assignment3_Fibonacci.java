package day15_methods_part3;

public class Assignment3_Fibonacci {

	public static void main(String[] args) {
		
		// Fibonacci num= 0 1 1 2 3 5 8 13 21 31 (there is algorithm here)
		// 0+1=1; 1+1=2, 1+2=3, 2+3=5, 3+5=8,... so on. !!her seferinde ikinci numara birinci oluyor, toplamda ikinci numara oluyor
		
		int count=8;
		int pre1=0,pre2=1;
		System.out.println("Fibonacci series of "+ count+" numbers");
		
		for(int i =0; i<count; i++) {
			
			System.out.println(pre2+ " ");
			
			int sumOfPrevTwo=pre1+pre2;
			pre1=pre2;
			pre2=sumOfPrevTwo;
		}
        // (above) on each iteration, we are assigning second number to the first number and
		//assigning the sum Of last Two numbers to the second number.
		//(yani fibonacci toplam algoritmasinda; her seferinde ikinci numara birinci oluyor, toplamda ikinci numara oluyor.
	}

}
