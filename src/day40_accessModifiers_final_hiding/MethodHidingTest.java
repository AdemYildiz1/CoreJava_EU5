package day40_accessModifiers_final_hiding;

public class MethodHidingTest {

	public static void main(String[] args) {
		

	}

}

class Bear {
	
	public static void eat() {
		System.out.println("Bear is eating");
	}
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	public void hibernating() {
		System.out.println("Bear is hibernating");
	}	
}

class Panda extends Bear {
	
	public static void eat() {                    //Here is method hiding because of static
		System.out.println("Panda is eating");
	}
	
	/*
	public void sneeze() {
		System.out.println("Panda is sneezing");  //gives error here, static must be the same as the parent 
	}
	*/
	 
	@Override
	public void hibernating() {
		System.out.println("Panda is hibernating"); //Method is overridden
	}	
	
}
