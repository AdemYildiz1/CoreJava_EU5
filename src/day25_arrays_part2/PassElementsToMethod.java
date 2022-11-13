package day25_arrays_part2;

public class PassElementsToMethod {

	public static void main(String[] args) {

		int[] numbers = { 5, 10, 15, 20, 50, 30 };

		for (int value : numbers) {

			showValue(value); // each value goes to the method one by one and printed
		}

	}

	public static void showValue (int n) {

		System.out.print(n + " ");

	}

}
