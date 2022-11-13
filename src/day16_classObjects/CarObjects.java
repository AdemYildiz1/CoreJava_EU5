package day16_classObjects;

public class CarObjects {

	public static void main(String[] args) {
	
		Car car1=new Car();
		// without assigning it prints default ones
		car1.printCarInfo();
		
		//after assigning it gives what we assigned
		car1.make="ford";
		car1.model="fiesta";
		car1.color="grey";
		car1.currentSpeed=55;
		
		car1.printCarInfo();
		
		car1.showCurrentSpeed(70);//it assigns 70 speedLimit in its method. basically this parameter for speedLimit.
		car1.showCurrentSpeed(35);
		
		car1.drive();
		
		
		System.out.println("before :"+ car1.currentSpeed); //before no method about it
		
		car1.accelerate(20); //if I running this method currentSpeed will be like below
		System.out.println("after : "+ car1.currentSpeed);//75
	}

}
