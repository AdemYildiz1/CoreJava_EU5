package day10_controlFlowStatement_part4;

public class Task45_RepeatedBiggerNumber {

	public static void main(String[] args) {
		
		int a=5,b=5;
		int repeat=3;
 
		for(int i=1; i<=repeat; i++) {
			if(a>b) {
				System.out.println("a is bigger than b");
			}else if (b>a) {
				System.out.println("b is bigger than a");
			}else {
				System.out.println("a is equal to b");
			}
			
		}

	}

}
