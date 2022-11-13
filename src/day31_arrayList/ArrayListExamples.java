package day31_arrayList;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		//create an array list called languages
		//Print size arrayList
		//read couple of elements
		
		ArrayList<String> languages=new ArrayList<>();
		
		languages.add("turkish");
		languages.add("kurdish");
		languages.add("English");
		languages.add("German");
		
		System.out.println(languages.get(0));
		System.out.println(languages.get(1));
		System.out.println("SIZE: "+languages.size());
		
		//toString(): gives array format
		System.out.println(languages.toString());//[turkish, kurdish, English, German]
		
		languages.add("Russian");
		System.out.println(languages.toString());//[turkish, kurdish, English, German, Russian]
		
		//remove(); removes the object from the arryList based on index number.
		languages.remove(0);
		System.out.println(languages.toString());//[kurdish, English, German, Russian] turkish is gone
		
		}
}



