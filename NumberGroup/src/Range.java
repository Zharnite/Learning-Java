
public class Range implements NumberGroup {
	
	private int min;
	private int max;
	
	public Range(int low, int high) {
		min = low;
		max = high;
	}
	@Override
	public boolean contains(int value) {
		// TODO Auto-generated method stub
		return value >= min && value <= max;
	}
	
	public int getMax() {
		return max;
	}
	
	public int getMin() {
		return min;
	}

}
