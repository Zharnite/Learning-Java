
public class BTHSGrades implements NumberGroup {
	private NumberGroup passingGrades;
	
	public BTHSGrades(NumberGroup passingRange) {
		passingGrades = passingRange;
	}
	
	@Override
	public boolean contains(int value) {
		//NumberGroup passingGrade = new Range(65, 100);
		if(passingGrades.contains(value)) {
			return true;
		}
		if(value == 55) {
			return true;
		}
		if(value == 45) {
			return true;
		}
		if(value == 0) {
			return true;
		}
		return false;
	}

}
