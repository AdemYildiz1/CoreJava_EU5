package day46_collection_part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayVSArrayList {

	public static void main(String[] args) {
		
		//Array-->can hold object or primitive type
		//1-primitive
		int[] numsArray= {30,5,100,50,6};
		System.out.println(numsArray[1]);
		
		//2-object
		String []days=new String[7];
		days[0]="Monday";
		System.out.println(days[0]);
		
		//3-primitive and object may put together 
		Object[] obj= {2,"apple",false};
		
		System.out.println("--------------------");
		
		//ArrayList-->can hold object
		//Let's create with poly way
		ArrayList<Integer>list1=new ArrayList<>();
		List<Integer>list2=new ArrayList<>();
		Collection<Integer>list3=new ArrayList<>();
		
		list1.add(40);
		list1.add(50);
		list1.add(100);
		System.out.println(list1.get(0));
	}

}
