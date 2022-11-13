package day31_arrayList;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {
		
	ArrayList<String> shoppingList=new ArrayList<>();	
		
	shoppingList.add("pappaer towel");
	shoppingList.add("dish soap");
	shoppingList.add("trash bag");
	shoppingList.add("clorox");
	shoppingList.add("gloves");
	shoppingList.add("shovel");

	// numbers of items
	int count=shoppingList.size();
	System.out.println(count);

	//print all item in single line not one by one
	
	System.out.println(shoppingList.toString());
	
	//print first and last item in single line
	System.out.println(shoppingList.get(0)+"|"+shoppingList.get(count-1));
	
	//lets remove some items
	
	shoppingList.remove("pappaer towel");
	shoppingList.remove("shovel");
	
	System.out.println(shoppingList.toString());//[dish soap, trash bag, clorox, gloves]
	System.out.println(shoppingList.get(0));     //dish soap
	
	shoppingList.remove(0);
	System.out.println(shoppingList.toString());//[trash bag, clorox, gloves]
	
	// print each item
	 for(String value:shoppingList) {
		 System.out.println(value+" ");
	 }
	 
	 //remove all items
	 
	 shoppingList.clear();
	 System.out.println(shoppingList.toString());//[]
	
	
	
	}

}
