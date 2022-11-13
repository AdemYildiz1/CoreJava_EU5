package day46_collection_part1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
	  
		List<Integer>list=new LinkedList<>();
		list.add(10);
		list.add(50);
		list.add(500);
		list.add(50000);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		/*
		ArrayListte yapacagimiz bir ekleme/cikarma hepsini degistirir.
		Bu PROBLEMI cozmek icin, LinkedList kullaniriz Burada "NODE" (screen shotlara bak )yapip ekleme yapilir
		Basically we nodes that linked previous and next by referencing.
		in this way we care about just these two element where we putting and removing
		
		Some method is special in LinkedList;
	    list.addFirst();   list.addLast();
		list.getFirst();   list.getLast();
		
		REMEMBER! how to reach/access the method in child in 
		if it is created in poly way we have to cast it to get that method.
		*/
		
		((LinkedList)list).addFirst(7);
		System.out.println(((LinkedList)list).getFirst());//7
		
		((LinkedList)list).addLast(103);
		System.out.println(((LinkedList)list).getLast());//103
		
		
	}

}
