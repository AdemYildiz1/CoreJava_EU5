package day11_controlFlowStatements_part5;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i = 3;
		while(i<=8) {
			System.out.println(i);
			i++;
		}
		
// using a loop , iterate until we have 10 student in room
		 int numberOfStudent=1;
		 
		 while(numberOfStudent<=10) {
			 System.out.println("student "+ numberOfStudent);
			 numberOfStudent++;
		 }
		 
 //print 11, 10, 9, 8....1
		 int num=11;
		 while(num>=1) {
			 System.out.print(num+" ");
			 num--;
		 }
		 
	}

}
