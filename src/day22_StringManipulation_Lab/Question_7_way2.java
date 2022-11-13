package day22_StringManipulation_Lab;

public class Question_7_way2 {

	public static void main(String[] args) {

		System.out.println(comboString("Hello", "hi"));
		System.out.println(comboString("hi", "Hello"));
		System.out.println(comboString("aaa", "b"));

	}

	public static String comboString(String str1, String str2) {

		String str;

		if (str1.length() < str2.length()) {
			str = str1.concat(str2).concat(str1);

		} else {
			str = str2.concat(str1).concat(str2);

		}
		return str;

	}
}
