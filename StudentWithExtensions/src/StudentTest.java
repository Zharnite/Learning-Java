import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("Brian Lorenzen", new int[] {90, 94, 99}, "none");
		Student u = new UnderGrad("Tim Broder", new int[] {70, 70, 60}, "none");
		Student g = new GradStudent("Kevin Cristella", new int[] {95, 90, 90}, "none", 1234);
		
		s.computeGrade();
		u.computeGrade();
		g.computeGrade();
		
		System.out.println(s.getGrade());
		System.out.println(u.getGrade());
		System.out.println(g.getGrade());
		
		int theID = ((GradStudent)g).getID();
		System.out.println(theID);
		
		List<Student> q = new ArrayList<Student>();
		
	}
}
