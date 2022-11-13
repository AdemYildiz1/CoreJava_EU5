package day44_oopreview.shapes;

import static day44_oopreview.shapes.ShapeManager.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeActions {

	public static void main(String[] args) {
		//we can import static..(above) so that we don't have to use class name
		//we can directly call its method name as well.
		
		//eg; let's run the drawSquare method
		
		drawSquare((Square)buildShape("square"));   //without class name
		ShapeManager.drawShape(buildShape("shape")); //with class name
		
		System.out.println("-------------");
		
		List<Shape>myList=new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Diamond());
		
		drawShape(myList);

	}

}
