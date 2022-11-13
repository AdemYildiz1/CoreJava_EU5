package day25_arrays_part2;

import java.util.Random;

public class Task91_RandomArrayNumbers {

	public static void main(String[] args) {

		Random rn = new Random();

		int[] myArray=new int[10];
		
		for(int i=0; i<myArray.length; i++) {
			
			myArray[i]=rn.nextInt(100);
			//System.out.println(myArray[i]); //or we can do 2. loop for printing
		}
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		
	}

}
