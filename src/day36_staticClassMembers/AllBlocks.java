package day36_staticClassMembers;

public class AllBlocks {

	public AllBlocks (int x) {
		System.out.println("One argument constructor");
	}
	
	public AllBlocks () {
		System.out.println("No argument constructor");
	}
	
	static {
		System.out.println("First static init");  //STATIC BLOCK  REMEMBER it runs FIRST TIME and just ONE TIME And before anything
	}
	
	{
		System.out.println("First instance init"); //INSTANCE BLOCK ,RULE!,It runs before constructor and each time
	}
	
	{
		System.out.println("Second instance init"); //INSTANCE BLOCK
	}
	
	static {
		System.out.println("Second static init");   //STATIC BLOCK
	}
	
	//STATIC BLOCK and INSTANCE BLOCK are called INITIALIZATION BLOCKs as well)
	
}
