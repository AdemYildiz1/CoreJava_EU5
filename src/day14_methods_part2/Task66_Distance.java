package day14_methods_part2;

public class Task66_Distance {

	public static void main(String[] args) {
		
		VehicleDistance(60, 100); // it can not be printed just like this calling

		System.out.println(VehicleDistance(60, 100)); // first way of printing after returning
		
		double x=VehicleDistance(70,100);  // 2nd way of printing
		
		System.out.println(x);
		
		// you can use this value VehicleDistance(60,100) wherever you want. For example;
		
		if (x>6000) {
			System.out.println("you spent too much gas");
		}else {
			System.out.println("you spent ok gas");
		}
	}
	public static double VehicleDistance(double speed, int time) {
		double distance=speed*time;
		return distance;
		
	}

}
