package day14_methods_part2;

public class Lab1_StringTimes {

	public static void main(String[] args) {
		
		/*
		 Question-1
            Write a method that accepts a string and a non-negative number, 
            and prints a larger string that is number copies of the original String

           stringTimes("Hi", 2); = > HiHi
           stringTimes("Hi", 3); = > HiHiHi
           stringTimes("Hi", 1); = > Hi
		 */
		
		stringTimes1("Hi",2);
		stringTimes2("Hi",4);
	}
	//way-1
	public static void stringTimes1(String s, int number) {
		for(int i=0; i<number; i++) {
			
		//System.out.print(s);
		}
	}
   //way-2
	public static void stringTimes2(String s2, int number2) {
		String str="";
		
		for(int i=0; i<number2; i++) {
			
			str=str+s2;
			
		}
		System.out.println(str);
	}
	
	
}
