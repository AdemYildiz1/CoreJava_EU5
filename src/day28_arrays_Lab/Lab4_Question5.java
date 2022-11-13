package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question5 {

	public static void main(String[] args) {
	
		int[]x= {1,2,3};
		int[]y= {17,12,10,8};
		
               System.out.println(Arrays.toString(RotatedLeft(x)));
               System.out.println(Arrays.toString(RotatedLeft(y)));
	}
	public static int[] RotatedLeft(int[]arr) {
		
		int a =arr[0];
		
		for(int i=0; i<arr.length-1; i++) {
			
			arr[i]=arr[i+1]; // here 2nd element is assigned to previous one
			
		}
		arr[arr.length-1]=a; // here we assigned first index to the last index
		
		return arr;
	
		
		
	
	}

}
