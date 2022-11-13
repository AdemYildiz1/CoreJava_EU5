package day40_accessModifiers_final_hiding;

public class Kangaroo extends Marsupial{

	/*
	public boolean isBiped() {
		return true;
	}
	*/
	
	public static boolean isBiped() {
		return true;
	}
	
	
	public void getKangrooDescriprtion() {
		System.out.println("Kangroo hops on the two legs: "+ isBiped());
	}
}
