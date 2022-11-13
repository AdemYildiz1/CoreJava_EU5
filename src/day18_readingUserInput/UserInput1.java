package day18_readingUserInput;

import java.util.Scanner; 

public class UserInput1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);     
		
		System.out.print("Enter a byte value:"); 
		byte b1=sc.nextByte();
		System.out.println("Byte value is: "+b1);
		
		System.out.print("Enter a short value: ");
		short s1=sc.nextShort();
		System.out.println("short value is: "+s1);
		
		System.out.print("Enter an integer value: ");
		int i1=sc.nextInt();
		System.out.println("integer value: "+ i1);
		
		System.out.print("enter long value: "); 
		long l1=sc.nextLong();
		System.out.println("long value is: "+l1);
		
		System.out.print("Enter a double value: ");
		double d1=sc.nextLong();
		System.out.println(d1);
		
		System.out.print("Enter a boolean value: ");
		boolean bool=sc.nextBoolean();
		System.out.println("boolean value is: "+bool);
		
		
		
		
	}

}
