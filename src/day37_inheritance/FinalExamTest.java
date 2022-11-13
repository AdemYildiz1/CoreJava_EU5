package day37_inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter number of questions in the Exam: ");
		int x= sc.nextInt();

		System.out.print("Enter number of Missing questions from student: ");
		int y= sc.nextInt();

		FinalExam myGrade=new FinalExam(x,y);
		
		System.out.println("The Grade for the exam "+ myGrade.getGrade());//B , 
		//to be able to print, it first goes to FinalExam class but it can not find getGrade() there, 
		//so it understands that getGrade() is inherited from GradeActivity.
	

	}

}
