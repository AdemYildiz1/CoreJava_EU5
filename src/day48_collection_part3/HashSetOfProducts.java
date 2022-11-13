package day48_collection_part3;

import java.util.*;

import day46_collection_part1.Product;//Product class in different package so we have to import it

public class HashSetOfProducts {

	public static void main(String[] args) {
		/*we usually come across like this example in work environment!!!
		First Create class and collection then put elements/objects from this class into collection 
		*/
		
		//Example- Create SET COLLECTION and add new products/object based on PRODUCT CLASS in day46 package

		Set<Product>prodSet=new HashSet<>();
		
		prodSet.add(new Product("book",25.99));  //My collection(prodSet)that is coming collection interface is holding product object
		prodSet.add(new Product("book",17.99));  //basically collection says give me the object that is created by product class.
		prodSet.add(new Product("magazine",7.99)); //new Product("book",25.99)--> for example this is one object                                      
		
		System.out.println(prodSet.toString());
		
		System.out.println();
		
		//print product using for each loop- 1
		for(Product p:prodSet) {
			System.out.println(p);
		  //System.out.println(p.getPrice()); if you want to get only price, remember it is encapsulated so We need getPrice
		}
		System.out.println();
		
		//forEach method/method.lambda expression- 2
		//because it is the method so we use "prodSet."
		prodSet.forEach(n-> System.out.println(n)); 
		prodSet.forEach(n-> System.out.println(n.getName())); 
	}

}
