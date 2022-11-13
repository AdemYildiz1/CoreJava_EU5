package day40_accessModifiers_final_hiding;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car ();
		
		c.model="M3";
		c.year=2017;
		//c.door=4;  Here, door is private so it has no access.
		c.engine=5.3;
		
		System.out.println(c.toString());
		
		/* INTERVIEW! explain toString(); method
		 if you do NOT overridden it gives you address while printing
		 if you overridden it it prints values
		 */
	}

}
