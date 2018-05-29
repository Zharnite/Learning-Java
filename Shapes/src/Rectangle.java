
public class Rectangle extends Quadrilateral {

	public Rectangle(double s1, double s2, String rectName) {
		super(s1, s2, s1, s2, rectName);
	}
	
	public Rectangle(double side, String rectName) {
		super(side, side, side, side, rectName);
	}
	
	public double area() {
		return getSide1() * getSide2();
	}
	
	public boolean isSquare() {
		return getSide1() == getSide2();
	}
	
}
