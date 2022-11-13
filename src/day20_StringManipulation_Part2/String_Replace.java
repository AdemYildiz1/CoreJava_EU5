package day20_StringManipulation_Part2;

public class String_Replace {

	public static void main(String[] args) {

		//replace("a","b") basically you change a  with b in your string.
		
		String str = "Moscow is a capital of Russia";

		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");// you can replace one more than one
																			//  by using again full stop.
		System.out.println(str);
		
		//example
		
		String email="firstName_LastName@gmail.com";

		String company="Capitolone";
		
		String newEmail=email.replace("gmail", company);
		
		System.out.println(newEmail);
	}

}
