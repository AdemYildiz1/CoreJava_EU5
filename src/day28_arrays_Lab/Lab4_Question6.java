package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question6 {

	public static void main(String[] args) {

		int[]x= {1,2,3};
		int[]y= {1,3,6,9,125,6,89};

		System.out.println(Arrays.toString(Greatest(x)));//[3, 3, 3]
		System.out.println(Arrays.toString(Greatest(y)));
	}
	public static int[] Greatest(int[]arr) {
		
		int max=arr[0]; // firstly I assumed my first number is max 
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i+1]>max) {  // check my second number is bigger. if so, then it will be new max
				
				max=arr[i+1];
			}
		}
		for(int i=0; i<arr.length; i++) {
			arr[i]=max;   // after finding max I changed each element with the max
		}
		return arr;
	}

}
