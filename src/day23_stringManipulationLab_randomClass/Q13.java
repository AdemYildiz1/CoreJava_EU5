package day23_stringManipulationLab_randomClass;

public class Q13 {

	public static void main(String[] args) {

		
		String str = "madamc";
		
		String dummy="";
		
		int l=str.length();
		
		for(int i =l; i>0; i--) {
			dummy=dummy+str.subSequence(i-1,i);
		}
		
		if(dummy.equals(str)) {
			System.out.println("polindrome");
		}else {
			System.out.println("not polindrome");
		}
	}

}
