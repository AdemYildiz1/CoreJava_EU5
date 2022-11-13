package day23_stringManipulationLab_randomClass;

public class Question_14 {

	public static void main(String[] args) {
	
		
//		String str = "Hello";
//		
//		if(str.length()>2) {
//			str.substring(0, 2);
//			
//		}else {
//			
//			
//		}
		
		String str="level";
		
		String p="";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			p=p+str.charAt(i);
		}
			System.out.println(p);
	}
	
	

}


