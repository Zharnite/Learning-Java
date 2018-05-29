
public class Triangle extends Shape {
	private double a, b, c;
	
	public Triangle(double side1, double side2, double side3, String triName) {
		super(triName);
		a = side1; b = side2; c = side3;
	}
	
	public double area() {
		double s = semiperimeter();
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	
	public double perimeter() {
		return a + b + c;
	}
	
	public boolean isRightTriangle() {
		return isValidTriangle() && (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a); 
	}
	
	public boolean isValidTriangle() {
		return a > 0 && b > 0 && c > 0 && (a + b) > c && (a + c) > b && (c + b) > a;
	}
}
