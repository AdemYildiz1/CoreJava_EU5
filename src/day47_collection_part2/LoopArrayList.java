package day47_collection_part2;

import java.util.*;

public class LoopArrayList {

	public static void main(String[] args) {
		
		List<Integer> nums=new ArrayList<>();
		nums.add(50);
		nums.add(543);
		nums.add(1150);
		nums.add(550);
		nums.add(570);
		nums.add(93);
		nums.add(5000);
		nums.add(950);
		
		//1-
		//looping using for each loop
		for(Integer n:nums) {  //takes one by one from collections
			System.out.print(n+" |");
		}
		System.out.println();
		//2-
		//looping using for iteration loop
		for(int i=0; i<nums.size(); i++) {
			System.out.print(nums.get(i)+ " |");
		}
		System.out.println();
		//3-
		//looping using forEach method.lambda expression/WORKS just in collection
		nums.forEach(n->System.out.print(n+" |"));
		
		nums.removeIf(n-> n<500); //go nums collection and assign each one to n then remove if n is smaller than 500
		
		System.out.println();
		
		nums.forEach(n->System.out.print(n+"| "));
		
		//4-looping with Iterator in class LoopWithIterator(look at that class)
		
		
	}

}
