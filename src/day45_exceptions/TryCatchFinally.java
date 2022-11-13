package day45_exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		//finally block always runs either we have error/exception or no
		//one of the aim of it is to close date base either we have error or not.
		//Or if we want some code to be always executed we can move it finally
		//finally block stop executing if Only;
		//1- jvm crashes or 2- exception is thrown in finally code
		
		
		String str="Selenium";
	
		
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(100));
			
		}
 		catch(Exception e) {
			System.out.println("Enter the correct index");
			
		}
		finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Bye...");
	}

}
