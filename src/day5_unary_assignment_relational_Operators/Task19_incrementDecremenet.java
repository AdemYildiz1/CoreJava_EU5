package day5_unary_assignment_relational_Operators;



public class Task19_incrementDecremenet {

	public static void main(String[] args) {

		int a = 50;
		int result = --a + a++ + a-- + a++;
		
		System.out.println("a = "+ a);
		System.out.println("result = "+ result);
        //result :--a= 49   in memory and prints
		//       :a++= 49   prints but memory increase to 50
		//       :a--= 50   prints number in memory which is already old but memory decrease 49
		//       :a++= 49   prints old value which is in memory
		
		
	}

}
