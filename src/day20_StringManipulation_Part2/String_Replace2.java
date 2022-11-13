package day20_StringManipulation_Part2;

public class String_Replace2 {

	public static void main(String[] args) {

       // I want all spaces to go
		String sentence="Codding is fun, it is my hobby";

		String withNoSpace=sentence.replace(" ", "");
		
		System.out.println(withNoSpace);
		
		//replace "," with "!"
		String x=sentence.replace(",", "!");  // 1st way
		System.out.println(x);                         
		System.out.println(sentence.replace(",", "!")); // 2nd way
		
		// cleaning mixed
		
		String mixed="&^@|#$-v@#$";
		mixed=mixed.replace("&^@|#$-v", "");
		System.out.println(mixed);
		mixed=mixed.replace("@#$", "");
		System.out.println(mixed); // tamamen temizlendigi icin apple bir sonraki line print edilir
		System.out.println("apple");
		
		// correcting mixed
		
		String s ="j$a-v|a";
		
		s=s.replace("$", "").replace("-", "").replace("|", ""); //NOT! we can use multiple REPLACE METHOD like CONCAT METHOD.
		System.out.println(s);
		
		//getting on string in full string
		
		String result = "About 8,930,000,000 result (0.68 seconds)";
		
		result = result.replace("About ", "").replace("result (0.68 seconds)", "");
		
		System.out.println(result);
		
		
		
		
		
		
	}

}
