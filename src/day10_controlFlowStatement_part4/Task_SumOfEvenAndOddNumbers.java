package day10_controlFlowStatement_part4;

public class Task_SumOfEvenAndOddNumbers {

	public static void main(String[] args) {
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sumEven=sumEven+i; 
				
			}else {
				sumOdd=sumOdd+i;  //0+1=1+3=4+5.....
			}
		}
		System.out.println("Sum of even number "+sumEven);
		System.out.println("Sum of odd number "+sumOdd);
	}

}
