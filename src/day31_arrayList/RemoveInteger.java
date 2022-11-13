package day31_arrayList;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer>nums=new ArrayList<>();
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());//true
		System.out.println(nums.size()==0);//true
		
		//lets add int element in my arrayList we can just add object to array list not primitive
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());//[4, 1, 44, 5, 10, 100, 55]
		 
		/*remove(): this method is two types
		  1-remove(index)
		  2-removes(object) */
		 
		//1-remove(index) removes the specified index number from the list.
		
		nums.remove(5);                      //100 is gone
		
		System.out.println(nums.toString());//[4, 1, 44, 5, 10, 55]
		
		//2-remove(object) removes the specified element from the list
		
		Integer n1=new Integer(5);           //created object from wrapper classes
		Integer n2=Integer.valueOf(5);       //or created object from wrapper classes by using this way
		
		nums.remove(n1);                     //object n1 that is 5 is gone
		
		System.out.println(nums.toString()); //[4, 1, 44, 10, 55]
		
		nums.remove(new Integer(4));         // or directly we can put like that, element 4 is gone 
		
		System.out.println(nums.toString()); //[1, 44, 10, 55]
		
		
	}

}
