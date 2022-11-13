package day22_StringManipulation_Lab;

public class Question_3 {

	public static void main(String[] args) {
		
		String str=extraEnd("I am java");
		
		for(int i=1; i<=3; i++) {
      System.out.print(str.substring(str.length()-2));
      
		}
	}
	public static String extraEnd(String str) {
		
		return str;
		
	}

}




