package day48_collection_part3;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// Map is interface, but does not extend collection interface
		// Data structure Of Map is based on is pair of collection, "key+ value"
		// we can keep the MAP in our mind like DICTIONARY
		// Dictionary has a word and explanation with it, likewise MAP <Key, value>....

		List<Integer> items2 = new ArrayList<>();
		items2.add(10); //here, add()--> comes from collection

		Map<String, Double> items = new HashMap<>();
		items.put("Apple", 3.49); // here, add(); doesn't work
		items.put("Flowers", 10.99);
		items.put("Eggs", 4.49);
		items.put("Milk", 6.0);
		items.put("Cherries", 6.99);
		items.put("Apple", 5.49);
		
		System.out.println(items.size());//5
		
		System.out.println(items.toString());
		
		System.out.println(items.isEmpty());//false
		
		//Retrieve value with key, key is the unique 
		System.out.println(items.get("Apple"));//3.49 -->After adding new items apple(key) it updates then becomes 5,49
		
		System.out.println(items.get("Milk")); //6.0
		
		items.remove("Flowers");
		System.out.println(items.toString());
		
		//check if the key is there
		System.out.println("is Apple there?: "+ items.containsKey("Apple")); //true
		
		System.out.println(items.containsKey("Flowers"));//false
		
		//replacing  
		items.replace("Eggs", 3.5);
		System.out.println("Price of eggs: "+ items.get("Eggs"));
		
		//increase price of cherries by $2, do it dynamic way
		//1-
		double x= items.get("Cherries")+2;
		System.out.println(x);
		//2-
		items.replace("Cherries", items.get("Cherries")+2);
		System.out.println("price of cherries: "+ items.get("Cherries"));
		
		
	}

}
