package day22_StringManipulation_Lab;

public class Question_5 {

	public static void main(String[] args) {
		
		System.out.println(firstHalf("Woohoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abc"));
	}
	public static String firstHalf(String str) {
		int x =str.length();
		
		if (x%2==0) {
			return str.substring(0, x/2);
			
		}else {
			return "invalid";
		}
		
	}

}
