package day44_oopreview.callcenter;

public interface VoiceCallable {
	
	boolean CAN_CALL=true;          //REMEMBER!, it is public static final variable, Even if it doesn't specify.
	
    void call(String contact);      //REMEMBER!, it is public abstract method, even though it doesn't specify.
    
    public static void decline() {  //REMEMBER! Interface can have static method.
    	System.out.println("Mike declined voice call..");
    }
    
    public default void accept() {    //REMEMBER! Interface can have default method.
    	System.out.println("Mike finally accepted voice call..");
    }	
	

}
