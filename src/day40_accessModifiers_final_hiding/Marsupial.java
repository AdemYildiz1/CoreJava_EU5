package day40_accessModifiers_final_hiding;

public class Marsupial {
	
	/*
	  public boolean isBiped() {
		return false;
	}
	*/
	
	public static boolean isBiped() {
		return false;
	}
	public void getMarsupialDescriprtion() {
		System.out.println("Marsupial walks on the two legs: "+ isBiped());
	}
}
