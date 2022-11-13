package day29_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question29 {

	public static void main(String[] args) {
 //changes all the values following it to be that multiple of 10, till another multiple of 10.
		
		int[]x={2,10,3,4,50,5,40,47,6,8};
		
         System.out.println(Arrays.toString(multiple10(x)));
	}
	public static int[] multiple10(int[]arr) {
		
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%10==0) { //after finding multiple 10, we have to make loop again so that check next element.
				
				for(int j=i+1; j<arr.length && arr[j]%10!=0; j++) {  // condition can be more than j<arr.length
					                                                 //it means it works till End, and multiple 10
					arr[j]=arr[i];
					
				}
			}	
		}
		return arr;
	}

	
}
