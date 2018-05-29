
public abstract class Quadrilateral extends Shape {
	private double side1, side2, side3, side4;
	
	public Quadrilateral(double s1, double s2, double s3, double s4, String quadName) {
		super(quadName);
		side1 = s1;
		side2 = s2;
		side3 = s3;
		side4 = s4;
	}
	
	
	public double perimeter() {
		return side1 + side2 + side3 + side4;
	}
	
	public double getSide1() { return side1; }
	public double getSide2() { return side2; }
	public double getSide3() { return side3; }
	public double getSide4() { return side4; }
	
}
