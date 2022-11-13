package day19_stringManipulation_part1;

public class String_Contains {

	public static void main(String[] args) {
		//it is common on work environment...IMPORTANT!!!
		//example 1
		String email="test@gmail.com";
		System.out.println(email.contains("@"));//true

		//example 2
		String list="potatoes, tomatoes,eggs,milk,apples,bread cereal,meats";
		
		if(list.contains("apples")) {
			System.out.println("apples are in my list");
		}else {
			System.out.println("apples are not in my list");
		}
		boolean hasEggs=list.contains("eggs");
		System.out.println("contains eggs: "+ hasEggs);
		
		boolean hasCucumbers=list.contains("cucumbers");
		System.out.println("contains cucumbers: "+ hasCucumbers);
		
		email="name@yahoo.com";
		
		if (email.contains("@yahoo")){
			System.out.println("yahoo account");
		}else if(email.contains("@gmail")) {
			System.out.println("gmail account");
		}else if(email.contains("@hotmail")){
			System.out.println("hotmail account");
			
		}
		
		String etsyTitle="Car | Etsy";
		
		if (etsyTitle.contains("|")) {
			System.out.println("it is there as expected");
		}else {
			System.out.println("pipe it is not detected");
		}
		//like real test cases
		String searchItems="computer";
		
		String title="Amazon.com: computer";
		
		if(title.contains(searchItems)) {
			System.out.println("pass");
		}
		
		
		
	}

}
