package day38_inheritance_part2;

public class DogTest {

	public static void main(String[] args) {
		
		Dog dog =new Dog("yorkie", 1, 1, 8, 20, 2, 4, 1, 20, "Long Sily");

		dog.eat();
	
		//dog.name="ABC"; gives error, because for cons we can just initialize one time for one object.
		//to be able to do it we should create new object. if it was created by setter we could change the name without creating object
		
		System.out.println(dog.getName());//yorkie
		
		System.out.println("*****************");
		dog.move(10);
			
		
		
	}

}
