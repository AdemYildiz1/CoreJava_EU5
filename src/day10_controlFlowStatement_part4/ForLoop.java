package day10_controlFlowStatement_part4;

public class ForLoop {

	public static void main(String[] args) {

		// write 5 times hello word

		for (int i = 0; i < 5; i++) {
			
			System.out.println("hello");

			// i   condition       action                    increment(i++)
			   
			// 0    TURE          Print Hello                  1
			
			//      TRUE          Print Hello                  2
			
			//      TRUE          Print Hello                  3
			
			//      TRUE          Print Hello                  4
			
			//      TRUE          Print Hello                  5
			
			//      FALSE         
		}  
		System.out.println("***********************************");

		for(int i=1; i<=10; i++) {
			//System.out.println("i = "+ i);
		}
		for(int i=5; i<=10; i++) {
			//System.out.println("i = "+ i);
		}
		for(int i=20; i>=10; i--) {
		    //System.out.println("i = "+i);
		}
		for(int i=0;i<=100; i+=10) {
			//System.out.println("i = "+i);
		}
		for(int i=50;i>=0; i-=5) {
			System.out.println("i= "+i);
		}
	}

}
