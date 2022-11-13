package day22_StringManipulation_Lab;

public class Question_1 {
	//Create a method that accepts 1 string, e.g. "Bob", return a greeting of the form "Hello Bob!".
	/*
	 helloName("Bob") "Hello Bob!"
	 helloName("Alice")  "Hello Alice!"
	 helloName("X") "Hello X!" 
	 */
	public static void main(String[] args) {
		
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("x"));
	}
	public static String helloName(String str) {
		
		return "hello".concat(str).concat("!");
				
				
	}

}
