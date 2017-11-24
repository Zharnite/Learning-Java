
public class TrailTest {

	public static void main(String[] args) {
		int[] values = {0,0,9,12,55,0,22,0,-99,-6};
		Trail trail1 = new Trail(values);
		trail1.sortArr();
		System.out.println(trail1);
		
		int[] values2 = {-55,0,0,0,99,0,-9,-5,-66,-8,0,4};
		Trail trail2 = new Trail(values2);
		trail2.sortArr();
		System.out.println(trail2);

	}

}
