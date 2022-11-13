package day31_arrayList;

import java.util.ArrayList;

public class Cities {

	public static void main(String[] args) {
		
		ArrayList<String>cities=new ArrayList<>();
		
		cities.add("London");
		cities.add("Viriginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());
		
		//lets print each of them by using for-each loop separated by spaces
		
		for(String str:cities) {
			System.out.print(str+" ");
		
		}
		System.out.println();
		//lets print each of them by using iterator loop separated by spaces
		
		for(int i=0; i<cities.size(); i++) {
			System.out.print(cities.get(i)+" "); 
		}
		System.out.println("--------");
		System.out.println("Removing Baku");
		cities.remove("Baku");                // first Baku is gone
		System.out.println(cities.toString());//[London, Viriginia, DC, Berlin, Baku]
		
		System.out.println("--------");
		
		cities.add(0,"Arlington");
		cities.add(1,"Istanbul");
		
		System.out.println(cities.toString());//[Arlington, Istanbul, London, Viriginia, DC, Berlin, Baku]
		
		cities.add(2, "Ankara");              // adding this element into index number 2 
		
		System.out.println(cities.toString());//[Arlington, Istanbul, Ankara, London, Viriginia, DC, Berlin, Baku]
		
		//indexOf(): it gives index number of element in the array list
		
		int idx=cities.indexOf("Istanbul");
		System.out.println(idx);                      //1
		
		System.out.println(cities.indexOf("Ankara")); //2
		
		System.out.println(cities.indexOf("Bursa"));   //-1, because no bursa in my array list 
		
		//Clear(): it clears all objects/elements in array list
		 cities.clear();
		 System.out.println(cities.toString()); //[]
		 
		boolean empty=cities.isEmpty();
		System.out.println(empty);       //true
		
		
		
		
		
		
		
		
		
	}

}
