package day9_controlFlowStatement_Part3;

public class Difference_AssigmentAndEqualSign {

	public static void main(String[] args) {

		boolean b1 = true;
		boolean b2 = false;

		if (b2 = b1) { // means assign b1 to b2 so in parenthesis will be TRUE.
			if (2 == 3) { // means is 2 equal to 3?
				System.out.println("ADEM");
			} else {
				System.out.println("yildiz");
			}

		} else {
			System.out.println("arzu");
		}

	}

}
