package day20_StringManipulation_Part2;

public class String_Equals2 {

	public static void main(String[] args) {
		
		String s1="Welcome to java";
		String s2="Welcome to java";
		String s3="Welcome to C++";
		
		boolean b1=s1.equals(s2);
		boolean b2=s1.equals(s3);
		
		System.out.println(b1+"|"+b2); //true|false
		
		boolean b3=s1==s2;
		boolean b4=s1==s3;
		
		System.out.println(b3+"|"+b4); //true|false
		
		String s4=new String("Welcome to java");
		
		System.out.println(s1==s4); // false, so they are different object
		System.out.println(s1.equals(s4)); //true, so they are the same values
		
	// s1.equalsIgnoreCase() method
		s1.equalsIgnoreCase("ASDFGHJEsdfghj"); //ignores cases if they capital or no it gives true answer
		
	}

}
