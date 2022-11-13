package day11_controlFlowStatements_part5;

public class Task50_CreatePattaern3 {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows; i++) {

			for (int b = 1; b <= i; b++) {

				System.out.print(b + " ");

			}

			System.out.println();

		}

	}
}
