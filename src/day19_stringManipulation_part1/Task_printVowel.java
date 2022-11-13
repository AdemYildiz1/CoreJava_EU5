package day19_stringManipulation_part1;

public class Task_printVowel {

	public static void main(String[] args) {
		
		String str="CybertekSchool";
		
	
		for(int i=0; i<str.length(); i++) {
			char letter=str.charAt(i);
			
			if(letter=='a'||letter=='e'||letter=='o'||letter=='i'||letter=='u') {
				
				// System.out.print(letter+",");//e,e,o,o, but we don't want last comma so we do like below
				
				 System.out.print(letter);// e e o o
				 
				 if(i!=str.length()-2) {
					 
					 System.out.print(",");
				 }
			}
		}

	}

}
