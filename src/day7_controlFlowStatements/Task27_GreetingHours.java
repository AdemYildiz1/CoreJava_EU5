package day7_controlFlowStatements;

public class Task27_GreetingHours {

	public static void main(String[] args) {

		int hour = 17;

		if (hour < 12) {
			System.out.println("Good morning");

		}

		if (hour >= 12 && hour < 15) {

			System.out.println("Good afternoon");
		}

		if (hour >= 15) {

			System.out.println("Good evening");
		}

	}

}
