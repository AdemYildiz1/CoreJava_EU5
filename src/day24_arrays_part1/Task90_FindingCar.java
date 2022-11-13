package day24_arrays_part1;

public class Task90_FindingCar {

	public static void main(String[] args) {

		String[] cars = { "", "Nissan", "Toyota", "BMW", "Ferrari", "Porsche" };
		
		boolean flag=false;
		
		for (int i = 0; i < cars.length; i++) {
			
			if (cars[i].equalsIgnoreCase("Honda")) { 
			
			flag=true;
			break;
				
		}
			
			}
		if (flag) {
			System.out.println("Honda is there");
		}else {
			System.out.println("Not there");
		}
	}
}
