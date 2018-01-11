
public class UnderGrad extends Student {
	public UnderGrad(String studName, int[] studTests, String studGrade) {
		super(studName, studTests, studGrade);
	}
	
	public UnderGrad() {
		super();
	}
	
	public void computeGrade() {
		if(getTestAverage() >= 70)
			setGrade("Pass");
		else
			setGrade("Fail");
	}
	
	
	
}
