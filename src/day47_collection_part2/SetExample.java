package day47_collection_part2;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		//in Set interface collection we need to know 3 thins
		//1-Duplicate is not allowed
		//2-no Insertion order preserved, it is not ordered based on index it is ordered based on hashSet
		//3-if you want to put element in order you need to use Treed that implements Sorted interface

		Set<Integer>mySet=new HashSet<>();
		
		mySet.add(100);
		mySet.add(500);
		mySet.add(800);
		mySet.add(900);
		mySet.add(1000);
		mySet.add(1000);
		mySet.add(1000);
		
		System.out.println(mySet.toString());//[800, 100, 500, 900, 1000]-->no duplicate and ordering based on index
		System.out.println(mySet.size());//5
		
		//Example
		List<String>list=Arrays.asList("A","A","b","c","jjj","q","t","t");
		
		Set<String> unique=new HashSet<>(list);
		
		System.out.println(list.toString());
		
		System.out.println(unique.toString());//here, u will see no insertion order and duplicate
		
		
		//TreeSet class implements SortedSet interfaces that extends Set interface
		TreeSet<Integer> tSet=new TreeSet<>(); //or u can create in poly way/ sortedSet<..> s=new TreeSet....
		tSet.add(500);
		tSet.add(100);
		tSet.add(10);
		tSet.add(5);
		tSet.add(8000);
		tSet.add(100);
		
		System.out.println(tSet); //here we can sort Elements 
		
		
		
		
		
	}

}
