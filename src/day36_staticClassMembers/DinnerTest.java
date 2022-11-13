package day36_staticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {
		
		Dinner mom =new Dinner();
		Dinner kid =new Dinner();
		Dinner dad =new Dinner();
		
		System.out.println(Dinner.pizzaSlice);//8
		
		//because of being static(class variable)/ each time class variable is affected
	
		dad.takeASlice();//8-1= class variable becomes 7
		kid.takeASlice();//7-1= class variable becomes 6
		mom.takeASlice();//6-1= class variable becomes 5
		
		System.out.println(Dinner.pizzaSlice);//5  
		
		kid.takeASlice(3);//5-3=2
		dad.takeASlice(2);//2-2=0
		
		System.out.println(Dinner.pizzaSlice);//0
		
		System.out.println(Math.PI); //likewise PI is class variable so we can call with class name(Math).
		
	}

}
