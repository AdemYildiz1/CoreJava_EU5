package day31_arrayList;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		/*ArrayList is a class that is similar to array and allows you to store object
		 * array store primitive but array list store object.
		 * that's why ,when we create ArrayList we use wrapper classes that help us convert primitive to object 
		 * Array size adjustable, we can add or remove object
		 * ArrayList has bunch of useful methods
		 * ArrayList classes in the java.util.package and we have to import it
		 */
		 //creating an ArrayList
		
		ArrayList<String>names=new ArrayList<>();
		
		ArrayList<Integer>nums=new ArrayList<>();
		
		//Assigning values to arrayList
		
		names.add("mike");
		names.add("smith");
		names.add("john");
		names.add("emmy");
		names.add("evan");
		names.add("mary");
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		nums.add(new Integer("100"));
		
		//Reading from array
		
		System.out.println(names.get(0));//mike
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Name count: "+ names.size());//6
		System.out.println("nums count: "+nums.size());//4

		System.out.println(names.toString());//[mike, smith, john, emmy, evan, mary]
	}

}
