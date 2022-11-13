package day44_oopreview.callcenter;

public abstract class MessagingApp {
	
	public String name;
	protected boolean isFree;
	boolean allOSCompatible;
	private static int count;
	public static final String APP_TYPE="Messenger";
	
	public MessagingApp() {
		System.out.println("MessagingApp no-args constructor...");
	}

	public MessagingApp(String name, int count) { //we can initialize private variable thru cons OR,(Look at above)
		this.name = name;
		MessagingApp.count=count;
	}
	
	public abstract void sendMessage(String msg);
	
	public static void close() {
		System.out.println("Messaging App is Closing...");
	}
	
    void launch() {
		System.out.println("Messaging App is launching...");
	}

	public static int getCount() {
		return count;
	}
	public static void setCount(int count) { //we can initialize private variable setter
		MessagingApp.count = count;
	}
	
}
