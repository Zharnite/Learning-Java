
public class GradStudent extends Student {
	private int gradID;
	
	public GradStudent(String studName, int[] studTests, String studGrade, int gradStudID) {
		super(studName, studTests, studGrade);
		gradID = gradStudID;
	}
	
	public GradStudent() {
		super();
		gradID = 0;
	}
	
	public int getID() { return gradID; }
	
	public void computeGrade() {
		super.computeGrade();
		if(getTestAverage() >= 90)
			setGrade("Pass with distinction");
		
	}
	
	
	
}
