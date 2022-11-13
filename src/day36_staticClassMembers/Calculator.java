package day36_staticClassMembers;

public class Calculator {
	
    //if we don't want to use any instance variable in our instance method 
	//then, we can create our method with static keyword
	
	public static double plus(double num1, double num2) {
		return num1+num2;
	}
	
	public static double minus(double num1, double num2) {
		return num1-num2;
	}
	
	public static double multiply(double num1, double num2) {
		return num1*num2;
	}
}


