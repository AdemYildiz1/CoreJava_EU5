package day20_StringManipulation_Part2;

public class String_IndexOf2 {

	public static void main(String[] args) {
	
		// index of with 2 Values if we need 2nd or 3rd character if they are same(

		String list= "html-selenium-angular-jenkins-grid";
		
		int firstDash=list.indexOf("-");
		System.out.println(firstDash);
		                                        
		int secondDash=list.indexOf("-", 5);    // it means after index 5 compiler checks if there is "-"  .  
		System.out.println(secondDash); //13    //because our first index of  "-" is 4 so I want it to check second one after 5.
		                                        // so index of 2nd '-' is 13(from beginning)                         
		             
		int thirdDash=list.indexOf("-", secondDash+1);// you can say 14 or (secondDash+1) to find thirdDash.
		System.out.println(thirdDash);
		
		int lastDash=list.lastIndexOf("-");
		System.out.println(lastDash);// 29      compiler works from last to beginning.. like checks d,i,r,g..
		
	}

}
