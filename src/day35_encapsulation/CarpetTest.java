package day35_encapsulation;

public class CarpetTest {

	public static void main(String[] args) {
		
		//way-1
		// I have to call getTotalCost from Calculator class, so I have to create object to get sth from any template.

		Floor f=new Floor(10,20);
		Carpet c=new Carpet(5.2);
		
		Calculator cal=new Calculator(f, c);       // here accept two parameters that are carpet and floor object,
		                                           // so I have two create these object as well(above)
		System.out.println(cal.getTotalCost());//1040.0
		
		//way-2 shortest
		Calculator cal1=new Calculator(new Floor(10,20),new Carpet(5.2)); //which means without accessing floor object just pass value to cons 
		System.out.println(cal.getTotalCost());//1040.0
	}

}
