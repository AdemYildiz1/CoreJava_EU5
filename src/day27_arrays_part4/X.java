package day27_arrays_part4;

import java.util.Arrays;

public class X {

	public static void main(String[] args) {
		
		
		int k[]= {1,2,3};
		//int l[]= {7,3};
		
		System.out.println(Arrays.toString(maxEnd(k)));

	}
	public static int[] maxEnd(int [] a)  {
		 
		int max= a[0];
		
		for(int i=0; i<a.length-1; i++) {
		
			if (a[i+1]>max) {
				
				max=a[i+1];
				
			}
			
		}
		
		//return max;
		
		for(int i =0; i<a.length; i++) {
			a[i]=max;
		}
		return a;
	}
	
}
