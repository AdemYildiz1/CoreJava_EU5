package day36_staticClassMembers;

public class CountableTest {

	public static void main(String[] args) {

		
		int objectCount;
		
		Countable obj1= new Countable();
		Countable obj2= new Countable();
		Countable obj3= new Countable();
		
		//before putting static key word
		objectCount=obj1.getInstanceCount();
		System.out.println(objectCount); //1
		
		objectCount=obj2.getInstanceCount();
		System.out.println(objectCount); //1
		
		objectCount=obj3.getInstanceCount();
		System.out.println(objectCount); //1
		
		//after putting static key word 
		
		objectCount=obj1.getInstanceCount();
		System.out.println(objectCount); //3
		
		objectCount=obj2.getInstanceCount();
		System.out.println(objectCount); //3
		
		objectCount=obj3.getInstanceCount();
		System.out.println(objectCount); //3
		
		//2 way printing, after being static variable we can use class name to print
		//System.out.println(Countable.instanceCount); //3
		
	}

}
