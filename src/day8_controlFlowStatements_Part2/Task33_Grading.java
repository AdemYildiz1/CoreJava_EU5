package day8_controlFlowStatements_Part2;

public class Task33_Grading {

	public static void main(String[] args) {

		double marks = 70;

		if (marks < 60) {
			System.out.println("Fail");
		} else if (marks >= 60 && marks < 90) {
			System.out.println("pass");
		} else if (marks >= 90) {
			System.out.println("Passed with distinction");
		} else {
			System.out.println("invalid score");

		}

	}

}
