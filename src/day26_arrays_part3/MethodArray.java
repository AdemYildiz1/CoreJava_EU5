package day26_arrays_part3;

import java.util.Random;

public class MethodArray {

	public static void main(String[] args) {

		//let's create two method one of them for creating (to return) one of them for printing array

		printArray(5);
		

	}
	public static int[] createArray(int arraySize) {
		
		Random rn=new Random();
		
		int[] myArray=new int[arraySize];
		
		for(int i=0; i<myArray.length; i++ ) {
			myArray[i]=rn.nextInt(100); // I assigned random value for each element
			
		}
		return myArray;
	}
	public static void printArray(int number) {
		
		for(int value : createArray(number)) { // here "number" is assigned "arraySize"
			System.out.println(value);
		}
		// if I want to print myArray that can return already, so here I need to call it "createArray(number)"
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
