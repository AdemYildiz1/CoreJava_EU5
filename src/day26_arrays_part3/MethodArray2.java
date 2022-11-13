package day26_arrays_part3;

import java.util.Scanner;

public class MethodArray2 {

	public static void main(String[] args) {
		
	System.out.println(findCar(3,"honda"));
		
		}
	public static String[] createArray(int carSize) {
		
		Scanner sc=new Scanner (System.in);
		
		String[] myArray=new String[carSize];
		
		for(int i=0; i<myArray.length; i++) {
			
			System.out.print("Enter your car #"+(i+1)+": ");
			myArray[i]=sc.next();
		}
		return myArray;
	}
	public static boolean findCar(int value,String tofindCar) {
		
		for(String car:createArray(value)) {
			
			if(car.equalsIgnoreCase(tofindCar)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	}



