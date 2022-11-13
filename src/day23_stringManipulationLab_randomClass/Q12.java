package day23_stringManipulationLab_randomClass;

public class Q12 {

	public static void main(String[] args) {
		
		System.out.println(catDog("catdogcatDOGdog"));
		System.out.println(catDog("Catthidog hdogcati"));

	}
	public static boolean catDog(String str) {
		
		int catCounter=0;
		int dogCounter=0;
		
		for(int i=0; i<str.length()-2; i++){
			
			if (str.substring(i,i+3).equalsIgnoreCase("cat")) {
				catCounter++;
			}
			if (str.substring(i,i+3).equalsIgnoreCase("dog")) {
				dogCounter++;
			}
			
		}
		if(catCounter==dogCounter) {
			return true;
		}else {
			return false;
		}

	 
    }
}
