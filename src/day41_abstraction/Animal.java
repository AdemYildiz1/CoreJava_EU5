package day41_abstraction;

public abstract class Animal {

	//abstract class can have  abstract method this is main thing.
	//BUT abstract class can have instance and static method, even cons method and blocks(instance and static)
	//abstract class can not have special default method that interface has. 
 	//abstract class can have final, instance, static variables and private.
	//can use all access modifiers with variable and methods
	
	   String name;
	
	public abstract void eat(); //this is an abstract method no body(curly braces)
	 
	
	public abstract void breathe();// abstract method
	
	
	public void move() {
		System.out.println("Moving"); // instance method
	}
	
	public Animal() { //cons method.
		
	}
	
	
	public Animal(String name) { //cons with parameter
		this.name=name;
	}
	
	
	{
		         //instance block   
	}
	
	
	static{     //static block
		
	}
}

//here;
//1-I need a method(eat) in parent but I don't know implementation, so I want child to implement(override) this empty methods.
//2-if you don't know implementation, means no purpose creating an object
//3-if no object creating which means no instantiate because we have unimplement methods/abstract method here.
//4-we do it by using abstraction keyword in parent both for class and for methods
//!!!5-if child don't implement these methods/override, first CHILD CLASS gives ERROR. 
//We have to implement FIRST child class.
//Basically we override our abstract method in child class  so we can NOT put final keyword  
//6- We don't have to implement instance method in child/concrete class



