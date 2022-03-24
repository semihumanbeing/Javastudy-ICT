package mymain;

import myutil.Circle;
import myutil.Shape;
import myutil.Square;
import myutil.Triangle;

public class MyShape {
	
	public static void draw(Shape[] shapeArray) {
		for(int k=0;k<shapeArray.length;k++) {
			Shape shape = shapeArray[k];
			shape.draw();
		}
		
		
	}

	public static void main(String[] args) {
		Shape[] shapeArray = {new Square(), new Triangle(), new Circle(), new Triangle()};
		
		draw(shapeArray);

	}

}
