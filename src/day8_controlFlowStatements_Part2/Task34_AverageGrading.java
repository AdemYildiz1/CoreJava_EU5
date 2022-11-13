package day8_controlFlowStatements_Part2;

public class Task34_AverageGrading {

	public static void main(String[] args) {
		int math = 59;
		int chemistry = 60;
		int biology = 71;
		double average;
		average = (math + chemistry + biology) / 3;
		System.out.println("average: "+ average);

		if (average <= 100 && average >= 90) {
			System.out.println("Grade A");
		} else if (average <= 89 && average >= 80) {
			System.out.println("Grade B");
		} else if (average <= 79 && average >= 70) {
			System.out.println("Grade C");
		} else if (average >= 60 && average <= 69) {
			System.out.println("Grade D");
		} else if (average > 0 && average <= 59) {
			System.out.println("Grade F");
		}else {
			System.out.println("invalid");//it is not mandatory so without it code works perfectly
		}

	}

}
