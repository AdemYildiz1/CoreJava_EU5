package day15_methods_part3;

public class Task67_LastDigit_Solution_Way2 {

	public static void main(String[] args) {
		
		if(LastDigit(7,17)){
			System.out.println("They have the same digit");
			
		}else {
			System.out.println("They do not have the same digit");
		}
		
		
	}

	public static boolean LastDigit(int num1, int num2) {
		
		 if (num1%10==num2%10) {
			return true;
	     }else {
		    return false;
	   }
		 
	}

}
