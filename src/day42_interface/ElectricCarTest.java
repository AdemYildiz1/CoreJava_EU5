 package day42_interface;

public class ElectricCarTest {

	public static void main(String[] args) {

		//ElectricCar ec=new ElectricCar(); //ERROR- REMEMBER!, abstract class can not be instantiated. No need to create an object
		
		Tesla modelS=new Tesla("Model S", 45000, "Grey"); //I can instantiate indirectly by using non-abstract class
		modelS.charge();
		modelS.start();
		modelS.drive();
		modelS.stop(); 
		
		System.out.println("=========================");
		
		Ford fusion =new Ford("Fusion", 35000, "Black", 2017);
		fusion.charge();
		fusion.drive();
		fusion.start();
		fusion.stop();
		
		System.out.println("=========================");
		
		TeslaSemi semi=new TeslaSemi("Semi", 50000, "Brown", 3.5);
		semi.charge();
		semi.start();
		semi.drive();
		semi.load("Oranges");
		semi.stop();
		
		System.out.println("========================");
		
		TeslaTruck tr=new TeslaTruck("CybertekTruck", 10000, "White", 6.0);
		tr.charge();
		tr.start();
		tr.drive();
		tr.load("java books");
		tr.stop();
		
		System.out.println("========================");
		//All toString is coming from ElectricCar
		System.out.println(modelS.toString()); 
		System.out.println(fusion.toString());
		System.out.println(tr.toString());
		
	}

}
