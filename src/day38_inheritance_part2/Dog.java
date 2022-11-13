package day38_inheritance_part2;

public class Dog extends Animal{
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	//REMEMBER! RULE if we have cons with parameter in parent class we have to call it by using "super();" 
	//"super();" keyword is used in a cons in child class(here, we did it with short way, right click source..etc)
	
	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
			String coat) {   //here, all variable(in Animal and Dog class) can be assigned after creating dog object 
		
		super(name, brain, body, size, weight); //thru "super();" we can access/call cons in parent class
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	 public void chew() {
		 System.out.println("Dog.chew() is called");
	 }
	@Override
	public void eat() {
		System.out.println("Dog.eat() is called");
		chew();
		super.eat();
	}
	
	public void walk() {
		move(5);   //here, the method "move(int speed)"  in the same class/child class is called not in the parent class
		System.out.println("Dog.walk() is called");
	}
	
	public void run() {
		System.out.println("Dog.run() is called"); 
		move(10);  
	}
	
	@Override
	public void move(int speed) {
		System.out.println("Dog.move() is called"); 
		moveLegs(speed);
		super.move(speed);    //here the method "move(int speed)" in the parent is called. so we can access with "super"
		
	}
	 
	public void moveLegs(int speed) {
		System.out.println("Dog.run() is called"); 
	}
	
	

}
