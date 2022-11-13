package day12_controlFlowStatements_Part6;

public class LabeledStatement {

	public static void main(String[] args) {
		
		int i = 0;
		outer:                          // I labeled this loob as outer iki nokta ust uste
		     do {                  
		    	 i=8;
		    	 inner:                 // I labeled this loob as outer iki nokta ust uste
		    		 while(true) {
		    			 System.out.println(i--);
		    			 if(i==4) {
		    				 break outer;           // I wanted to break outer loop!!
		    			 }
		    		 }
		     }while(true);

	}

}
