package day19_stringManipulation_part1;

public class PrintingEachCharacter {

	public static void main(String[] args) {
		
		String str="Cyber School";
		
		// 1st way
		for (int i=0; i<12;) {
			char c=str.charAt(i++);
			
			System.out.println(c);
			
			
		}
		System.out.println("********************");
		
		//2.way
		for(int i1=0; i1<str.length(); i1++) {
			
			System.out.println(str.charAt(i1));
		}
		
	
	}

}
