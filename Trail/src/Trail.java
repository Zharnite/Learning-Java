
public class Trail {
	private int[] markers;
	
	public Trail(int[] values) {
		markers = values;
	}
	
	public boolean isLevelTrailSegment(int start, int end) {
		int high = markers[start];
		int low = markers[start];
		
		for(int i = start + 1; i <= end; i++) {
			if(high < markers[i]) {
				high = markers[i];
			}
			if(low > markers[i]) {
				low = markers[i];
			}
		}
		
		if(Math.abs(high - low) <= 10) {
			return true;
		}
		
		return false;
	}
	
	public boolean isDifficult() {
		int numDiff = 0;
		for(int i = 1; i < markers.length; i++) {
			if(Math.abs(markers[i-1] - markers[i]) >= 30) {
				numDiff++;
			}
		}
		if(numDiff >= 3) {
			return true;
		}
		return false;
	}
	
	public void sortArr() {
		
		for(int i = 0; i < markers.length; i++) {
			
			for(int s = i + 1; s < markers.length; s++) {
				int low = markers[i];
				if(markers[s] < low) {
					low = markers[s];
					int temp = markers[s];
					markers[s] = markers[i];
					markers[i] = temp;
				}
			}
			
		}
		
	}
	
	public String toString() {
		String output = "";
		for(int a : markers) {
			output += a + ", ";
		}
		return output + "\n";
	}
	
	
}
