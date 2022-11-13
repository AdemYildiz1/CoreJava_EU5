package day22_StringManipulation_Lab;

public class Question_4 {

	public static void main(String[] args) {


		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdg"));
		System.out.println(firstTwo("ab"));
		System.out.println(firstTwo(""));
		System.out.println(firstTwo("ao"));
	}
	public static String firstTwo(String str) {
		
		if (str.isEmpty()) {
			return "";
		}else if(str.length()<2) {
			return str;
		}else {
			return str.substring(0,2);
		}
		
	}
	

}
