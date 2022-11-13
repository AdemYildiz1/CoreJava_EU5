package day22_StringManipulation_Lab;

public class Question_6 {

	public static void main(String[] args) {
		
		
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("codding"));
		System.out.println(withoutEnd("a"));
		
		
	}
	public static String withoutEnd(String str) {
	
		//int x = str.length(); you can do like that to simplify the code by using x instead of str.length();
		
		if(str.length()<2) {
			return "invalid character";
		}else {
			return str.substring(1, str.length()-1);
		}

		
	}

}
