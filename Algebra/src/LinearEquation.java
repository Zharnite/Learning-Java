
public class LinearEquation {
	//ax + by + c = 0;
	//instance variables
	private double a, b, c;
	//private double b;
	//private double c;
	
	public LinearEquation(double aValue, double bValue, double cValue) {
		a = aValue;
		b = bValue;
		c = cValue;
		
	}
	
	public LinearEquation(LinearEquation other) {
		this.a = other.a;
		this.b = other.b;
		this.c = other.c;
	}
	
	public String toString() {
		return a + "x + " + b + "y + " + c + " = 0";
	}
	
	//accessors
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public boolean slopeDefined() {
		return b != 0 ;
	}
	
	public boolean isHorizontal() {
		return a == 0 && b != 0;
	}
	
	public boolean isVertical() {
		return a != 0 && b == 0;
	}
	
	public boolean hasYIntercept() {
		return b != 0;
	}
	
	public boolean hasXIntercept() {
		return a != 0;
	}
	
	public double getSlope() {
		return -a/b;
	}
	
	public double xIntercept() {
		return -c/a;
	}
	
	public double yIntercept() {
		return -c/b;
	}
	
	public boolean equals(LinearEquation other) {
		if(this.isVertical() && other.isVertical()) {
			return this.xIntercept() == other.xIntercept();
		}
		return this.getSlope() == other.getSlope() && this.yIntercept() == other.yIntercept();
	}
	
	public Coords pointOfIntersection(LinearEquation other) {
		if(this.equals(other)) {
			return null;
		}
		if(this.isVertical() && other.isVertical()) {
			return null;
		}
		if(this.getSlope() == other.getSlope()) {
			return null;
		}
		
		double d = other.a;
		double e = other.b;
		double f = other.c;
		
		double x = -(-f/e + c/b)/(-d/e + a/b);
		double y = (-a/b)*x - c/b;
		
		return new Coords(x, y);
		
	}
	
	
	
	
	
	
	
	
	
}
