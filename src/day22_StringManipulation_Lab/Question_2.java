package day22_StringManipulation_Lab;

public class Question_2 {

	public static void main(String[] args) {
		
		System.out.println(makeAbba("Hi", "Bye"));
		System.out.println(makeAbba("Yo", "Alice"));
		System.out.println(makeAbba("What", "Up"));
	}
	public static String makeAbba(String str1, String str2) {
	
		//return str1.concat(str2).concat(str2).concat(str1);// first way
		
		return str1+str2+str2+str1; //2nd way
	}

}


