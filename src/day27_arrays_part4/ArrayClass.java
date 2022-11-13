package day27_arrays_part4;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		//1- toString()
		
		int[] nums = {43,12,4,1,3,5};
		System.out.println(Arrays.toString(nums)); //[43, 12, 4, 1, 3, 5]

		//2- equals()
		int[] nums1= {4,5,6,10,100};
		int[] nums2= {4,5,6,10,100};
		System.out.println(Arrays.equals(nums1, nums2));//true
		
		//!! SO FAR we called method from object like sc.next(), BUT in "Arrays." we called from class directly
		//which we will learn in Object Oriented class
		
		//3- sort(): sorts array in ascending(artan sekilde) order
		// In INTERVIEW can be asked, QUEESTION: can you sort the array without methods?
		
		int[] nums3 = {42,12,4,1,3,6};
		Arrays.sort(nums3);
		System.out.println(Arrays.toString(nums3));//[1, 3, 4, 6, 12, 42]
		
		String[] languages= {"Zulu","Spanish","Italian","English","1polish","Arabic",};
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages)); //number is first, then special car like(@) capital then small character
		
		//4- binarySearch(): gives us index number
		
		int[] numx= {1,2,7,4,10,55};
		System.out.println(Arrays.binarySearch(numx, 7));//2 means go to numx array print index of 7
		System.out.println(Arrays.binarySearch(numx, 55));//5
		System.out.println(Arrays.binarySearch(numx, 5)); // -3 // (-(insertionPOint)-1)  
		                                                 //if no number in array java prints based on this formula
		                                                 // java thinks 5 should be after 2 in array so index must be 2    
		                                                 // if you put number 2 in to formula it gives "-3"
		System.out.println(Arrays.binarySearch(numx, 15));// -6
		
		//5- copyOf():
		
		double[] d1= {2.3, 4.5, 12.4};
		double[] d2=d1; //REMEMBER this is not copy this is referencing/pointing the same object.
		System.out.println(Arrays.toString(d1));//[2.3, 4.5, 12.4] 
		System.out.println(Arrays.toString(d2));//[2.3, 4.5, 12.4]
		
		d1[0]=100.3;                                 //because it is not copy that's why any changes in array affect both
		System.out.println(Arrays.toString(d1));//[100.3, 4.5, 12.4] 
		System.out.println(Arrays.toString(d2));//[100.3, 4.5, 12.4]
		d2[1]=400.5;                     // or any changes in d2 affect both because they are referencing the same object
		System.out.println(Arrays.toString(d1));//[100.3, 400.5, 12.4]
		System.out.println(Arrays.toString(d2));//[100.3, 400.5, 12.4]
		
		// HERE is the copy method
		double []d3=Arrays.copyOf(d2, d2.length); // it copies from d2 array and same size of d2 and becomes new array(d3)
		System.out.println(Arrays.toString(d2)); //[100.3, 400.5, 12.4]
		System.out.println(Arrays.toString(d3));//[100.3, 400.5, 12.4]
		
		d2[0]=5.2;                               //any changes in d2 affect just d2.
		System.out.println(Arrays.toString(d2));//[5.2, 400.5, 12.4]
		System.out.println(Arrays.toString(d3));//[100.3, 400.5, 12.4] d3 is not affected so it is copy of old(former) d2
		
		double []d4=Arrays.copyOf(d2, 5);        //lets copy and have different array with different length
		System.out.println(Arrays.toString(d4));//[5.2, 400.5, 12.4, 0.0, 0.0] last two elements default because d2 has 3
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
