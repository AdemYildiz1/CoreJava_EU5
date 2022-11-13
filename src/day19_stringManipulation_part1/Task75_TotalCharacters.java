package day19_stringManipulation_part1;

import java.util.Scanner;

public class Task75_TotalCharacters {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
        
		System.out.print("Enter your first name: ");
		
		String firstName=sc.next(); 
		
		int x=firstName.length();
		
		System.out.print("Enter your second name: ");
		
		String lastName= sc.next();
		
		int y=lastName.length();
		
		System.out.println("total length= " +(x+y) );
		
		
	}

}
