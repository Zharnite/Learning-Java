
public class Coords {
	//instance variable, also called fields
	private double x;
	private double y;
	
	//constructor
	public Coords(double xValue, double yValue) {
		x = xValue;
		y = yValue;
	}
	
	//point at origin
	public Coords() {
		x = 0;
		y = 0;
	}
	
	//point on the line y = x
	public Coords(double value) {
		x = value;
		y = value;
	}
	
	//copy constructor
	public Coords(Coords other) {
		this.x = other.x;
		this.y = other.y;
	}
	
	//methods
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public boolean equals(Coords other) {
		return this.x == other.x && this.y == other.y;
	}
	
	public double distanceFromOrigin() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public void setX(double xValue) {
		this.x = xValue;
	}
	
	public void setY(double yValue) {
		this.y = yValue;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void reflectOnXAxis() {
		y = -y;
	}
	
	public void reflectOnYAxis() {
		x = -x;
	}
	
	public void reflectOnOrigin() {
		y = -y;
		x = -x;
	}
	
	public void translate(double horizontal, double vertical) {
		x = x + horizontal;
		y = y + vertical;
	}
	
	public void dilate(double dilationFactor) {
		x *= dilationFactor;
		y *= dilationFactor;
	}
	
	public double distanceFrom(Coords other) {
		return Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2));
		
	}
	
	
	
}

