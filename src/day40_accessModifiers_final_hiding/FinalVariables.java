package day40_accessModifiers_final_hiding;

public class FinalVariables {
	//When instance variable is final, we need to initialize it in;
	//1-same statement
	//2-constructor
	//3-init block   
	
	//1
	public final int ROADSTER_MAXRANGE=600; 
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	public static final String ADMIN_USERNAME; 
	                                           
	//2
	public FinalVariables (){               
		
		MODEL_3_MAX_SPEED=200;
		//ADMIN_USERNAME="MIKE";  //It can't be assigned because static variable belongs to class. So object needs creating.
		
	}
	
	
	{
   //3	                                   
		MODEL_X_PASSENGERS=7;
		//ADMIN_USERNAME="MIKE"; //REMEMBER! when we create object instance block is executed before cons 
		                         //Means if we don't create object instance variable doesn't run
	}
	
	static {
		ADMIN_USERNAME="MIKE";
	}
	
	public static void main(String[] args) {
		
		final int MAX_PASSENGERS_COUNT=5;
		
		final int SSN;
		
		//public final int x; REMEMBER local variable can not have access modifiers(public,defaul...etc)
		
		FinalVariables fv =new FinalVariables();
		System.out.println(fv.ROADSTER_MAXRANGE);
		System.out.println(fv.MODEL_X_PASSENGERS);
		System.out.println(fv.ADMIN_USERNAME);
		
		System.out.println(ADMIN_USERNAME);  
		//REMEMBER here we can call directly with variable name because we have static and same class 
		//as if we did static import like for eg; (PI) 
		
		

	}

}
