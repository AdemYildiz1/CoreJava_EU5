package day22_StringManipulation_Lab;

public class Question_7 {

	public static void main(String[] args) {

		System.out.println(comboString("Hello", "hi"));
		System.out.println(comboString("hi", "Hello"));
		System.out.println(comboString("aaa", "b"));

	}

	public static String comboString(String str1, String str2) {

		if (str1.length() < str2.length()) {
			return str1 + str2 + str1;
		} else {
			return str2 + str1 + str2;
		}
         // it can be done with concat as well
		
		
	}
}
