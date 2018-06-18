package git.Learning;

abstract class Shape{
	double side1,side2;
	
	Shape(double x, double y){
		side1= x;
		side2= y;
	}
	abstract double area();
}

class Triangle extends Shape{
	Triangle(double x, double y){
		super(x,y); 
		/*if we don't call super constructor; 
		 * Compilation error: Implicit super constructor Shape() is undefined. Must explicitly invoke another constructor
		 */
	}
	double area(){  //overriding :::: implemetation of area () of Shape class
		System.out.println("Triangle Area:");
		return side1*side2/2;
	}
}
public class AbstractClasses {
	public static void main(String ar[]){
		Triangle triangle = new Triangle(10, 25);
		Shape shape;
		shape = triangle; //upcasting
		System.out.println(shape.area());  ///run-time polymorphism		
	}
}
