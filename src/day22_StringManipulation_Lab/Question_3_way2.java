package day22_StringManipulation_Lab;

public class Question_3_way2 {

	public static void main(String[] args) {
		//Hocanin cozumu

		System.out.println(extraEnd("hello"));
		System.out.println(extraEnd("Iam java"));
		System.out.println(extraEnd("a"));
	}
	public static String extraEnd(String str) {
		
		if(str.length()<2) {
			return "Invalid String";
		}
		
		String dummy="";
		
		dummy=str.substring(str.length()-2);
		
		return dummy+dummy+dummy;
	}

}




