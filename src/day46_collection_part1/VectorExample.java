package day46_collection_part1;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		 //Differences from array list,linkedList are thread-safe/we do that by creating Synchronization
		//A thread that is trying to access the code applied by Synchronization is blocked
		//(look at the screenshots and Ozzy's video  I took)
		
		List<String> v = new Vector<>();
		v.add("vater");
		v.add("tea");
		v.add("green tea");
		
		for(String x:v) {
			System.out.println(x);
		}

		System.out.println(v.size());
		System.out.println(v.get(2));
	}

}
