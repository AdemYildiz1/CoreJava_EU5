package day23_stringManipulationLab_randomClass;

public class Question_17_PalindromesString {

	public static void main(String[] args) {
		
		
	String str="mom";
	
	String b="";
	
	int x=str.length();//3
	
		for(int i=x; i>0; i--) {
			
			b=b+str.substring(i-1,i);
		}
	
	if (str.equals(b)) {
		System.out.println("palindromes");
	}else {
		System.out.println("no palindromes");
	}

	}

}



