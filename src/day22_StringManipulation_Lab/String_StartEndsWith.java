package day22_StringManipulation_Lab;

public class String_StartEndsWith {

	public static void main(String[] args) {
		//startsWith() and endsWith() method check the string if it starts or ends with the given character
		//these two methods returns true 

		String word1="eclipse";
		System.out.println(word1.startsWith("e"));//true
		System.out.println(word1.startsWith("ec"));//true
		System.out.println(word1.startsWith("ex"));//false
		
		System.out.println(word1.endsWith("e"));//true
		System.out.println(word1.endsWith("ipse"));//true
		System.out.println(word1.endsWith("te"));//false
		
		// Example; Write a program that checks titles comes before people like the following
		//Mr.  => married man
		//Mrs. => married woman
		//Ms.  => some woman
		//Dr.   => Doctor man or woman
		//No title  => unknown status
		
		String name="Mr. Jackson";
		
		if(name.startsWith("Mr.")) {
			System.out.println("married man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("some woman");
		}else if(name.startsWith("Dr.")) {
            System.out.println("Doctor man or woman");
		}else {
			System.out.println("unknown status");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
