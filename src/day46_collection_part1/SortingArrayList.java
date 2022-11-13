package day46_collection_part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {
		
		 List<String>list=new ArrayList<>();
		 list.add("java");
		 list.add("js");
		 list.add("html");
		 list.add("kotlin");
		 list.add("c++");
		 System.out.println("Before sorting: "+ list.toString());
		 
		 Collections.sort(list); //1- SORTING FROM WRAPPER OR STRING CLASS'S ELEMENTS
		 System.out.println("After sorting: "+ list.toString());
		 
		 System.out.println("---------------");
		 
		//if we want to save objects we need to put class name that objects belong to,like Wrapper and String Class
		 List<Product> prodList=new ArrayList<>(); 
		 prodList.add(new Product("Spoon",13.99));  
		 prodList.add(new Product("bag",100.00));
		 prodList.add(new Product("shoes",59.99));
		 prodList.add(new Product("computer",2100.99));
		 
		 System.out.println("Before sorting: "+ prodList.toString());
		
		 Collections.sort(prodList); //2- SORTING OUR CLASS OBJECT
		 //collection sort with the objects, first it gives error, So to solve it
		 //we need to override/implement "compareTo(ClassName x)" method that comes from interface Comparable<ClassName>
		 //here we implement our custom method(look at Product class)
		 
		 System.out.println("After sorting: "+ prodList.toString());
		 
		 Product p1=new Product("spoon", 25.34);
		 Product p2=new Product("chair", 7.99);
		 System.out.println(p1.compareTo(p2));//1 
		 
	}
	

}
