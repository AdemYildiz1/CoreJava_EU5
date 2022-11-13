package day30_wrapperClass;

public class WrapperClassesMethods {

	public static void main(String[] args) {
		
		System.out.println(Byte.MIN_VALUE);//-128
		System.out.println(Byte.MAX_VALUE);//128
		
		System.out.println(Integer.MIN_VALUE); 
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		System.out.println(Character.isAlphabetic('a'));//true, **QUESTION why is out put true or false(answer below)
		System.out.println(Character.isAlphabetic('1'));//false            "
		
		System.out.println(Character.isLetter('j'));//true                 "   
		System.out.println(Character.isLetter('&'));//false                "
		
		System.out.println(Character.isDigit('5'));//true
		System.out.println(Character.isDigit('P'));//False
		
		// in work environment might be used like that
		String word="java101";
		System.out.println(Character.isAlphabetic(word.charAt(0)));//true,   because j is alphabetic
		System.out.println(Character.isDigit(word.charAt(6)));// true,  it is 1
		
		
		//**ANSWER: because their method type is boolean its out put true or false(like below)
		
		//public static Boolean isLetter(char  ) {}
		
	}

}
