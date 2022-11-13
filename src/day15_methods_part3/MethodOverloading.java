package day15_methods_part3;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println();
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		//or print like below
		
		int x=sum(10,20,30,40);
		System.out.println(x);

	}
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int sum(int a, int b, int c) {
		return a+b+c;
		
	}
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}	
}

/*RULES

 1- Number of parameters
  sum(int,int)
  sum(int,int,int)
 
 2- Data Type of parameters
  sum(int, int)
  sum(int, double)
 
 3- Sequence of data type parameters
  sum(int,float)
  sum(float,int)
  
 4- Invalid case-not Overloading
  int sum(int,int)
  float sum(int,int)
  
  *access modifier or return type could be different or same , 
  *but method name must be the same.
  *parameter must be different by number, type or sequence
*/

