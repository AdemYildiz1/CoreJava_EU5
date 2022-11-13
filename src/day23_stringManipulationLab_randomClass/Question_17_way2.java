package day23_stringManipulationLab_randomClass;

public class Question_17_way2 {

	public static void main(String[] args) {

		//String str1="Taco cat";
		
		String str="mom";
		String dummy="";
		
		for(int i=str.length()-1; i>=0; i--) {
			 
			dummy=dummy+str.charAt(i);
		}
		
	if(str.equals(dummy)) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}	
	
	   // IF we get rid of space and case sensitive we can do like below
       //so we can handle str1 as well
	
//	if (str.replace(" ", "").equalsIgnoreCase(dummy.replace(" ", ""))){
//		System.out.println(true);
//	}else {
//		System.out.println(false);
//	}
		
	}

}


