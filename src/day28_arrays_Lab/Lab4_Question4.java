package day28_arrays_Lab;

public class Lab4_Question4 {

	public static void main(String[] args) {
		
		int[]x= {1,2,3};
		int[]y= {5,11,2};
		int[]z= {7,0,0};
		int[]a= {3,-2,10,4};
		
		System.out.println(SumOfElements(x));
		System.out.println(SumOfElements(y));
		System.out.println(SumOfElements(z));
		System.out.println(SumOfElements(a));
		
	}
	public static int SumOfElements(int[]arr) {
		int sum=0;
		
		for(int value: arr) {
			 sum=sum+value;
		}
		return sum;
		
		
		
	}

}
