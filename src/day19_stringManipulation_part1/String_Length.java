package day19_stringManipulation_part1;

public class String_Length {

	public static void main(String[] args) {
		
		
		String str="java";            // first way ow creating object as usually, by literal
		
		
		System.out.println(str.length());// we can print methotd7877 directly
		
		int x=str.length();              // or we can assign the method to x with integer, then print it.
		
		System.out.println(x);//4( so java has 4 letters character.
		
		System.out.println(x*10);//10
		
		String str1 = new String ("java"); // 2. way of creating object for string, by new keyword
		
		System.out.println(str1.length());// 4 
		
		/*NOT:
		 LENGTH METODU IN STRING CLASS; ---reference variable.Length()--; eg:str.length(); 
		 - means how many character we have
		 - 1space is equal to 1 character and  "" this means 0.
		
		 */
		

	}

}
