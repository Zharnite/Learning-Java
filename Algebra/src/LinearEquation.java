
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
	
	//point slope constructor 
	public LinearEquation(double slope, Coords point) {
		a = -slope;
		b = 1;
		c = slope * point.getX() - point.getY();
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
		
		double x;
		
		if(this.isVertical()) 
			x = -c/a;
		else if(other.isVertical())
			x = -f/d;
		else
			x = (b*f - c*e)/(a*e - b*d);
		
		double y = (-a/b)*x - (c/b);
		
		return new Coords(x, y);
		
	}
	
	public LinearEquation perpendicularLine(Coords point) {
		if(this.isVertical()) {
			return new LinearEquation(0, 1, -point.getX());
		}
		if(this.isHorizontal()) {
			return new LinearEquation(1, 0, -point.getY());
		}
		
		return new LinearEquation(-1/this.getSlope(), point);
	}
	
	public double shortestDistanceFrom(Coords point) {
		//LinearEquation perpendicular = this.perpendicularLine(point);
		//Coords intersection =  this.pointOfIntersection(perpendicular);
		//double distance = point.distanceFrom(intersection);
		//return distance;
		return point.distanceFrom(pointOfIntersection(perpendicularLine(point)));
	}
	
	
	
	
	
	
	
	
}
