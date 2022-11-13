package day45_exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		//if there is exception/error, catch block runs  
	
		try {
			
			String str="JAVA";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5)); //here error happens so it skipped rest of code and goes to Catch block
			System.out.println(str.charAt(1)); // will not be executed
			
		}catch(Exception e) { //here, Exception class catches error and you can report your exceptions
			
			System.out.println("Exception happened in try block and was cought"); 
		}
		
		System.out.println("After try catch block");
		
	}
	
	//if there is no error in try block, then catch block will not executed
	//means try block and after catch block are executed.

}
