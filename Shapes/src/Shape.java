
public abstract class Shape {
	private String name;
	
	public Shape(String shapeName) {
		name = shapeName;
	}
	
	public String getName() { return name; }
	
	public abstract double area();
	public abstract double perimeter();
	
	public double semiperimeter() {
		return perimeter()/2;
	}
	
	public boolean equals(Shape other) {
		return this.area() == other.area() && this.perimeter() == other.perimeter();
	}
	
	public int compareTo(Shape other) {
		if(this.area() > other.area()) {
			return 1;
		}
		if(this.area() < other.area()) {
			return -1;
		}
		if(this.perimeter() < other.perimeter()) {
			return 1;
		}
		if(this.perimeter() > other.perimeter()) {
			return -1;
		}
		return 0;
	}
	
	public String toString() {
		return name + " -> area = " + area() + ", perimeter = " + perimeter();
	}
	
	
	
}
