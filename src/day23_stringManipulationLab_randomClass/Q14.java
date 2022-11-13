package day23_stringManipulationLab_randomClass;

public class Q14 {

	public static void main(String[] args) {
		
		String str= "ybadx";
		
		boolean flag =true;
		
		for(int i=0; i<2; i++) {
			
			if(str.substring(i, i+3).equals("bad")) {
			
				flag=true;
				break;
				
		}else {

           flag=false;
			
		}
			
	}
		if (flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

		
 }
}
