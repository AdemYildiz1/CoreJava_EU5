package day10_controlFlowStatement_part4;

public class Task41_OddNumbers {

	public static void main(String[] args) {

		for (int i = 5; i <= 140; i++) {
			if (i % 2 == 1) {   // or you can use if(i%2!=0)
				System.out.print(i + " ");
			}
		}

	}

}
