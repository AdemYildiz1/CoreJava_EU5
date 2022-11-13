package day21_StringManupilation_part3;

public class String_Trim {

	public static void main(String[] args) {
		// trim() methods removes spaces that they are in beginning or at the end /not spaces in the middle
		// for spaces in the middle we use replace method REMEMBER!!!  replace(("   "),(""))
		
		String str="      ad   em      "; 
		
        System.out.println(str.trim());
        
        //example; write a program to display  |342| from given string.
        String str1="  342  ";
        System.out.println("|"+str1.trim()+"|");
	}

}
