package day4_arithmeticOperators;

public class arithmeticOperators {

	public static void main(String[] args) {
		
		//Addition Operator +
		System.out.println(55+5);
		
		// practice addition with variable
		int chairs= 140;
		System.out.println(chairs+2);
		
		int tables=130;
		int total= tables+chairs;
		System.out.println(total);
		
		//Subtraction -
		System.out.println(55-5);
		
		// practice Subtraction with variable
		double balance=1200.50;
		double transaction= 56.44;
		System.out.println(balance- transaction);
		
		balance=balance-transaction;
		System.out.println(balance);
		
		// Example: create a variable linesOfCode and assign 50 and print "Lines of Code 50"
		// delete 2 lines 
		// decrease the value of LinesOfCode by 2 and print "Lines of Code 48"
		
		int linesOfCode=50;
		System.out.println("Lines of Code "+ linesOfCode);
		
		linesOfCode=linesOfCode-2;
		System.out.println("Lines of Code "+ linesOfCode);
		
		//Multiplication *
		System.out.println(22*2);
		
		// practice Multiplication with variable
		int classes = 5;
		System.out.println(linesOfCode*classes);
		int TotalLinesOfCode=linesOfCode*classes;
		System.out.println("Total Lines of Code = " + TotalLinesOfCode);
		
		// division / 
		System.out.println(10/2);
		
		//System.out.println(11/0);   throw error while running the code
		
		//Remainder %
		System.out.println(10%2);
		System.out.println(9%2);
		
		
		

	}

}
