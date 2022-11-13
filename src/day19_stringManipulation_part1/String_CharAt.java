package day19_stringManipulation_part1;

public class String_CharAt {

	public static void main(String[] args) {

		/*Basically get number gives character:)
		 * charAt(); we call it again with reference variable and comma like
		 * ch.charAt(); -means it returns a char value at the given index number -index
		 * numbers are zero-based -eg: for "mike" string, index number of m=0, i=1, k=2,...etc
		 */

		String word = "Computer";

		System.out.println(word.length());// 8

		System.out.println(word.charAt(0));// C
		System.out.println(word.charAt(1));// o
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		// System.out.println(word.charAt(8)); out of index number!!! be careful, index number start from "0"
		 

		// another example: Check if first character is 'A'

		String word2 = "Apple";

		if (word2.charAt(0) == 'p') {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		// another example: Check if first or last character is the same

		String word3 = "civic";
		
		char first=word3.charAt(0);
		char last=word3.charAt(4);

		if (first == last) {
			System.out.println("1st and 3 rd character are the same");
		} else {
			System.out.println("1st and 3 rd character are not the same");
		}
		
		//last index not hard coded, so write a code it finds last character.
		// we use this method in the work environment a lot

		String word4="java warm";
		                                              // REMEMBER index number start 0 for char method, but length is start 1
		char lastChar=word4.charAt(word4.length()-1); // so we can say length-1 IT Gives last character.
		System.out.println("Last char of "+word4+ " is "+lastChar);                                            
		
	}
}




