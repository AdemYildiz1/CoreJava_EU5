package day9_controlFlowStatement_Part3;

public class IfElseRules {

	public static void main(String[] args) {

		// RULE say; if you have just one statement you may not use curly braces(not
		// recommended:)
		if (false)
			System.out.println("hello");
		else
			System.out.println("bye");

		System.out.println("******************************************");

		// if you put two or more statements without curly braces, 
		// second and following statements are independent.
		if (true)
			System.out.println("hello");
		    System.out.println("running");

	}

}
