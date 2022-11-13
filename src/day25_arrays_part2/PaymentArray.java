package day25_arrays_part2;

import java.util.Scanner;

public class PaymentArray {

	public static void main(String[] args) {
		
		/*This program stores in an array the hours worked by 5 employees 
		 who all make the same hourly
		 display their gross pay.*/
		
		Scanner sc=new Scanner(System.in);
		
		double grossPay=0;
		double PayRate=0;
		
		int[] employees= new int[5];
		
		System.out.println("Enter hours worked a day: ");
		
		for(int i=0; i<employees.length; i++) {
		 employees[i]=sc.nextInt();  
		}
		
		System.out.print("Enter payRate: ");
			PayRate=sc.nextDouble();
	
		for(int i=0; i<employees.length; i++) {
			
			grossPay= PayRate*employees[i];
			System.out.println("salary of employee #"+(i+1)+" is "+ grossPay);
		}

	}

}
