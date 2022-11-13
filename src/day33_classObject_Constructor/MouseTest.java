package day33_classObject_Constructor;

public class MouseTest {

	public static void main(String[] args) {
		//Constructor CHAIN,"this()" key word,
		//Can I run other constructor with the same object?
		//if you want to call a constructor from another constructor you need to use "this()" key word
		//in this way we initialize all variables with one constructor
		//eg: let's call cons 2 from cons 1( we do it in template, check class/template!) and cons 3 from cons 2
		
		Mouse mouse=new Mouse(15);

		mouse.print();
		
	}

}
