package day23_stringManipulationLab_randomClass;

import java.util.*;

public class MathTutor {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int sum;
		int userAnswer;
		
		Scanner sc=new Scanner (System.in); 
		Random rn = new Random();
		
		num1=rn.nextInt(100);
		num2=rn.nextInt(100);
		
		sum=num1+num2;
		
		System.out.println("What is the answer to the following problem?");
		System.out.print(num1+ " + "+ num2+ " = ?");
		
		userAnswer=sc.nextInt();
		
		if (userAnswer==sum) {
			System.out.println("Correct you got it!");
		}else {
			System.out.println("sorry, wrong answer. The correct answer is " + sum);
		}
		

		
	}

}
