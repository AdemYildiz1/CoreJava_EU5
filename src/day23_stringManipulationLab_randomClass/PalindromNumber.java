package day23_stringManipulationLab_randomClass;

public class PalindromNumber {

	public static void main(String[] args) {
		
		
		int num=54;     //5
		int reverse=0;  //4
		int reminder=0; //4->5
		
//		reminder =num%10;
//		reverse=reverse*10+reminder;//4
//		num=num/10;
//	
//		reminder =num%10;		
//		reverse=reverse*10+reminder;
//		System.out.println(reverse);
		
//		while(num>=1) {
//			
//			reminder=num%10;
//			reverse=reverse*10+reminder;
//			num=num/10;
//		}
//		
//		System.out.println(reverse);
		
		while(num>=1) {
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
		}
		System.out.println(reverse);
	}

}
