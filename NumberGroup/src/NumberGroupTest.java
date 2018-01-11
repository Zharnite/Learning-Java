
public class NumberGroupTest {
	
	public static void main(String args[]) {
		NumberGroup ng1 = new Range(-2, 101);
		NumberGroup ng2 = new EvenNumbers();
		NumberGroup ng3 = new PrimeNumbers();
		NumberGroup ng4 = new Range(70, 105);
		NumberGroup ng5 = new BTHSGrades(ng4);
		NumberGroup ng7 = new PalindromeNumbers();
		
		int value = 2002;
		System.out.println(ng1.contains(value));
		System.out.println(ng2.contains(value));
		System.out.println(ng3.contains(value));
		System.out.println(ng4.contains(value));
		System.out.println(ng5.contains(value));
		System.out.println(ng7.contains(value));
		
		
		
	}
}
