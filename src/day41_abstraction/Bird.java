package day41_abstraction;

public class Bird extends Animal {
                                

	@Override
	public void eat() {
		System.out.println("Bird eating");
		
	}

	@Override
	public void breathe() {
		System.out.println("Bird breating");   	
		
	}
	//Bird is the First Child class/sub class of abstract, it is called CONCRETE CLASS as well.
    //We have to override abstract method to implement in child/concrete class.
}
