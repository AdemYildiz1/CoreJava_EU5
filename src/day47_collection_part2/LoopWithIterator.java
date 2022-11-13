package day47_collection_part2;

import java.util.*;

public class LoopWithIterator {

	public static void main(String[] args) {

		Set<Integer> numSet=new HashSet<>();
		numSet.add(50);
		numSet.add(543);
		numSet.add(1150);
		numSet.add(550);
		numSet.add(570);
		numSet.add(93);
		numSet.add(5000);
		numSet.add(950);
		

		//4-
		//loop using Iterator collection
		
		//Create Iterator object
		//So that we can do loop without index number (for example for Set collection)
		//But we Have here like pointer in first element whenever creating iterator
		Iterator<Integer>it=numSet.iterator();
		
		//Call hasNext method, turns true if there is still next value
		//returns false when it reaches the end or empty. 
		System.out.println("it.hasNext() : "+ it.hasNext());//true
		
		//it.next() is a  pointer is here and retrieve it
		System.out.println(it.next());
		System.out.println(it.next());//543 pointer is here right now.
		System.out.println(it.next());//1150
		
		System.out.println("==========");
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("it.hasNext() : "+ it.hasNext()); //false
		
		//Differences between for each loop and iterator
		//we can use pointer like index number eg; we can remove object in Iterator but we cannot do it in each loop
		
		Iterator<Integer> it2=numSet.iterator();
		 while(it2.hasNext()) {    //means if there is element next to exsisting element
			 int val = it2.next(); //pointer is in the first element
			 if(val>1000) {
				 it2.remove();
			 }
		 }
		
		System.out.println(numSet.toString());
		
		List<String> cities = new ArrayList<>();
		cities.add("New York");
		cities.add("Boston");
		cities.add("Viriginia");
		cities.add("DC");
		
		for(String city : cities) {      //gives this ConcurrentModificationException, because we Cannot remove object here
			if(city.equals("Boston")) {
				cities.remove(city);
			}
		
		}
		
	
	}
}


