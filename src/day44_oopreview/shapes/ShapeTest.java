package day44_oopreview.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		//Let's create 3 shapes, using polymorphism
		
		Shape dia =new Diamond ();
		Shape squ = new Square();
		Object shapeObject = new Shape(); //this time Object Class is father Shape is child
		
		squ.draw();
		dia.draw();
		
		//Casting
		((Square)squ).squareMethod();
		
		
		
	}

}
