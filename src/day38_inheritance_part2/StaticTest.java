package day38_inheritance_part2;

public class StaticTest {

	public static void main(String[] args) {
		
		StaticSub obj = new StaticSub();
		obj.num=5;
		obj.print();
		
		StaticSuper.num=10;  //Remember!, if variable static we can be called and assigned with class name
		obj.print();
		
		StaticSub.num=20;  //likewise we can call and assign "num variable" with child class as well, because it has what parent class has 
		obj.print();
		System.out.println(StaticSub.num);//20

		
		// gives error because m2 is not static method so we CAN NOT call with parent or child class name
		// so we can call this just with object
		//StaticSuper.m2();
		//StaticSub.m2(); 
		obj.m2();         
		
		//m1(); is static so it can be called with parent or child class and with object as well
		StaticSuper.m1();
		StaticSub.m1();
		obj.m1();
	}

}
