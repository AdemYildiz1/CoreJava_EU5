package day23_stringManipulationLab_randomClass;

public class Question_15 {

	public static void main(String[] args) {
	
		String str="xbadxx";
		
		if(str.substring(0,3).equals("bad")||str.substring(1,4).equals("bad")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}




