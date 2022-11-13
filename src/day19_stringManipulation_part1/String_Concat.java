package day19_stringManipulation_part1;

public class String_Concat {

	public static void main(String[] args) {
		
		String word="java";
		
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		System.out.println(word);
		
		word=word.concat("+eclipse");
		System.out.println(word);// java+eclipse---not just "java" because we added eclipse 
		
		word=word.concat("+automation");
		System.out.println(word);// java+eclipse+automation---not just "java+eclipse" because we added eclipse than automation

		//word=word.concat(123) can not be executed because its is number
		
		word=word+123; // it is ok because this number like string
		System.out.println(word);//java+eclipse+automation123
		
		word=word+true;//it is executed 
		System.out.println(word);
		
		String word2="HI";
		word2=word2.concat("-hey").concat("-how are you").concat("-good");//you can concat in one line
		System.out.println(word2);
		
		
		
		

	}

}








