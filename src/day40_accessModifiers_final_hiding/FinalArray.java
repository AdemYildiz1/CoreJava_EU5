package day40_accessModifiers_final_hiding;

public class FinalArray {

	public static void main(String[] args) {
		
		//we did before without final keyword
		int[]nums=new int[]{20,20,40};//it is for garbage collector because,
		nums=new int[] {10,15,100};  // REMEMBER! here,now nums is referencing new elements created
		
		//1 ------------------------------------------------------------------------------
		
		final int [] TEAMS= {11,11};
		System.out.println(TEAMS[0]);//11
		
		TEAMS[0]=15;
		System.out.println(TEAMS[0]);//15, we can modify the element, final keyword doesn't affect elements
		
		//2 ------------------------------------------------------------------------------
		
		final int[]finalNums= {23,66,44};
		//finalNums[]=new int[] {1,2,3}; we can not re-assign/(changing referencing) another object using new keyword
		
		
	}

}
