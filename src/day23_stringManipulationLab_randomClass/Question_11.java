package day23_stringManipulationLab_randomClass;

public class Question_11 {

	public static void main(String[] args) {
		 
		//our pattern;
		// String= "abc hi ho";       
		//hihello=substring(0,2);
		//xhiHello =substring(1,3)
		//xxhiHello= substring(2,4) so it increases by 2
		
		System.out.println(countHi("abc hi ho"));
		System.out.println(countHi("abc hi ho"));
		System.out.println(countHi("hi hohi"));
		
	}
	public static int countHi(String str) {
		int counter=0;
		String str1="hi";
		                                            // max index number =length()-1 so;
		for(int i=0; i<str.length()-1; i++) {       //if your border is length() java is complaining
			                                        // because for (i+2) index number can max be length-2
			if (str.substring(i, i+2).equals(str1)) {  
			
				counter++;
				
			}
			
		}
		return counter;
	}

}
