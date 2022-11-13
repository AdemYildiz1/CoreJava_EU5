package day20_StringManipulation_Part2;

public class String_indexOf {

	public static void main(String[] args) {
		
		// indexOf("x"); Basically get character gives its index number:)
		String word1="github";
		
		System.out.println(word1.indexOf(""));//0
		System.out.println(word1.indexOf("th"));//2 ,  it gives index of first character.
		System.out.println(word1.indexOf("hub"));//3
		
		System.out.println(word1.indexOf("java"));//-1 , prints -1 because there is no "java" in "github"
		
		// or you can use primative variable type to print index value
		String url="www.okta.com";
		int i=url.indexOf(".");//method returns integer---it gives index first  of "." full stop.
		System.out.println(i); //3
		
		System.out.println(url.charAt(i+1)); // it prints o
		
		// example; find position of '-'and check. if space is on right and left side.
		String title="java - Google Search";
		
		int x=title.indexOf("-");
		System.out.println(x);//5
		System.out.println(title.charAt(x-1));
		System.out.println(title.charAt(x+1));
		System.out.println("apple");
		
		String country= "United States of America";
		int states=country.indexOf("States");
		System.out.println("position of states: "+states);
		
		//example; check if c++ is in word2
		String word2 = "java, c++, python, tomcat, eclipse";
		
		//way 1- contains()
		if(word2.contains("c++")) { // contains returns boolean true if it has/contains 
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		//way 2- indexOf() 
		if(word2.indexOf("c++")>1) { // if indexOf is -1 which means no existing so we did indexOf>1
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
	}

}
