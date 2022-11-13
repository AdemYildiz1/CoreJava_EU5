package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question9 {

	public static void main(String[] args) {
		
		int[]x= {4,5,6};
		
		System.out.println(Arrays.toString(doubleSameLast(x)));

	}
	public static int[] doubleSameLast(int[]arr) {
		
		int[] newArr=new int[arr.length*2];
		 
		newArr[newArr.length-1]=arr[arr.length-1];
		
		 return newArr;
	}
	   

}




