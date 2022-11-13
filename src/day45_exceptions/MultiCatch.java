package day45_exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		//For multi catch we have just one RULE if there is inheritance relationship.
		//RULE!, In catch block, more specialize classes will be first/means first child then parent
		//otherwise it will be unreachable
		
		try {
			//if it gives arithmetic exception/ then ArithmeticException class or exception Class can catch
			System.out.println(4/0);
			
			//if NullPointer Exception happens/ then NullPointerException class or Exception Class can catch
			String str = null;
			System.out.println(str.toUpperCase());
			
			//if array index out of bound exception happens/ Then ArrayIndexOutOfBoundsException Class or Exception Class can catch
			int[]n= {10,4};		
			System.out.println(n[2]);
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception happened");
		}catch(NullPointerException e){
			System.out.println("Arithmetic exception happened");
		}catch(RuntimeException e){
			e.printStackTrace();
		}
	}

}
