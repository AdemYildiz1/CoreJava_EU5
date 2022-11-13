package day27_arrays_part4;

public class Lab4_Question3 {

	public static void main(String[] args) {
		
		int[]x= {1,2,3};
		int[]y= {7,3};
		
		int[]x1= {1,2,3};
		int[]y1= {7,3,2};
		
		int[]x2= {1,2,3};
		int[]y2= {1,3};
		
		int[]x3= {1};
		int[]y3= {7,3};
		
		int[]x4= {1,2,3};
		int[]y4= {1};
		
		System.out.println(commonEnd(x, y));
		System.out.println(commonEnd(x1, y1));
		System.out.println(commonEnd(x2, y2));
		System.out.println(commonEnd(x3, y3));
		System.out.println(commonEnd(x4, y4));
	}
	public static String commonEnd(int[] arr1,int[] arr2) {
		
		if(!(arr1.length>1)) {
			return "Array 1 is not valid";
		}
		if(!(arr2.length>1)) {
			return "Array 2 is not valid";
		}
		
		if(arr1[0]==arr2[0] || arr1[arr1.length-1]==arr2[arr2.length-1]) {	
			return "true";
		}else {
			return "false";
		}
		
	}
}

