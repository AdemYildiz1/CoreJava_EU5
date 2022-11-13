package day36_staticClassMembers;

public class Countable {
	
	 static int instanceCount; //first it was instance variable
	                          //after putting static key word it becomes class variable

	public Countable() {
		this.instanceCount ++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
	
	

}
