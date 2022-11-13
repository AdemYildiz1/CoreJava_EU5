package day33_classObject_Constructor;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		
		//I wan to get value from user
		Scanner sc = new Scanner (System.in);
		
		String input; // this is local variable in main method
		
		System.out.println("What is your starting balance?");
		
		input=sc.next();
		
		BankAccount account= new BankAccount(input); // here I want to get string initial/first input from user as a parameter 
		                                             //so that it can be passed it to CONSTRUCTOR that has String.
		
		System.out.println("How much were you paid this month?");
		
		input=sc.next();
		
		account.deposit(input); // here I want user to deposit and pass it to deposit METHOD.
		
		System.out.println("Your pay has been deposited. your current balance is: "+ account.getBalance());
	}

}
