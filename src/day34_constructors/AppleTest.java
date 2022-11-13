package day34_constructors;

public class AppleTest {

	public static void main(String[] args) {
		//How to pass Objects as an arguments! 
		// we can do it like we did while passing the some value/parameter
		
		Apple a1=new Apple();      // here, our Reference type is Apple

		changeApple(a1);
		
		System.out.println(a1.color);// white
		
		//methodObject();
		
		System.out.println(methodObject().color);//red, we can call and print returning object 
	}
	
	public static void changeApple(Apple x) {
		//finally, we passed the object as an argument/method parameter
		//you can write a1 instead of x!
		//just make sure it is matches to inside
		
		x.color="white"; 
		
		/*whatever object/(a1 is pointing to object) created as an instance, 
		  we are changing that one from red to white
        */
		 
	}
   // How to return object!
   // HERE we use to CLASS NAME like we did in array list and wrapper classes
	// In this case we can return the object that belongs to that Apple class
	public static Apple methodObject() {
		
		Apple b1=new Apple();
		
		return b1;
	}
		
}
