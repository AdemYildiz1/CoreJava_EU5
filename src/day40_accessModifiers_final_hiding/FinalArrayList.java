package day40_accessModifiers_final_hiding;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {
		
		final ArrayList<String> COLORS=new ArrayList<>();
		
		//final ArrayList is the Same the Final ARRAY, you can modify element/object but you can not change referencing
		//means you can not re-assign
		
		COLORS.add("Orrange");
		COLORS.add("red");
		COLORS.remove(0);

		//COLORS=new ArrayList<String>(); gives error
	}

}
