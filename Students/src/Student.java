
public class Student implements Comparable<Student>{
	
	private String lastName;
	private String firstName;
	private String major;
	private boolean female;
	private double shoeSize;
	
	public Student(String familyName, String givenName, String major, boolean isFemale, double shoeSize) {
		lastName = familyName; 
		firstName = givenName;
		this.major = major;
		female = isFemale;
		this.shoeSize = shoeSize;
		
	}
	
	public String toString() {
		String gender;
		if(female) 
			gender = "female";
		else
			gender = "male";
		
		return firstName + " " + lastName + ", " + major + ", " + gender + ", " + "size " + shoeSize;
	}
	
	public int compareTo(Student other) {
		int lastCompare = this.lastName.compareTo(other.lastName);
		if(lastCompare != 0) {
			return lastCompare;
		}
		return this.firstName.compareTo(other.firstName);
	}
	
	public int compareByMajor(Student other) {
		int majorCompare = this.major.compareTo(other.major);
		if(majorCompare != 0) {
			return majorCompare;
		}
		if(this.female != other.female) {
			if(this.female) {
				return -1;
			}
			else {
				return 1;
			}
		}
		return this.compareTo(other);
	}
	
	public String getMajor() {
		return major;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
}
