package day41_abstraction;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Dog is eating dog food");
		
	}

	@Override
	public void breathe() {
		System.out.println("Dog is breathing");
		
	}

	//First Child class/sub class of abstract, it is called CONCRETE CLASS as well.
	//We have to override abstract method to implement in child/concrete class.
	
	
}
