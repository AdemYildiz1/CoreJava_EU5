package day19_stringManipulation_part1;

public class Task77_EmojiProgram {

	public static void main(String[] args) {

		String emoji = ":/";
		
		//check if it does not equal to char.
		
		if (emoji.length() != 2) {
			System.out.println("Invalid Emoji");
			return;
		}

		//if code reaches this point, then emoji is 2 chars
		//get 1st and 2nd char and assign to variables
		
		char first=emoji.charAt(0);
		char second=emoji.charAt(1);
		
		if (first==':') {
			if(second==')') {
				System.out.println("smile");
			}else if(second=='('){
				System.out.println("sad");
			}else if(second=='/') {
				System.out.println("upset");
			}else {
				System.out.println("unknown emoji");
			}	
			
		}else if(first==';'){
			if (second==')') {
				System.out.println("wink");
			}else if(second=='0') {
				System.out.println("suprised");
			}else {
				System.out.println("unknown emoji");
			}
		}
	}
}








