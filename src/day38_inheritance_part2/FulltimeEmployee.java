package day38_inheritance_part2;

public class FulltimeEmployee extends Employee {

	@Override  //not mandatory but this annotation can be added to check if our method is overriding
	
	public void calculatePay(int hours, double rate) {  //must be same name and parameters as the method in parent class/OVERRIDING
		double total=(hours*rate)*1.5;
		System.out.println("Fulltimeemployee total pay: "+total);
	}
}


//REMEMBER!, METHOD OVERLOADING: MUST BE SAME METHOD NAME WITH DIFFERENT PARAMETER(TYPE OR NUMBERS...)
/*BUT METHOD OVERRIDING: 
 1-is a method in child class, MUST BE THE SAME METHOD NAME WITH SAME PARAMETERS TYPE as the method in parent class.
 2-Access modifier for child method needs to be same or more visible than method in parent
 .public   -> public
 .protected-> protected, public
 .default  -> default, protected, public 
 3-return types
 .must be same for primitive
 .covariant type/es deger (for object return type..remember in array and array list)
 */

