package day8_controlFlowStatements_Part2;

public class IfElseIfElse {

	public static void main(String[] args) {

		// program to display days
		// 1-Monday
		// 2-Tuesday
		// 3-Wednesday
		// 4-Thursday
		// 5-Friday

		int day = 4;

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else {
			System.out.println("Not a valid day");
		}
		System.out.println("****************************************************");
		int age = 20;

		if (age < 2 || age > 18) {
			System.out.println("ineligable");
		} else if (age == 2) {
			System.out.println("toddler");
		} else if (age >= 3 && age <= 5) {
			System.out.println("early childhood");
		} else if (age == 6 || age == 7) {
			System.out.println("young Reader");
		} else if (age >= 8 & age <= 10) {
			System.out.println("elementery");
		} else if (age == 11 || age == 12) {
			System.out.println("middle");
		} else if (age == 13) {
			System.out.println("impossible");
		} else if (age >= 14 && age <= 16) {
			System.out.println("high school");
		} else if(age==17||age==18) {
			System.out.println("scholar");
		}
		

	}

}
