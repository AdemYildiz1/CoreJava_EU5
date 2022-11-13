package day7_controlFlowStatements;

public class SmallTaskS {

	public static void main(String[] args) {

		// Write if statement that assigns 5 to x when y is equal to 20
		int x, y = 20;
		x = 10;

		if (y == 20) {

			x = 5;
		}
		System.out.println("x =" + x);

		// Write an if statements that multiplies pay rate by 1.5 if hours is grater
		// than 40

		double payRate, hours = 50;
		payRate = 1000;

		if (hours > 40) {

			payRate = payRate * 1.5;

		}
		System.out.println("Payrate = " + payRate);

		// Write an if statements that sets the variable fees to 50 if the Boolean
		// variable max is true
		int fee = 100;
		boolean max = true;

		if (max == true) {
			fee = 50;

		}
		System.out.println("fee is " + fee);

		// Write an if statements that assigns 20 to the variable a, if variable b is 50
		// AND c is grater and equal to 100.

		int a, b, c;
		a = 100;
		b = 50;
		c = 300;

		if (b == 50 && c >= 100) {

			a = 20;

		}
		System.out.println("a = " + a);

		// Write an if statements that prints " Ideal Temp" if the temp is between 70
		// and 80

		double Temp = 75;

		if (Temp >= 70 && Temp <= 80) {
			System.out.println("Ideal Temp"); // print kismini condition un kendi icinde istedigi icin curly brace icine
												// yazdik
			
		}
	

	}

}
