package day43_polymorphism;

public class TestMethod {

	public static void main(String[] args) {
		
		ChildA chA =new ChildA();         //no polymorphism, so it can access m2,m3 and m1 is inherited from Parent
		chA.m1();   chA.m2();   chA.m3(); 

		ChildB chB=new ChildB();         //no polymorphism, so it can access m2,m4 and m1 is inherited from Parent
		chB.m1();   chB.m2();   chB.m4();  
		
		Parent p1 =new ChildA();        //polymorphism, so Parent decides 
		p1.m1();
		
		Parent p2= new ChildB();       // polymorpism
		p2.m1();
		
		MyInterface int1=new ChildA(); //poly
		int1.m2(); //overriddden one comes
		
		MyInterface int2=new ChildB(); //poly
		int2.m2(); ////overriddden one comes
		
		
		
		}
}

class Parent{
	public void m1() {}
}

interface MyInterface{
	void m2();
}

class ChildA extends Parent implements MyInterface{
	public void m2() {}
	public void m3() {}
	
}

class ChildB extends Parent implements MyInterface{
	public void m2() {}
	public void m4() {}  
}


