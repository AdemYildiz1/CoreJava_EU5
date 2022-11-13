package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question13 {

	public static void main(String[] args) {
		
		int[]x= {1,2}; int[]y= {3,4};
		
		int[]z= {5,6}; int[]k= {3,8};
		
		System.out.println(largest(x, y));
        System.out.println(largest(z, k));
        
	}
	public static String largest(int[]arr1,int[]arr2) {
		int sum1=0;
		int sum2=0;
		
		for(int value:arr1) {
			sum1=sum1+value;
		}
		for(int value:arr2) {
			sum2=sum2+value;
	}
		if (sum1==sum2) {
			return "equal";
		}
		if(sum1>sum2) {
		return Arrays.toString(arr1);  // we used "Arrays.toString"  this method in our method.
		
		}else {
			return Arrays.toString(arr2); // 
		}
		
	}

}



