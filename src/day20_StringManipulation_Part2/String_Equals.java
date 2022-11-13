package day20_StringManipulation_Part2;

public class String_Equals {

	public static void main(String[] args) {
	 
		//s1.equals(s2)   checks two string if it is equal to each other
		// equals method and  "==" are not the same
		// equals method checks value is the same BUT
		//== this relational operator checks if object is the same
		
		
		String str1="Apple";             // it is in string pool in heap memory, remember!!!
		String str2=new String("Apple"); // it is in heap memory but it is created out of string pool so it is new object
		
		System.out.println(str1==str2);// false, so they are different objects
		System.out.println(str1.equals(str2));// true, the same values 

		
		String str3="Apple";
		String str4="Apple";
		
		System.out.println(str3==str4); //true
		System.out.println(str3.equals(str4)); //true
		
		
	}

}
