package day25_arrays_part2;

import java.util.Arrays;

public class Task92_TableArray {

	public static void main(String[] args) {
		
		
		int[] numbers= new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			
			numbers[i]=i+1;
		}
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]*19);
		}
		// "to string" if we want to reach and print our array format and elements so we use string method.
		
		System.out.println(Arrays.toString(numbers));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	}

}
