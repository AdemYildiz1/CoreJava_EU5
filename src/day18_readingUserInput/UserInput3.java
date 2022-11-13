package day18_readingUserInput;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int i1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int i2 = sc.nextInt();
            
		//sc.nextLine();   //RULE!!!! we need to add this method
		                 //whenever you are using string after primitive data types(int,long..etc)
		                 //otherwise it prints without asking entering any value
		System.out.print("Enter a string: ");  
		String str = sc.nextLine();

		System.out.println("output: " + ":" + i1 + i2 + ":" + str);

	}

}
