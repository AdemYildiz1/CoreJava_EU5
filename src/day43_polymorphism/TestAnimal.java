package day43_polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		//we can create object in polymorphic way,
		//parent/interface RN(referance name) = new Child();
		
		Animal b = new Dog();
		Animal c = new Bird();
		
		Animal animal = new Animal();
		animal=new Dog();           
		animal=new Bird();
		//here We understand, Dog and Bird classes can have some methods and attributes that Animals have 
	}

}

class Animal{}

class Dog extends Animal{}

class Bird extends Animal{}

