package day42_interface;

public interface Electric {

	
	public static final boolean HAS_BATERIES=true;
	
	boolean HAS_BATTERIES2=false; // it is always public static final, even if you don't specify.
	
	public abstract void charge(); 
	
	void charge2(); //it is always public abstract like (above), even if you don't specify. 
	
	public default void methodA() {
		//code
	}
	public static void MethodB() {
		//code
	}
}
    //Abstraction is a class. But, interface is NOT a class.

	//Unlike Abstraction and inheritance, interfaces supports multiple class interfaces  

	//interfaces can have abstract methods, these methods are public abstract even though you don't specify.

	//interfaces can have default(it is special, not the same the default as we knew before) and static method as well.

	//interfaces can NOT have instance method

	//interfaces can not have blocks(static and instance)

	//like abstract class, you can NOT instantiate and create object interfaces

	//its variable are public static final even though you don't specify
    
    // interfaces can not have constructor

    //can only use public access modifiers

    //!!a class implements interfaces

    //!!interfaces extend interfaces

    //!!interfaces can not extend classes
 

	
