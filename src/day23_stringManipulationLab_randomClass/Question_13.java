package day23_stringManipulationLab_randomClass;

public class Question_13 {

	public static void main(String[] args) {
		
		
		String str= "The";
		String str1="";
		
		for(int i=0; i<str.length(); i++ ) {      
			
			str1=str1+str.substring(i, i+1).concat(str.substring(i, i+1));
			
		}
		System.out.print(str1); // after our str1 basket full then we can print
	}

}
