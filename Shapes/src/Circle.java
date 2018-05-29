
public class Circle extends Shape {
	private double radius;
	
	public Circle(double rad, String circleName) {
		super(circleName);
		radius = rad;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double perimeter() {
		return 2 * radius * Math.PI;
	}
	
}
