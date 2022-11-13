package day11_controlFlowStatements_part5;

public class ForLoopRules {

	public static void main(String[] args) {

		// 1- Creating an infinite loop
		// components of the for loop are each optional

//      for(  ;  ;  ) {
//	    System.out.println("Hello");
//		}

//		int i=1;
//		
//		for(  ;i<=5;i++) {
//			System.out.println(i);// it works fine 

//		}
//		for( ;  ;  i++) {
//			System.out.println(i);

//		}
//		for(  ;i<=5;) {
//			System.out.println(i);
//		}
		// 2- adding Multiple Terms to the for statement

//		int x = 0;
//		for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
//			System.out.print(y + " ");
//		}
//		System.out.println(x);
		// System.out.println(y); y and z does not work because y is declared in for
		                         // loop
		                         // but x can be printed outside code because it is declared outside of for loop
		                         // as well

		// 3-Redeclaring a variable in init block
		// int x =0;
		// for(long y=0,x=4; x<5&&y<10; x++,y++) { // does not compile because x with long
		                                          // and with int as well
		// System.out.println("Hello");
		// }
		
		//4-Using incompatible data types in the init block
		//the variables in the init block must all be of the same data type
		
//		 for(long y=0; int x=0; x<5&&y<10 x++,y++) { //in the same init block we can not have int and double..etc 
//			System.out.println("Hello");            // unless they are out side of init block (for loop)
//		}
		
		//5-it can not be printed,Using loop variables outside the loop
		
		//for(long y=0,x=4; x<5&&y<10; x++,y++) {
			
		//}
	    //  System.out.println(x);// does not compile
	}

}
