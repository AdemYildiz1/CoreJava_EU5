package day43_polymorphism;

public class InstanceOf {

	public static void main(String[] args) {
		
		//"instanceof" operator checks if object belongs to that object type  
		//basically checks if the object is certain class
		// it returns true or false.
		
		Shape sh = new Circle();
		
		
		if(sh instanceof Triangle) {
			System.out.println("Triangle");
		}else if(sh instanceof Circle) {
			System.out.println("Circle");
		}else {
			System.out.println("Square");
		}
		
		
		

	}

}
