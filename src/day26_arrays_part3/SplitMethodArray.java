package day26_arrays_part3;

import java.util.Arrays;

public class SplitMethodArray {

	public static void main(String[] args) {

		// Split() method splits string into array based on delimiter 
		// that can be character or spaces. in our array we don't have that delimiter any more!

		String str = "it will display the array of the size";

		String[] arr = str.split(" "); // now it splits the str from each spaces 
		                                // and becomes an array with 8 elements
		System.out.println(arr[0]);

		System.out.println(arr[2]);//display
		
		System.out.println(arr.length);// 8 (it, will....)
		
		System.out.println(Arrays.toString(arr));// it prints [it, will, display, the, array, of, the, size]
		
		for(String value:arr) {
			System.out.println(value); // it prints each element one by one 
		}
	}

}
