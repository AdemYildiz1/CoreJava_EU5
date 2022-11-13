package day7_controlFlowStatements;

public class IfStatements {

	public static void main(String[] args) {

		// int score =60; // it is false so "if" condition doesn't work
		int score = 80; // it is true so, "if" condition works

		if (score >= 70) {

			System.out.println("Excellent");
			System.out.println("You passed with grade A ");

		}
		System.out.println("***********************************************");

		int sales, bonus;
		double commisionRate, salary;

		sales = 5200;
		salary = 10_000;

		if (sales > 5000) {
			bonus = 500;
			commisionRate = 1.12;

			salary = salary * commisionRate + bonus;

		}

		System.out.println("salary = " + salary);

	}

}
