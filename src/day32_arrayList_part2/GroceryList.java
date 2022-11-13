package day32_arrayList_part2;

import java.util.ArrayList;

public class GroceryList {
  /*this is will be our class/blueprint so we didn't put main method here. 
	But,to able to reach this class we will create main method in different class is called GroceryListMain*/
	
	ArrayList<String> gList=new ArrayList<>();
	
	public void addGroceryItem(String item) { // I don't put static so that it can be accessible from other class
		gList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("You have "+ gList.size()+" items in your grocery list");
		for(int i=0; i<gList.size(); i++) {
			System.out.println((i+1)+". "+ gList.get(i));
		}
	}
	
	public void modifyGroceryItem(int position,String newItem) {
		gList.set(position, newItem);
		System.out.println("Grocery item "+(position+1)+ " has been modified");
	}
	
	public void removeGroceryItem(int position) {
		gList.remove(position);
	}
	
	public String findItem(String searchItem) {   //based on the index number it returns item to index number 
		int position=gList.indexOf(searchItem);
		if(position>=0) {
			return gList.get(position);
		}
		return null;
	}
}
