package day21_StringManupilation_part3;

public class String_Substring {

	public static void main(String[] args) {
		//substring() method, basically prints string according to index numbers
		// it can give us certain of characters..IMPORTANT METHOD
		String sentence="Java String Manipulation is fun!";
		                                             
		                                           //if we have just 1 index,
		System.out.println(sentence.substring(2)); //"va String Manipulation is fun!", so it prints rest of 2 INCLUDING 2

		                                               //if we have two index,
		System.out.println(sentence.substring(5, 11));//"String" it prints index from 5 to 11 but 11 is not including.
		
		System.out.println(sentence.length());//32
		System.out.println(sentence.substring(5, sentence.length()-5));//prints from 5-27, but no 27th one
		
		//example; do output:{{AUTOMATION}}
		
		String chars="{{}}";
		String word="AUTOMATION";
		System.out.println(chars.substring(0,2)+word+chars.substring(2));
		
		
	}

}
