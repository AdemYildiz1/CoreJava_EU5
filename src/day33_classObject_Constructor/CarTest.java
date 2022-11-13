package day33_classObject_Constructor;

public class CarTest {

	public static void main(String[] args) {

		Car c1=new Car();
		
		//Car c2=new Car(null, null, 0, 0, null) after writing Car THEN "CONTROL SPACES" shows short way of constructor:)
		
		Car c2=new Car("Honda", "Civic", 2020, 5000, "White");
		
		Car c3=new Car("BMW", "320", 2017, 30000, "red");
		
		System.out.println(c1.make);
		System.out.println(c2.color);
		

	}

}
