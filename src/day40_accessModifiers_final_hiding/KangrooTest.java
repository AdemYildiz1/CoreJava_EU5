package day40_accessModifiers_final_hiding;

public class KangrooTest {

	public static void main(String[] args) {


		Kangaroo k= new Kangaroo();
		//k.getMarsupialDescriprtion(); //true,     here is "method overridden" (static) that's why child's method replace with parent's.
		                                          //(you will see if you do comment off)
		
		
		k.getKangrooDescriprtion(); //true,    here is "method hiding" (static)
		

	}

}


