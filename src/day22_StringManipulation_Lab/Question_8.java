package day22_StringManipulation_Lab;

public class Question_8 {

	public static void main(String[] args) {

		System.out.println(left2("Hello"));
		System.out.println(left2("java"));
		System.out.println(left2("Hi"));

	}

	public static String left2(String str) {
		String str1;

		if (str.length() < 2) {
			return "invalid";

		} else {
			str1 = str.substring(2).concat(str.substring(0, 2));
			return str1;
		}
		   //return str1;   can be here as well instead of adding in the local variable

	}
}
