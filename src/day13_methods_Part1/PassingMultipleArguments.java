package day13_methods_Part1;

public class PassingMultipleArguments {

	public static void main(String[] args) {
		
		int x=100;
		int y=200;
		showSum(x, y);
		
		//yukaridaki calling method ile asagidaki ayni
		// yukaridaki x ve y'ye(argumentlere) deger assign yapip calling yapiyor
		// asagidak direk argumentler parameterlere pass oluyor ve calling yapiyor
		// so we can say java is "pass-by-value"
		
		showSum(5,10);
		showSum(50,20);
		showSum(80,20);
		
	}
	
	public static void showSum(int num1,int num2) {
		
		System.out.println(num1+num2);
		
	}
}


