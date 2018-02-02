//: typeinfo/Shapes.java
package mypackage;

import java.util.*;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  abstract public String toString();
  void rorate()
  {
	  if(!this.getClass().getSimpleName().equals("Circle"))
	  {
		  System.out.println(this+" Rotate");
	  }
  }
}

class Circle extends Shape {
  public String toString() { return "Circle"; }
}

class Square extends Shape {
  public String toString() { return "Square"; }
}

class Triangle extends Shape {
  public String toString() { return "Triangle"; }
}	

class Rhomboid extends Shape
{
	public String toString() {
		return "Rhomboid";
	}
}

public class Shapes {
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle()
    );
    for(Shape shape : shapeList)
    {
    	shape.draw();
    	shape.rorate();
    }
    Shape myShape=new Rhomboid();
    System.out.println((Circle)myShape);
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
