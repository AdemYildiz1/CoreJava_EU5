package day43_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapesArray {

	public static void main(String[] args) {
		
		//1- Array in polymorfic way
		
		Shape[] shapes = new Shape[3]; //holding 3 objects (here it is not polymorfism we did before)
		
		shapes[0]=new Square();
		
		shapes[1]=new Triangle();
		
		shapes[2]=new Circle();
		 
		//let's create loop and run each draw methods 
		for(Shape sh:shapes )  {
			sh.draw();  
			
		//extra	(interview), lets learn getClass() from special object class
			
			System.out.println(sh.getClass());                // gives object info
			System.out.println(sh.getClass().getName());      // gives package.className  of the object
			System.out.println(sh.getClass().getSimpleName());// returns just Class name of the object
		}
		
		//2-ArrayList in polymorfic way
		
		List<Shape> shapeList=new ArrayList<>();
		
		//here, List is the interface in collection, ArrayList is a class
		//so we can add objects to the ArrayList
		shapeList.add(new Triangle());
		
	}

}
