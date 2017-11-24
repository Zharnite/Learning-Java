
public class LongestRun {

	public static void main(String[] args) {
		NumberCube theCube = new NumberCube();
		int[] myResults1 = getCubeTosses(theCube, 10);
		printArray(myResults1);
		
		
		int[] arr1 = {3,3,3,4,5,2,2,1,2};
		int[] arr2 = {1,1,4,5,6,6,6,6,3,3,3,3,6,2};
		int[] arr3 = {1,2,3,4,1,5,6,1,1,1};
		int[] arr4 = {1,2,3,4,5,6,5,4,5,4,5,4};
		int start1 = longestRun(arr1);
		int start2 = longestRun(arr2);
		int start3 = longestRun(arr3);
		int start4 = longestRun(arr4);
		System.out.println("arr1: " + start1);
		System.out.println("arr2: " + start2);
		System.out.println("arr3: " + start3);
		System.out.println("arr4: " + start4);
		
		printArray(arr4);
		reverseArray(arr4);
		printArray(arr4);
	}
	
	public static int[] getCubeTosses(NumberCube cube, int numTosses) {
		int[] results = new int[numTosses];
		int count = 0;
		while(count < numTosses) {
			results[count] = cube.toss();
			count++;
		}
		return results;
	}
	
	public static void printArray(int arr[]) {
		for(int e : arr) {
			System.out.print(e + ",");
		}
		System.out.println();
	}
	
	public static void reverseArray(int[] values) {
		int midpoint = values.length/2;
		for(int i = 0; i < midpoint; i++) {
			swap(i, values.length-1-i, values);
		}
	}
	
	public static int longestRun(int[] values) {
		int startOfCurrentRun = 0;
		int lengthOfCurrentRun = 1;
		int startOfLongestRun = 0;
		int lengthOfLongestRun = 1;
		
		for(int i = 1; i < values.length; i++) {
			//if run continues
			if(values[i-1] == values[i]) {
				lengthOfCurrentRun++;
			}
			//we are leaving a run and going to start a new run
			else {
				//was the run longer than previous
				if(lengthOfCurrentRun > lengthOfLongestRun) {
					lengthOfLongestRun = lengthOfCurrentRun;
					startOfLongestRun = startOfCurrentRun;
				}
				//start new run
				lengthOfCurrentRun = 1;
				startOfCurrentRun = i;
			}
		}
		
		if(lengthOfCurrentRun > lengthOfLongestRun) {
			lengthOfLongestRun = lengthOfCurrentRun;
			startOfLongestRun = startOfCurrentRun;
		}
		if(lengthOfLongestRun == 1) {
			return -1;
		}
		return startOfLongestRun;
		
		/*
		if(lengthOfCurrentRun > lengthOfLongestRun) {
			lengthOfLongestRun = lengthOfCurrentRun;
			startOfLongestRun = startOfCurrentRun;
		}
		if(values[i-1] != values[i]) {
			lengthOfCurrentRun = 1;
			startOfCurrentRun = i;
		}
		*/
		
	}
	
	private static void swap(int i, int j, int[] numbers) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		
	}
	
}





