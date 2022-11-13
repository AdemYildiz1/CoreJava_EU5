package day25_arrays_part2;

public class PassArrayToMethod_1 {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40 };
		
		showArray(numbers);

	}
	public static void showArray(int[] myArray) {
		
		for(int value:myArray) {
			System.out.println(value);
			
		}	
		
	}

}
