import java.util.List;
import java.util.ArrayList;

public class Students {
	private Student[] students;
	
	public Students(Student[] theStudents) {
		students = theStudents;
	}
	
	public String toString() {
		String output = "";
		for(Student s : students) {
			output += s.toString() + "\n";
		}
		output += "\n";
		return output;
	}
	
	public List<Student> getStudentsInMajor(String major) {
		List<Student> theStudents = new ArrayList<Student>();
		for(Student s : students) {
			if (s.getMajor().equals(major)) {
				theStudents.add(s);
			}
		}
		return theStudents;
	}
	
	public void alphabetize() {
		for(int pivot = 0; pivot < students.length - 1; pivot++) {
			int lowPosition = pivot;
			for(int k = pivot + 1; k < students.length; k++) {
				if(students[k].compareTo(students[lowPosition]) < 0) {
					lowPosition = k;
				}
				
			}
			Student temp = students[pivot];
			students[pivot] = students[lowPosition];
			students[lowPosition] = temp;
			
		}
	}
	
	
	
	
}				
