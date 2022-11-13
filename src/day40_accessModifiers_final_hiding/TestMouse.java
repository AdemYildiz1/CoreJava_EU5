package day40_accessModifiers_final_hiding;

public class TestMouse {

	public static void main(String[] args) {
		//REMEMBER!, Inheriting instance variables 
		//we can not override instance variables; we can hide them
		//Basically, two copies are created in memory whatever references we are using it calls that one.
		
		Mouse mouse=new Mouse();
		
		mouse.getRodentDetail(); //parent: 4,             HERE,   child's variable is hiding.
		
		mouse.getMouseDetail(); //tail: 8, parentTail: 8  HERE,   parents's variable is hiding.
		

	}

}
