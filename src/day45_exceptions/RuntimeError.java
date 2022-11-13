package day45_exceptions;

public class RuntimeError {

	public static void main(String[] args) {
		
		//after running in council you will see run time error
		go();

	}
	public static void go() {
		System.out.println("Going");
		go();
	}

}
