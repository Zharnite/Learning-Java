
public class SortingAlgorithms {
	public static void selectionSort(int[] arr) {
		for(int pivot = 0; pivot < arr.length - 1; pivot++) {
			int lowPosition = pivot;
			for(int k = pivot + 1; k < arr.length; k++) {
				//checks if it's the lowest
				if(arr[k] < arr[lowPosition]) {
					//sets lowest
					lowPosition = k;
				}
				
			}
			//switches numbers
			int temp = arr[pivot];
			arr[pivot] = arr[lowPosition];
			arr[lowPosition] = temp;
			
		}
		
	}
	
	public static void selectionSort(String[] arr) {
		for(int pivot = 0; pivot < arr.length - 1; pivot++) {
			int lowPosition = pivot;
			for(int k = pivot + 1; k < arr.length; k++) {
				//checks if it's the lowest
				if(arr[k].compareTo(arr[lowPosition]) < 0) {
					//sets lowest
					lowPosition = k;
				}
				
			}
			//switches string
			String temp = arr[pivot];
			arr[pivot] = arr[lowPosition];
			arr[lowPosition] = temp;
			
		}
	}
	
	public static void printArr(int[] arr) {
		for(int num : arr) {
			System.out.print(num + ", ");
		}
		System.out.println();
	}
	
	public static void printArr(String[] arr) {
		for(String str : arr) {
			System.out.print(str + ", ");
		}
		System.out.println();
	}
}
