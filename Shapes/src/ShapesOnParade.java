import java.util.List;
import java.util.ArrayList;


public class ShapesOnParade {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Triangle(3, 4, 5, "Abu Dubai"));
		shapes.add(new Rectangle(5, "Free Shavaca Dos"));
		shapes.add(new Rectangle(5, "A nuss"));
		shapes.add(new Circle(2, "Dr. Walcott"));
		shapes.add(new Rectangle(25, 4, "George Washington"));
		shapes.add(new Rectangle(10, 10, "Door"));
		shapes.add(new Triangle(7, 9, 11, "Chalcedony"));
		shapes.add(new Triangle(12, 5, 13, "Grunka"));
		shapes.add(new Circle(12, "Communism"));
		shapes.add(new Circle(1.1, "CHINA"));
		
		/*
		for(Shape s : shapes) {
			System.out.println(s);
			if(s instanceof Triangle) {
				Triangle t = (Triangle)s;
				if(t.isRightTriangle()) {
					System.out.println(t.getName() + " is a right triangle");
				}
				else {
					System.out.println(t.getName() + " is not a right triangle");
				}
			}
			if(s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;
				if(r.isSquare()) {
					System.out.println(r.getName() + " is a square");
				}
				else {
					System.out.println(r.getName() + " is a rectangle");
				}
			}
		}
		System.out.println();
		*/
		/*
		for(int i = 0; i < shapes.size(); i++) {
			Shape smallest = shapes.get(i); // set smallest to the first not ordered index
			for(int j = i + 1; j < shapes.size(); j++) { // loop to determine the smallest shape and put it in smallest
				if(smallest.area() > shapes.get(j).area()) { // test if it is it the smallest
					Shape temp = smallest; // stores the fake smallest in temp
					smallest = shapes.get(j); // smallest become the next smallest
					shapes.set(j, temp); // putting the fake smallest back in the list
				}
			}
			shapes.set(i, smallest); // sets real smallest to put in the index 
		}
		
		for(Shape s : shapes) { // loops through shapes
			System.out.println(s); //prints the shape according to the toString() method
		}
		*/
		for(int i = 0; i < shapes.size(); i++) {
			int lowPosition = i;
			for(int j = i + 1; j < shapes.size(); j++) {
				int comparison = shapes.get(lowPosition).compareTo(shapes.get(j));
				if(comparison > 0) {
					lowPosition = j;
				}
			}
			shapes.set(lowPosition, shapes.set(i, shapes.get(lowPosition))); // set lowest i to the lowPosition found before, and then sets what is returned(what was previously in i position) to "lowPosition"
		}
		for(Shape s : shapes) { 
			System.out.println(s); 
		}
		System.out.println();
		
	}

}
