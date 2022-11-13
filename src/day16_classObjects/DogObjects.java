package day16_classObjects;

public class DogObjects {

	public static void main(String[] args) {
		
		// creating OBJECT/INSTANCE
		
		Dog dog1=new Dog();
		
		Dog dog2=new Dog();
		
		Dog dog3=new Dog();
		
		//Accessing an Object's Data and Method AND assign 
		//dog1.age/breed..etc is assigned automatically with default values  // onemli degil interview de belki!
		System.out.println(dog1.age);  // 0                                  // string's default data=null
		System.out.println(dog1.breed); // null                              // integer's default data=0
		                                                                     // char's default'n000'
		//assigning  
		dog1.age=10;
		dog1.name="rover";
        System.out.println(dog1.age);
        
        dog2.age=5;
        dog2.color="red";
        dog2.breed="maltese";
        System.out.println(dog2.age);
        System.out.println(dog2.color);
        System.out.println(dog2.breed);
        
        dog1.barking();
        dog1.hungry();
        dog1.sleeping();
        
        
		
	}

}
