package day23_stringManipulationLab_randomClass;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random rn = new Random();
		//if you run continuously it gives different numbers each time
		System.out.println(rn.nextInt());
		
		System.out.println(rn.nextDouble());
		
		System.out.println(rn.nextFloat());
		//if you run continuously it gives randomly true or false
		System.out.println(rn.nextBoolean());
		
		// in work environment we usually use nextInt()/nextInt(n);
		
		System.out.println(rn.nextInt(50));// it gives randomly number between 0-49
		
		System.out.println(rn.nextInt(10));// between 0-9(0 included but 10 not.)
		
		//example; return number between 5-15 (i want specific numbers)
		
		System.out.println(rn.nextInt(10)+5); // which means add number 5 to both border (0+5-10+5)
		                                      // so it gives randomly number between 5-14
	}

}





