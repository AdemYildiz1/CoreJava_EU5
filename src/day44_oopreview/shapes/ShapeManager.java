package day44_oopreview.shapes;

import java.util.List;

public class ShapeManager  {
	//Let's do it dynamic as we have done in Selenium with driver obj.
	public static Shape buildShape(String type) {
		
		Shape shape=null;
		
		switch(type.toLowerCase()) {
		case "shape":
			shape=new Shape();
			break;
		case "diamond":
			shape=new Diamond();
		    break;
		case "square":
			 shape= new Square();
			 break;
		}
		return shape;
	
	}
	//lets pass draw method from square class
	public static void drawSquare(Square squareObject) { //here we pass class name and an anyObject name.
		squareObject.draw();
	}
	
	public static void drawShape(Shape shapeObject) {
		shapeObject.draw();	
	} 
	
	//lets run each draw method(in Shape, Diamond and Square classes)
	//Here it means this method is accepting a List/arrayList 
	//And is assigning that arrayList to shapeList then inside the method is printing one by one from collection
	public static void drawShape(List<Shape> shapeList) { 
		
		for(Shape each: shapeList ) {
			each.draw();
		}
		
	}
}


//The reason why we use always static here. 
//1- to call directly with class name
//2- RULE!!!,  if the method doesn't have any instance variable u can do this method as a static.
//2. rule is really good to make utility class




