package day15_methods_part3;

public class Task67_LastDigit {

	public static void main(String[] args) {
		
		LastDigit(7,17);
		LastDigit(6,17);
		LastDigit(3,113);
		
		System.out.println(LastDigit(7,17));
		System.out.println(LastDigit(6,17));
		System.out.println(LastDigit(3,113));
	}
	public static String LastDigit(int num1,int num2) {
		if (num1%10==num2%10) {
			String s="true";
			return s;
		}else {
			String s="false";
			return s;
		}
		
	}

}
