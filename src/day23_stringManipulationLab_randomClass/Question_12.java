package day23_stringManipulationLab_randomClass;

public class Question_12 {

	public static void main(String[] args) {
	
		String str= "Cat dog dog cat";

		int counterCat=0;
		int counterDog=0;
		
		for (int i=0; i<str.length()-2; i++) {
			
			if (str.substring(i, i+3).equalsIgnoreCase("cat")) {
				counterCat++;
			}
			if(str.substring(i, i+3).equalsIgnoreCase("dog"))	{
				counterDog++;
				
			}		
		}
		System.out.println(counterCat==counterDog);// it prints true or false 
	}

}



