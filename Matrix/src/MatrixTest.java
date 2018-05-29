
public class MatrixTest {
	public static void toString(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		MatrixExample myMatEx = new MatrixExample(5,9);
		System.out.println(myMatEx);
		System.out.println(myMatEx.totalAll());
		toString(myMatEx.totalRow());
		toString(myMatEx.totalCol());
	}

}
