package day30_wrapperClass;

public class CommandLineArgument {

	public static void main(String[] args) { //we can directly use this main method for our array because it has
		
		for(int i = 0; i<args.length; i++) {
			
			System.out.println(args[i]);
			
			/* How to pass arrays elements to this main methods ! (we use terminal or powershell)
			  
			 1- write code like above
			 2- copy it to sublime or any keynote.
			 3- save it as with class name (CommandLineArgument.java) so you will see it in desktop
			 4- compile it (javac CommandLineArgument.java), with this compiler converts class to machine language!!!
			 5- run it (java CommandLineArgument "apple 1 2 true") you can add as a string what element you pass to array 
			 be careful when running No .class or.java for class name extending
			 
			 */
		}
		
	}

}
