package day40_accessModifiers_final_hiding;

public class FinalMethods {

	//Final class is not inherited.(no need give an example for it)
	//If method is final you can not OVERRIDE IT
	
	public final void method1() {
		System.out.println("Method-1");
	}
	
	public static final void staticMethod(String word) {
		System.out.println("Static Method");
		
	}
	
}

class Sub extends FinalMethods {
	/*
	public void method1() {
		System.out.println("Method-1 in sub Class");
	}
	*/
	
	 
	/*
	public static final void staticMethod(String word) {
		System.out.println("Static Method in sub Class");
	*/
}
