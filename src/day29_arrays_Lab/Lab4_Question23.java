package day29_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question23 {

	public static void main(String[] args) {

		int a= 4; //you can  write "x" instead of "a"

		System.out.println((Arrays.toString(fizzArray(a))));
		
	}
	public static int[] fizzArray(int x) {
		
		int []arr=new int[x];
		
		for(int i =0; i<arr.length; i++) {
			
			arr[i]=i;
			
		}
		return arr;
	}
	

}
