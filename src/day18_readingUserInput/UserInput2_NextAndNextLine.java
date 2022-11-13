package day18_readingUserInput;

import java.util.Scanner;

public class UserInput2_NextAndNextLine {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Provide a sentence and I will repeat it:");
		
		String str=sc.next(); // you can only add one word to get that value
		
		System.out.println(str);
		
		String str2=sc.nextLine(); // You can use more than one word with space
		
		System.out.println(str2);

	}

}
