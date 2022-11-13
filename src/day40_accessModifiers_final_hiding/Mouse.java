package day40_accessModifiers_final_hiding;

public class Mouse extends Rodent {

	protected int tailLength=8;
	
	public void getMouseDetail() {
		System.out.println("tail: "+ tailLength+", parentTail: "+ tailLength);
		
	}
}
