package day47_collection_part2;

import java.util.*;


public class LoopSet {

	public static void main(String[] args) {
		//Remember! we can not have insertion order preserved in Set means no index, so we can not use iterator loop here.
		
		Set<Integer> numSet=new HashSet<>();
		numSet.add(50);
		numSet.add(543);
		numSet.add(1150);
		numSet.add(550);
		numSet.add(570);
		numSet.add(93);
		numSet.add(5000);
		numSet.add(950);
		
		//forEach loop
		for(Integer n:numSet) {
			System.out.print(n+" |");
		}
		System.out.println();
		
		//forEach Method
		numSet.forEach(n-> System.out.print(n+" |"));
		
		
		
		
		
	}

}
