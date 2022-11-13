package day10_controlFlowStatement_part4;

public class TurnaryOperator {

	public static void main(String[] args) {
		
		String result;
		int score=88;
		
//		if (score>60) {
//			result="pass";
//		}else {
//			result="fail";
//		}                                      
		                                    //TURNARY OPERATOR Example 1
                                           // yukaridaki if ile ayni!
		result=score>60 ? "pass": "fail"; // if true do after "?" mark if false do following.
		
		
		int x=5;                                 // TURNARY OPERATOR Example 2
		System.out.println(x>2 ? x <4 ? 10:8:7);//8 (asagidaki ile ayni)
		
		if(x>2) {
			if (x<4) {
				System.out.println(10);
			}else {
				System.out.println(8);
			}
			
		}else {
			System.out.println(7);
		}
		
		// TURNARY KALIBI
		// (condition)? If demek.
		// (condition): else demek
		// :(condition)? else if demek
		
		
	}
	
	
	

}
