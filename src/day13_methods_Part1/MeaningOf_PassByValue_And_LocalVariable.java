package day13_methods_Part1;

public class MeaningOf_PassByValue_And_LocalVariable {

	public static void main(String[] args) {
		
		int x=20; //we are passing 20 to num1 and 40 to num2 by calling methodName(x,y)
		int y=40; //so which means java is "pass-by-value" (can be asked in interview)
		
		methodName(5,10);
		methodName(x,y);
	}
	public static void methodName(int num1, int num2) {
		                              // "Local Variable"
		int result=num1+num2;         //1- result and result 2 are local to this method
		int result2= num1*num2;       //so they are not usable outside of method
		                              //2- result and rsult2 with their variable are available
		System.out.println(result);   //whenever you call method they are executed so they are only available locally
		System.out.println(result2);  // when execution is over they are gone so it is called life time of variable.
	}

}
