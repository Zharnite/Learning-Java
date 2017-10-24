
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coords point1 = new Coords(2, 4);
		Coords point2 = new Coords(7.4, 6.9);
		System.out.println(point1);
		System.out.println(point2);
		
		double d1 = point1.distanceFromOrigin();
		System.out.println(d1);
		
		Coords point3 = new Coords(4);
		Coords point4 = new Coords();
		Coords point5 = new Coords(point1);
		System.out.println(point1 == point5);
		System.out.println(point1.equals(point5));

		point1.setX(7);
		
		System.out.println(point1.distanceFrom(point2));
		point1.reflectOnOrigin();
		System.out.println(point1);
		
		LinearEquation line1 = new LinearEquation(1, 1, 1); 
		LinearEquation line2 = new LinearEquation(2, 4, 5); 
		System.out.println(line1.pointOfIntersection(line2));
		
		LinearEquation line3 = new LinearEquation(2, 1, -4); 
		LinearEquation line4 = new LinearEquation(1, 1, -7); 
		Coords intersection = line3.pointOfIntersection(line4);
		System.out.println(intersection);
		
		
	}

}
