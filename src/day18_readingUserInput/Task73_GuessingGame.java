package day18_readingUserInput;

import java.util.Scanner;

public class Task73_GuessingGame {

	public static void main(String[] args) {

		int	userInput;                  //you need to put those two out of do loop
		int secretNumber=8;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		do {
		userInput=sc.nextInt();
		
		if(userInput<secretNumber) {
			System.out.print("Enter a bigger number");
		}else if(userInput>secretNumber){
			System.out.print("Enter a smaller number");
		}else {
			System.out.println("Congrat you got it...");
		}
				
		}while(userInput!=secretNumber);
		
	}

}
