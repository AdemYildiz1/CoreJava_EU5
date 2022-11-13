package day32_arrayList_part2;

import java.util.ArrayList;

public class EqualMethod {

	public static void main(String[] args) {
		
		ArrayList<String>friends1=new ArrayList<>();
		ArrayList<String>friends2=new ArrayList<>();
		
		friends1.add("Mike");
		friends1.add("Smith");
		friends1.add("John");
		friends1.add("Tommy");
		
		friends2.add("Mike");
		friends2.add("Smith");
		friends2.add("John");
		friends2.add("Tommy");
		
		System.out.println(friends1);
		System.out.println(friends1);
		
		if (friends1.equals(friends2)) {        //check the values
			System.out.println("same friends");
		}else {
			System.out.println("different friends");
		}
		                                        //(==) check address
		System.out.println(friends1==friends2); //false because they are different objects in different address
		                                        //even though they have same value
		
		
		
		
		
		
		
		
		
		
		
	}

}
